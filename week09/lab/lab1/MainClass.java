package week09.lab.lab1;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(5.0, 10.0);

        System.out.println("Shape: " + circle.getname());
        System.out.println("Area: " + String.format("%.2f", circle.getArea()));

        System.out.println();

        System.out.println("Shape: " + rectangle.getname());
        System.out.println("Area: " + String.format("%.2f", rectangle.getArea()));
    }
}
