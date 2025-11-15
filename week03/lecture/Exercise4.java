package week03.lecture;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter secpnd number: ");
        int num2 = input.nextInt();
        System.out.print("Enter operator (+, -, *, /):");
        char operator = input.next().charAt(0);
        input.close();
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %.1f",num1,num2,(float)(num1+num2));
                break;
            case '-':
                System.out.printf("%d - %d = %.1f",num1,num2,(float)(num1-num2));
                break;
            case '*':
                System.out.printf("%d * %d = %.1f",num1,num2,(float)(num1*num2));
                break;
            case '/':
                if(num2 != 0){
                    System.out.printf("%d / %d = %.1f",num1,num2,(float)(num1+num2));
                }else{
                    System.out.print("Error: Division by zero is not allowed.");
                }
                break;
        }

    }
} 
