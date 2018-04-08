package lib;

import java.util.List;
import java.util.ArrayList;


public class ShapeContainer {
    private List<Shape> shapesList;
    
    public ShapeContainer(){
        shapesList = new ArrayList<>();
    }
    
    public ShapeContainer(List<Shape> shapes){
        shapesList = new ArrayList<>(shapes);
    }
    
    public void add(Shape s){
        shapesList.add(s);
    }
    
    public void showPerimeters(){
        for(Shape s : shapesList){
            System.out.println("Perimeter of " + s.getName() + ": " + s.perimeter());
        }
    }
    
    public void showAreas(){
        for(Shape s : shapesList){
            System.out.println("Area of " + s.getName()+ ": " + s.area());
        }
    }
}
