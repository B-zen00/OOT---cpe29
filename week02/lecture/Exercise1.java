package lecture;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : "); 
        String name = input.nextLine();
        System.out.print("Enter your age : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your major : ");
        String major = input.nextLine();
        System.out.print("Enter your GPA : ");
        float gpa = input.nextFloat();
        input.close();
        System.out.printf("Name : %s\nAge : %d\nMAjor : %s\nGPA : %.2f\n",name,age,major,gpa);
    }
}
