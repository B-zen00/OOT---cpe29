package week06.lab.lab2;

public class ElectricityBill {
    private String customerName;
    private int units;

    public ElectricityBill(String customerName,int units){
        this.customerName = customerName;
        this.units = units;
    }

    public double calculateAverage(){
        if (units <= 50){
            return units*2;
        }else if(units > 50 && units <= 100){
            return 100+(units-50)*3;
        }else{
            return 250+(units-100)*5;
        }
    }

    public void displayDetails(){
        System.out.println("customer Name: "+customerName);
        System.out.println("Units Consumed: "+units);
        System.out.printf("Total Bill: %.1f THB",calculateAverage());
    }
}
