package matib;
import java.util.ArrayList;

public class BoundingBox {
    public GeoPoint smallestPoint = new GeoPoint(0, 0);
    public GeoPoint largestPoint = new GeoPoint(0, 0);


    public BoundingBox(ArrayList<GeoPoint> points) {
        // Constructor 
        createBoundingBox(points);
    }

    private void createBoundingBox(ArrayList<GeoPoint> points){
        // Creates two edge points that span a bounding box 
        double minX = points.get(0).getX();
        double maxX = points.get(0).getX();
        
        double maxY = points.get(0).getY();
        double minY = points.get(0).getY();

        for(int i = 0; i < points.size(); i++){
            // Find the biggest and the smallest coordinates to create the bounds of the box
            if(maxX < points.get(i).getX()){
                maxX = points.get(i).getX();
            }
            if(minX > points.get(i).getX()){
                minX = points.get(i).getX();
            }
            
            if(maxY < points.get(i).getY()){
                maxY = points.get(i).getY();
            }
            if(minY > points.get(i).getY()){
                minY = points.get(i).getY();
            }
        }

        this.smallestPoint = new GeoPoint(minX, minY);
        this.largestPoint = new GeoPoint(maxX, maxY);
    }

    public GeoPoint getMaxPoint(){
        // Returns max point
        return this.largestPoint;
    }

    public GeoPoint getMinPoint(){
        // Return min point
        return this.smallestPoint;
    }

    public double getWidth(){
        // Returns the width of the bounding box
        return GeoUtil.getDistance(this.smallestPoint, new GeoPoint(this.largestPoint.getX(), this.smallestPoint.getY()));
    }

    public double getHeight(){
        // Returns the height of the bounding box
        return GeoUtil.getDistance(this.smallestPoint, new GeoPoint(this.smallestPoint.getX(), this.largestPoint.getY()));
    }
}