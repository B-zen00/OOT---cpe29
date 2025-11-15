package week04.lecture;
import java.util.Scanner;
public class EXERCISE1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while (num != 0) {
            if(num > 0){
                System.out.printf("%d is positive.\n",num);
            }else{
                System.out.printf("%d is negative.\n",num);  
            }
            System.out.print("Enter a number: ");
            num = sc.nextInt();
        }
        System.out.print("Program exited. ");
        sc.close();
    }
}
