package matib;
import java.util.ArrayList;

public class GeoPolygon implements Geometry{
    private ArrayList<GeoPoint> line_points;
    private GeoUtil geoutil = new GeoUtil();
    private String name = "";

    public GeoPolygon(ArrayList<GeoPoint> points, String name){
        line_points = points;
        setName(name);
    }

    public double getCircumferenceLength(){
        double length = 0;
        int index = 0;

        while(index < line_points.size() - 1){
            length = length + geoutil.getDistance(line_points.get(index), line_points.get(index + 1));
            index++;
        }
        if(line_points.size() > 0){
            length = length + geoutil.getDistance(line_points.get(0), line_points.get(line_points.size() - 1));
        }
        return length;
    } 

    public void addGeoPoint(GeoPoint point){
        line_points.add(line_points.size() - 1, point);
    }

    public void addGeoPoint(GeoPoint point, int x){
        line_points.add(x, point);
    }

    public int getNumberOfPoints(){
        return line_points.size();
    }

    public void setName(String newName){
        name = newName;
    }

    public BoundingBox getBoundingBox(){
        BoundingBox bb = new BoundingBox(line_points);
        return bb;
    }

    public String getName(){
        return name;
    }
}