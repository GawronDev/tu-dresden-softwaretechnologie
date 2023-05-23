package matib;
import java.util.LinkedList;

public class GeoTest {
    public static void main(String[] args) {
        Station station1 = new Station(1.0, 1.0, "Station 1", 1.0);
        Station station2 = new Station(3.0, 3.0, "Station 2", 3.5);
        Station station3 = new Station(0.5, 0.5, "Station 3", 0.5);
        Station station4 = new Station(1.3, 2.2, "Station 4", 2.6);

        LinkedList<Station> stations = new LinkedList<Station>();

        stations.add(station1);
        stations.add(station2);
        stations.add(station3);
        stations.add(station4);


        GeoPoint originPoint = new GeoPoint(0, 0);

        GeoRaster2D georaster = new GeoRaster2D(originPoint, 1, 4, 5);

        IDW idw = new IDW(georaster);

        idw.setStations(stations);

        idw.calculateIDW();

        for(int r = 0; r < georaster.getData().rows(); r++){
            for(int c = 0; c < georaster.getData().columns(); c++){
                System.out.print(georaster.getData().getValue(r, c));
                System.out.print("    ");
            }
            System.out.println("");
        }
    


    }
}
