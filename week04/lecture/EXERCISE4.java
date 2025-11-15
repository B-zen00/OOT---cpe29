package week04.lecture;
import java.util.Arrays;
public class EXERCISE4 {
    public static void main(String[] args){
        int[] num = {12,17,14,15,16,89,23,1,9,100};
        Arrays.sort(num);
        System.out.printf("The secord largest number is: %d",num[num.length-2]);
    }
}
