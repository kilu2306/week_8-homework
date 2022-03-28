package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting value of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        //displaying value of the variables
        System.out.println("prime's name  : " + obj.getName());
        System.out.println("prime's age :" + obj.getAge());
        System.out.println("prime;s roll no: " + obj.getRollNo());

        //direct access or roll no is  not possible due to encapsulation

    }
}

