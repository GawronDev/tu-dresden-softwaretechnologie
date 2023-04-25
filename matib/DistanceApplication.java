package matib;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DistanceApplication {
    public static void main(String[] args) {

        // Initiate the utility module
        GeoUtil geoUtil = new GeoUtil();
        // Initialize the points and pass the arguments
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 4);
        Point p3 = new Point(1, 2);
        Point p4 = new Point(10, 3);

        // Define the points array
        ArrayList<Point> points = new ArrayList<Point>();
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
