package week05.lab.lab4;
import java.util.Scanner;

public class ShapeArea {
    public double calculateArea(int choice,double num1,double num2){
        if(choice ==1){
            return num1 * num2;
        }else{
            return Math.PI * num1 * num2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeArea shapearea = new ShapeArea();
        System.out.println("Choose the shape to calculate the area:\r");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.println("The area is: "+ shapearea.calculateArea(choice,length,width));
        }else if(choice == 2){
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            System.out.print("The area is: "+ shapearea.calculateArea(choice,radius,radius));
        }else{
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
