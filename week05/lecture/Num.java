package week05.lecture;
import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        Num n = new Num();
        System.out.printf("The absolute value of %d is: %d",num,n.getADsValue(num));
        sc.close();
    }
    int getADsValue(int num){
        return Math.abs(num);
    }
}
