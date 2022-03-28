package week_8;
//reading  10 number from console and print sum of these numbere

import java.util.Scanner;

public class ReadingUserInputChallenge1 {

    public boolean method1() {
        Scanner obj = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            //check if entered number is int or not
            boolean number = obj.hasNextInt();
            //if int then sum of  value
            if (number) {
                int a = obj.nextInt();
                sum = sum + a;
                count++;
            } else {
                System.out.println("invalid  number");
            }
        }
        System.out.println("sum of all number=" + sum);
        return false;
    }

    public static void main(String[] args) {
        ReadingUserInputChallenge1 obj1 = new ReadingUserInputChallenge1();
        obj1.method1();
    }
}


