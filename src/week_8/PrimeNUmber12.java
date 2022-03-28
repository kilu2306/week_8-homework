package week_8;

import java.util.Scanner;
/*programme to check if its prime number or not
condition: 1. nature number
           2. which can be devide by 1 or by it self
       for ex: ,3,5,7,9,..-its prime number
           */
public class PrimeNUmber12 {

    public static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num= input.nextInt();
        int count=0;
        //using if to check if condiotn one is matching
        if(num>1){
            //using for loop if number canbe divide by 1 or itself
            for( int i=1; i<=num;i++){
                if(num%i==0)
                    count++;}
             if(count==2){
                System.out.println("its prime number ");
            }else{
                System.out.println("Not a prime number");
            }}
else
            System.out.println("not a prime number");

    }

    public static void main(String[] args) {
        method1();
    }
}
