package week04.lecture;
import java.util.Scanner;

public class EXERCISE2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String ans;
        do{
            System.out.print("Enter the first and second numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.printf("The sum of %d and %d is %d",num1,num2,sum);
            System.out.printf("\nDo you want to perform the operation again? (yes/no): ");
            ans = sc.next();


        }while(ans.equalsIgnoreCase("yes"));
        sc.close();
    }
}
