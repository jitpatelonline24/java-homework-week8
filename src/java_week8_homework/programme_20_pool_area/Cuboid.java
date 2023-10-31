package java_week8_homework.programme_20_pool_area;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }
    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;

    }
}
