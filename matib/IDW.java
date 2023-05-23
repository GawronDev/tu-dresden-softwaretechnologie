package matib;
import java.util.LinkedList;
import java.lang.Math;

public class IDW {
    private LinkedList<Station> stations;
    private GeoRaster2D geoRaster2D;

    public IDW(){};

    public IDW(GeoRaster2D geoRaster){
        this.geoRaster2D = geoRaster;
    }

    public void setStations(LinkedList<Station> stations){
        this.stations = stations;
    }

    public void setGeoRaster2D(GeoPoint origin, double cellSize, int rows, int columns){
        this.geoRaster2D = new GeoRaster2D(origin, cellSize, rows, columns);
    }

    public void calculateIDW(){
        GeoUtil geoutil = new GeoUtil();
        double cellcenter_x;
        double cellcenter_y;
        double distance;
        for(int r = 0; r < geoRaster2D.getData().rows(); r++){
            cellcenter_y = (geoRaster2D.origin().getY() + geoRaster2D.getData().rows())  - (r+0.5) * geoRaster2D.cellSize();
            for(int c = 0; c < geoRaster2D.getData().columns(); c++){
                cellcenter_x = (c+0.5)*geoRaster2D.cellSize() + (geoRaster2D.origin().getX());
                double numerator = 0.0;
                double denominator = 0.0;

                for(int s = 0; s < this.stations.size(); s++){
                    distance = Math.abs(geoutil.getDistance(new GeoPoint(cellcenter_x, cellcenter_y), this.stations.get(s).getLocation()));
                    distance = Math.max(distance, 0.001*geoRaster2D.cellSize());

                    numerator += this.stations.get(s).getValue() / distance;
                    denominator += 1.0 / distance;
                }

                if(denominator != 0){
                    geoRaster2D.getData().setValue(r, c, numerator/denominator);
                } else {
                    geoRaster2D.getData().setValue(r, c, 0);
                }
            }
        }
    }

    public GeoRaster2D getGeoRaster2D(){
        return this.geoRaster2D;
    }

}
