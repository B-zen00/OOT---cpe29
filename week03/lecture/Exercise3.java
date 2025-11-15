package week03.lecture;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.printf("%d is an even number.\n",num);
            if(num%4 == 0){
                System.out.printf("%d is divisible by 4.\n",num);
            }else{
                System.out.printf("%d is not divisible by 4.\n",num);
            }
        }else{
            System.out.printf("%d is an odd number.\n",num);
        }
        input.close();
    }
    
}
