public class Point {

    private double x = 0.00;
    private double y = 0.00;
    private double z = 0.00;


    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println("> P( "+x+", "+y+", "+z+" )");
    }

    public double distance(Point aPoint) {
        double distance = Math.sqrt( (Math.pow(x - aPoint.getX(), 2)) + (Math.pow(y - aPoint.getY(), 2)) + (Math.pow(z - aPoint.getZ(), 2)) );
        return distance;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
