package week09.lab.lab1;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    } 
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
