package week04.lecture;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number : ");
        int num = input.nextInt();
        System.out.printf("Your number is = %d .",num);
        input.close();
    }
}
