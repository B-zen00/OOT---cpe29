package week09.lab.lab2;

public class Food implements Taxable{
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public double calculateTax(){
        return 0.07 * price;
    }
    @Override
    public double calculateTotalPrice(){
        return price + calculateTax();
    }
    
}
