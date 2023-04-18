import java.util.Date;

public abstract class Geometric0bject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected Geometric0bject() {
        dateCreated = new java.util.Date();
    }

    protected Geometric0bject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isfilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + "and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}