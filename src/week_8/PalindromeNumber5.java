package week_8;

import java.util.Scanner;

public class PalindromeNumber5 {
    //method retrun boolean data type with one parameter
    public static boolean isPolindrome(int num) {
        int realnumber = num;
        int rev = 0;
        boolean result = false;

        while (num != 0) {//reversing the integer value
            rev = rev * 10 + num % 10;
            num = num / 10;
            if (realnumber == rev)
                result = true;}

            System.out.println("reverse number :" + rev +" "+result);


        return false;


    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = obj.nextInt();
        isPolindrome(num);

    }
}
