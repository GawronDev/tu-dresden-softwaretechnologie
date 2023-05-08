package matib;
import java.util.ArrayList;

public class GeoPoint implements Geometry {

    // Initate two variables for storing the coordiante values
    private double x;
            double y;

    // Constructor of the class asigning parameters to class variables
    public GeoPoint(double xln, double yln){
        x = xln;
        y = yln;
    }

    // Function that returns X
    public double getX(){
        return this.x;
    }
    // Function that return Y
    public  double getY(){
        return y;
    }

    // Function that sets X to a given parameter
    public void setX(double xln){
        x = xln;
    }
    // Function that sets the Y value
    public void setY(double yln){
        y = yln;
    }

    public BoundingBox getBoundingBox(){
        ArrayList<GeoPoint> points = new ArrayList<>();
        points.add(0, this);
        BoundingBox bb = new BoundingBox(points);
        return bb;
    }
}
