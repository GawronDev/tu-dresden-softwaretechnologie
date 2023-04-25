package matib;
import java.util.ArrayList;

public class BoundingBox {
    public Point smallestPoint = new Point(0, 0);
    public Point largestPoint = new Point(0, 0);


    public BoundingBox(ArrayList<Point> points) {
        createBoundingBox(points);
    }

    private void createBoundingBox(ArrayList<Point> points){
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

        System.out.println(maxX);
        System.out.println(minX);
        System.out.println(maxY);
        System.out.println(minY);

        this.smallestPoint = new Point(minX, minY);
        this.largestPoint = new Point(maxX, maxY);
    }

    public Point getMaxPoint(){
        return this.largestPoint;
    }

    public Point getMinPoint(){
        return this.smallestPoint;
    }
}