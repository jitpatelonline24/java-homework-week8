package java_week8_homework;

public class Programme_16_Point {
    int x;
    int y;

    public Programme_16_Point() {
        this.x = 0;
        this.y = 0;
    }

    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return Math.sqrt((x * x + y * y));
    }

    public double distance(int x1, int y1) {
        int x2 = this.x - x1;
        int y2 = this.y - y1;
        return Math.sqrt(x2 * x2 + y2 * y2);
    }

    public double distance(Programme_16_Point point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
    }

    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("Distance()= " + point.distance());

    }
}
