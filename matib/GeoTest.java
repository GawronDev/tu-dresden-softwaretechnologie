package matib;
import java.util.ArrayList;

public class GeoTest {
    public static void main(String[] args) {
         // Initialize the points and pass the arguments
        GeoPoint p1 = new GeoPoint(1.0, 1.0);
        BoundingBox p1_BoundingBox = p1.getBoundingBox();

        System.out.println("1. Erste Teil der Ausgabe");
        System.out.println("1. Punkt: " + p1.getX() + " , " + p1.getY());

        System.out.println("\t Der minimale Punkt der BBox liegt bei: (" + p1_BoundingBox.getMinPoint().getX() + " , " +  p1_BoundingBox.getMinPoint().getY() + ")");
        System.out.println("\t Der maximale Punkt der BBox liegt bei: (" + p1_BoundingBox.getMaxPoint().getX() + " , " +  p1_BoundingBox.getMaxPoint().getY() + ")");
        System.out.println("\t Die Breite der BBox ist: " + p1_BoundingBox.getWidth());
        System.out.println("\t Die Hohe der BBox ist: " + p1_BoundingBox.getHeight());

        GeoPoint p2 = new GeoPoint(1.0, 3.0);
        GeoPoint p3 = new GeoPoint(3.0, 3.0);
        GeoPoint p4 = new GeoPoint(3.0, 1.0);
        System.out.println("2. Punkt: " + p2.getX() + " , " + p2.getY());
        System.out.println("3. Punkt: " + p3.getX() + " , " + p3.getY());
        System.out.println("4. Punkt: " + p4.getX() + " , " + p4.getY());
        
        System.out.println("\n-----------------------");

        System.out.println("2. Teil der Ausgabe");
        ArrayList<GeoPoint> points = new ArrayList<>();
        points.add(0, p1);
        points.add(1, p2);
        points.add(2, p3);
        points.add(3, p4);

        GeoPolyline polyline1 = new GeoPolyline(points, "Polylinie 1");
        System.out.println("Die Polylinie heisst: " + polyline1.getName());
        System.out.println("\t Laenge: " + polyline1.getLineLength());
        System.out.println("\t Anzahl der Stutzpunkte: " + polyline1.getNumberOfPoints());

        BoundingBox polyline_BoundingBox = polyline1.getBoundingBox();

        System.out.println("\t Der minimale Punkt der BBox liegt bei: (" + polyline_BoundingBox.getMinPoint().getX() + " , " +  polyline_BoundingBox.getMinPoint().getY() + ")");
        System.out.println("\t Der maximale Punkt der BBox liegt bei: (" + polyline_BoundingBox.getMaxPoint().getX() + " , " +  polyline_BoundingBox.getMaxPoint().getY() + ")");
        System.out.println("\t Die Breite der BBox ist: " + polyline_BoundingBox.getWidth());
        System.out.println("\t Die Hohe der BBox ist: " + polyline_BoundingBox.getHeight());


        GeoPolygon polygon1 = new GeoPolygon(points, "Polygon 1");
        System.out.println("\n Das Polygon heisst: " + polygon1.getName());
        System.out.println("\t Laenge: " + polygon1.getCircumferenceLength());
        System.out.println("\t Anzahl der Stutzpunkte: " + polygon1.getNumberOfPoints());

        BoundingBox polygon_BoundingBox = polygon1.getBoundingBox();

        System.out.println("\t Der minimale Punkt der BBox liegt bei: (" + polygon_BoundingBox.getMinPoint().getX() + " , " +  polygon_BoundingBox.getMinPoint().getY() + ")");
        System.out.println("\t Der maximale Punkt der BBox liegt bei: (" + polygon_BoundingBox.getMaxPoint().getX() + " , " +  polygon_BoundingBox.getMaxPoint().getY() + ")");
        System.out.println("\t Die Breite der BBox ist: " + polygon_BoundingBox.getWidth());
        System.out.println("\t Die Hohe der BBox ist: " + polygon_BoundingBox.getHeight());

        System.out.println("\n-----------------------");

        System.out.println("3. Teil der Ausgabe");

        GeoPoint p5 = new GeoPoint(2.0, 2.0);
        System.out.println("Der 5. Punkt hat die Koordinaten: " + p5.getX() + " , " +  p5.getY());
        
        polyline1.addGeoPoint(p5);

        System.out.println("\tNach dem Einfugen hat die Polylinie die Laenge: " + polyline1.getLineLength());
        System.out.println("\tAnzahl der Stutzpunkte nach dem Einfugen: " + polyline1.getNumberOfPoints());

        polyline_BoundingBox = polyline1.getBoundingBox();

        System.out.println("\t Der minimale Punkt der BBox liegt bei: (" + polyline_BoundingBox.getMinPoint().getX() + " , " +  polyline_BoundingBox.getMinPoint().getY() + ")");
        System.out.println("\t Der maximale Punkt der BBox liegt bei: (" + polyline_BoundingBox.getMaxPoint().getX() + " , " +  polyline_BoundingBox.getMaxPoint().getY() + ")");
        System.out.println("\t Die Breite der BBox ist: " + polyline_BoundingBox.getWidth());
        System.out.println("\t Die Hohe der BBox ist: " + polyline_BoundingBox.getHeight());

        polygon1.addGeoPoint(p5);
        System.out.println("\n\tNach dem Einfugen hat das Polygon den Umfang: " + polygon1.getCircumferenceLength());
        System.out.println("\tAnzahl der Stutzpunkte nach dem Einfugen: " + polygon1.getNumberOfPoints());

        polygon_BoundingBox = polygon1.getBoundingBox();

        System.out.println("\t Der minimale Punkt der BBox liegt bei: (" + polygon_BoundingBox.getMinPoint().getX() + " , " +  polygon_BoundingBox.getMinPoint().getY() + ")");
        System.out.println("\t Der maximale Punkt der BBox liegt bei: (" + polygon_BoundingBox.getMaxPoint().getX() + " , " +  polygon_BoundingBox.getMaxPoint().getY() + ")");
        System.out.println("\t Die Breite der BBox ist: " + polygon_BoundingBox.getWidth());
        System.out.println("\t Die Hohe der BBox ist: " + polygon_BoundingBox.getHeight());
    }
}
