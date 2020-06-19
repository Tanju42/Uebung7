import java.text.DecimalFormat;
import java.util.Scanner;

public class Geometry {

    Scanner kbdInput = new Scanner(System.in);
    public static void main(String[] args) {
        Geometry geoManager = new Geometry();
        geoManager.run();
    }

    private void run() {
        System.out.println("Calculate distance (d), area (a) or quit (q)?");
        System.out.print("Art: ");
        String art = kbdInput.next();
        while (!(art.equals("d") || art.equals("a") || art.equals("q"))) {
            System.out.println("Key "+art+" not allowed!");
            System.out.print("Art: ");
            art = kbdInput.next();
        }
        switch(art) {
            case "q":
                System.out.println("> Exiting...");
                return;

            case "d":
                System.out.println("> Distance between two points");
                System.out.println(" ");
                Point a = readPoint();
                System.out.println(" ");
                Point b = readPoint();
                System.out.println(" ");
                a.print();
                b.print();
                System.out.println(" ");
                double distance = b.distance(a);
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Distance: "+df.format(distance));
                return;

            case "a":
                System.out.println("> Area between three points");
                System.out.println(" ");
                Point point1 = readPoint();
                System.out.println(" ");
                Point point2 = readPoint();
                System.out.println(" ");
                Point point3 = readPoint();
                System.out.println(" ");
                point1.print();
                point2.print();
                point3.print();
                System.out.println(" ");
                Triangle ad = new Triangle(point1, point2, point3);
                ad.getArea();
        }
    }

    private Point readPoint() {
        System.out.println("Input point");
        return new Point(getCoordinate("X"), getCoordinate("Y"), getCoordinate("Z"));
    }

    private double getCoordinate(String coorName) {
        System.out.print(coorName+"-coordinate: ");
        return kbdInput.nextDouble();
    }
}
