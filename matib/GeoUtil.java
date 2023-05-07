package matib;

// Importing Java Math library
import java.lang.Math;

public class GeoUtil {
    // Two points as parameters
    public static double getDistance(GeoPoint p1, GeoPoint p2) {
        double distance = 0;

        // Calculation of the distance based on the equation to calculate the distance between two points on a plain
        distance = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        return distance;
    }
}
