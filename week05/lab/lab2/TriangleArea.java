package week05.lab.lab2;

import java.util.Scanner;

public class TriangleArea {
    public double calculateArea(double base,double height){
        return 0.5 * base * height;
    }

    public void displayArea(double base,double height){
        double area = calculateArea(base, height);
            System.out.println("The area of the triangle with base " + base + " and height " + height + "is: " +area);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleArea triangle = new TriangleArea();

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        triangle.displayArea(base, height);
        scanner.close();
    }
}
