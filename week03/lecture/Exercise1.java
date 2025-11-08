package week03.lecture;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your budget = ");
        int budget = input.nextInt();
        if(budget >= 15000) {
            System.out.printf("Your budget = %,d,you can buy it.",budget);
        }
        input.close();
    }
}
