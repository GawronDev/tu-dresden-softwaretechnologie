package matib;
import java.util.ArrayList;

public class DistanceApplication {
    public static void main(String[] args) {

        // Initiate the utility module
        GeoUtil geoUtil = new GeoUtil();
        // Initialize the points and pass the arguments
        GeoPoint p1 = new GeoPoint(1, 0);
        GeoPoint p2 = new GeoPoint(5, 0);
        GeoPoint p3 = new GeoPoint(1, 0);
        GeoPoint p4 = new GeoPoint(10, 0);

        // Define the points array
        ArrayList<GeoPoint> points = new ArrayList<GeoPoint>();
        points.add(0, p1);
        points.add(1, p2);
        points.add(2, p3);
        points.add(3, p4);
        
        GeoPolyline line = new GeoPolyline(points);

        System.out.println("To jest dlugosc lini");
        System.out.println(line.getLineLength());

    }
}
