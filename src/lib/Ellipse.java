package lib;

public class Ellipse extends Shape {
    private double a;
    private double b;
    
    public Ellipse(String name, double a, double b){
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {

        return Math.PI*a*b;
    }

    @Override
    public double perimeter() {

        return Math.PI*((3/2)*(a+b) - Math.sqrt(a*b));
    }
}
