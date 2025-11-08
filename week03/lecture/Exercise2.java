package week03.lecture;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Input your budget = ");
        int budget = input.nextInt();
        if( 0 < budget && budget <= 500 ){
           System.out.printf("your budget = %,d ,you can buy Keyboard.",budget); 
        }else if( 500 < budget && budget <= 1000 ){
           System.out.printf("your budget = %,d ,you can buy Mouse.",budget); 
        }else if( 1000 < budget && budget <= 2000 ){
           System.out.printf("your budget = %,d ,you can buy Router.",budget); 
        }else if( 2000 < budget && budget <= 10000 ){
           System.out.printf("your budget = %,d ,you can buy Monitor.",budget); 
        }else{
            System.out.printf("your budget = %,d ,you can buy Graphic Card.",budget); 
        }
        input.close();
    }
}
