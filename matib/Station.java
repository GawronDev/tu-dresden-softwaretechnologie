package matib;

public class Station {
    private String name;
    private double value;
    private GeoPoint location;

    public Station(double x, double y, String name, double value){
        this.name = name;
        this.value = value;
        GeoPoint newPoint = new GeoPoint(x, y);
        this.location = newPoint;
    }

    public double getValue(){
        return this.value;
    }

    public GeoPoint getLocation(){
        return location;
    }
}