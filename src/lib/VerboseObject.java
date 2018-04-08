package lib;


public class VerboseObject {
    private String name;
    
    public VerboseObject(String name){
        this.name = name;
        System.out.println("Constructor: " + name);
    }
    
    public void finalize(){
        System.out.println("Destructor of: " + name);
    }
    
    public void saySomething(){
        System.out.println("saySomething " + name);
    }
}
