package week_8;

import java.util.Scanner;

//program for getting fibonacci number 1,2,3,5,8,13,21
public class FibonacciNumber9 {
    public void method1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number :");
        int n1 = obj.nextInt();
        System.out.println("Enter second number :");
        int n2 = obj.nextInt();
        System.out.print(n1 + " " + n2);
        int sum ;
        //using for loop for getting fibonacci  number
        for (int i = 2; i < 9; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }
    }

    public static void main(String[] args) {
        FibonacciNumber9 obj1 = new FibonacciNumber9();
        obj1.method1();
    }
}