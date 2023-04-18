public class App {
    public static void main(String[] args) {
        Geometric0bject g1 = new Circle(5);
        Geometric0bject g2 = new Rectangle(5, 3);
        System.out.println("the two objects have the same area? ");
        equalArea(g2, g2);
        displayGeometric0bject(g1);
        displayGeometric0bject(g2);
    }

    public static boolean equalArea(Geometric0bject object1, Geometric0bject object2) {
        return object1.getArea == object2.getArea;
    }

    public static void displayGeometric0bject(Geometric0bject object) {
        System.out.println();
        System.out.println("the area is " + object.area());
        System.out.println("the perimeter is " + object.getPerimeter());
    }
}
