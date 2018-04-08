package lib;

public class Rectangle extends Shape {
    protected double width;
    protected double height;
    
    public Rectangle(String name, double height, double width){
        super(name);
        this.height = height;
        this.width = width;
        System.out.println("Constructor Rectangle " + name);
    }
    
    @Override
    public double area() {

        return width*height;
    }

    @Override
    public double perimeter() {

        return 2*height + 2*width;
    }
}
