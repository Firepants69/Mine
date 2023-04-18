public class Rectangle extends Geometric0bject {
    private double widht;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double widht, double height) {
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return widht * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (widht + height);
    }

    @Override
    public String toString() {
        return super.toString() + " width " + widht
                + "height" + height;
    }
}
