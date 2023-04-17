package matib;

public class DistanceApplication {
    public static void main(String[] args) {

        // Initiate the utility module
        GeoUtil geoUtil = new GeoUtil();

        // Initialize the points and pass the arguments
        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 4);

        // First point
        System.out.println("Point 1 X: " + Double.toString(p1.getX())); 
        System.out.println("Point 1 Y: " + Double.toString(p1.getY())); 

        // Second point
        System.out.println("Point 2 X: " + Double.toString(p2.getX())); 
        System.out.println("Point 2 Y: " + Double.toString(p2.getY())); 

        // Calculate distance
        double distance = GeoUtil.getDistance(p1, p2);

        System.out.println(distance);

    }
}
