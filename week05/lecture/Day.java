package week05.lecture;
import java.util.Scanner;

public class Day {
    static String getDay(int daynumber){
        switch (daynumber) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wedneesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default : return "Invalid ";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number (1-7): ");
        int num = sc.nextInt();
        String day = Day.getDay(num);
        System.out.printf("The day corresponding to %d is %s\n",num,day);
        sc.close();
    }

}
