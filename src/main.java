import lib.BinomialSolver;
import lib.VerboseObject;
import lib.Shape;
import lib.Square;
import lib.Rectangle;
import lib.Ellipse;
import lib.Circle;
import lib.ShapeContainer;


public class main {

    public static void main(String[] args) {

        example1();
        example2();
        example3();
        example4();
        example5();
    }


    //example of using BinomialSolver class
    public static void example1() {
        BinomialSolver bs = new BinomialSolver(1.0, 2.0, 1.0);
        System.out.println("x1 = " + bs.getX1());
        System.out.println("x2 = " + bs.getX2());

        System.out.println("Value of given binomial for x=2 is " + bs.calculate(2));
    }


    //example of using VerboseObject class

    public static void example2() {
        VerboseObject o1 = new VerboseObject("Object 1");
        o1.saySomething();
    }

    //example of using Shape,Square and Rectangle classes
    public static void example3(){

        Rectangle rec= new Rectangle("Rectangle1", 4.0, 6.0);
        Square sq = new Square("Square1", 4.0);

        System.out.println("Object: " + sq.getName() + " Area: " + sq.area() + " Perimeter: " + sq.perimeter());
        System.out.println("Object: " + rec.getName() + " Area: " + rec.area() + " Perimeter: " + rec.perimeter());

        //example of projection
        Shape sh1 = rec;
        Rectangle rec2 = sq;
        Shape sh2 = rec2;
        Shape sh3 = sq;

        System.out.println("Object: " + sh1.getName() + " Area: " + sh1.area() + " Perimeter: " + sh1.perimeter());
        System.out.println("Object: " + rec2.getName() + " Area: " + rec2.area() + " Perimeter: " + rec.perimeter());
        System.out.println("Object: " + sh3.getName() + " Area: " + sh3.area() + " Perimeter: " + sh3.perimeter());

    }

    //example of using ShapeContainer class
    public static void example4(){
        Square s1 = new Square("Square1", 15.85);
        Rectangle r1 = new Rectangle("Rectangle1", 14.78, 19.87);
        Square s2 = new Square("Square2", 25.85);
        Rectangle r2 = new Rectangle("Rectangle2", 24.78, 29.87);
        Square s3 = new Square("Square3", 35.85);
        Rectangle r3 = new Rectangle("Rectangle3", 34.78, 39.87);

        ShapeContainer sc = new ShapeContainer();

        sc.add(s1);
        sc.add(r1);
        sc.add(s2);
        sc.add(r2);
        sc.add(s3);
        sc.add(r3);

        System.out.println("Areas:");
        sc.showAreas();

        System.out.println("Perimeters:");
        sc.showPerimeters();
    }

    //example of using Circle and Ellipse classes
    public static void example5(){
        Circle c = new Circle("Circle", 5.6);
        Ellipse e = new Ellipse("Ellipse", 4.8, 8.7);

        System.out.println(c.getName() + ": Perimeter: " + c.perimeter() + ", Area: " + c.area());
        System.out.println(e.getName() + ": Perimeter: " + e.perimeter() + ", Area: " + e.area());
    }
}