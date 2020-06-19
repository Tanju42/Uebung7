import java.text.DecimalFormat;

public class Triangle {

    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public void getArea() {
        double a = point2.distance(point1);
        double b = point3.distance(point2);
        double c = point1.distance(point3);
        double s = ((a + b + c) / 2);
        double f = Math.sqrt( s * (s - a) * (s - b) * (s - c) );
        double area = f;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Area: "+df.format(area));
    }
}
