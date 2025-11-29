package week06.lab.lab2;

public class Main {
    public static void main(String[] args) {
        ElectricityBill cusumed1 = new ElectricityBill("Alice", 40);
        ElectricityBill cusumed2 = new ElectricityBill("Bob", 120);

        cusumed1.displayDetails();
        System.out.println("\n------------------------");
        cusumed2.displayDetails();
    }
}
