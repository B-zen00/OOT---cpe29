package week04.lecture;
import java.util.Scanner;
public class EXERCISE3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.printf("The factorial of 0 is 1");
        }else if(num>0){
            int Factorial = 1;
            for(int i = 1; i<=num; i++){
                Factorial = Factorial*i;
            }
            System.out.printf("The factorial of %d is %d",num,Factorial);
        }else{
            System.out.println("Factorial is not defined for negative numbers.");
        }
        sc.close();
    }
}
