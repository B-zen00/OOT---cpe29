package week04.lecture;

public class EXERCISE5 {
    public static void main (String[] args){
        int[][] num = {{10,20,30},{40,50,60},{70,80,90}};
        for (int i = 0; i < num.length; i++){
            int sum = 0;
            for (int j = 0;j < num[i].length; j++){
                sum += num[i][j];
            }
            System.out.printf("Summation of row %d is %d\n",i,sum);
        }
    }
}
