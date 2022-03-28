package methodoverriding24;

public class Test2 {
    public static void main(String[] args) {
        SBI s= new SBI();
        ICICI i = new ICICI();
        AXIS a= new AXIS();
        System.out.println("sbi rate of interest :"+ s.getRateOfInterest());
        System.out.println("Icici  rate of interest :"+i.getRateOfInterest());
        System.out.println("Axis rate of interest : "+ a.getRateOfInterest());
    }
}
