package lecture;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your nickname: ");
        String name = input.nextLine();
        System.out.print("Input your weight(kg.): ");
        Integer weight = input.nextInt();
        System.out.print("Input your height(m.): ");
        Float height = input.nextFloat();
        input.close();
        float bmi = weight/(height*height);
        System.out.printf("%s has BMI = %.3f\n",name,bmi);
    }
}