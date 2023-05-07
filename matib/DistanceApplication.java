package matib;
import java.util.ArrayList;

public class DistanceApplication {
    public static void main(String[] args) {

        // Initiate the utility module
        GeoUtil geoUtil = new GeoUtil();
        // Initialize the points and pass the arguments
        GeoPoint p1 = new GeoPoint(1, 1);
        GeoPoint p2 = new GeoPoint(5, 4);
        GeoPoint p3 = new GeoPoint(1, 2);
        GeoPoint p4 = new GeoPoint(10, 3);

        // Define the points array
        ArrayList<GeoPoint> points = new ArrayList<GeoPoint>();
        points.add(0, p1);
        points.add(1, p2);
        points.add(2, p3);
        points.add(3, p4);
        
        BoundingBox boundingBox = new BoundingBox(points);

        System.out.println(boundingBox.getWidth());
        System.out.println(boundingBox.getHeight());

        // First point
        System.out.println("Point 1 X: " + Double.toString(p1.getX())); 
        System.out.println("Point 1 Y: " + Double.toString(p1.getY())); 

        // Second point
        System.out.println("Point 2 X: " + Double.toString(p2.getX())); 
        System.out.println("Point 2 Y: " + Double.toString(p2.getY())); 

        // Calculate distance
        double distance = GeoUtil.getDistance(p1, p2);

    }
}
