package methodoverriding23;

public class Bike2 extends Vehicle{
    //defining the same method as in the parent class
    public void run(){
        System.out.println("bike is running safetly");

    }

    public static void main(String[] args) {
        Bike2 obj= new Bike2();
        obj.run();
    }
}
