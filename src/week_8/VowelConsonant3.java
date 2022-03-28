package week_8;

import java.util.Scanner;

public class VowelConsonant3 {
    public void method1() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = obj.next().charAt(0);
        //to checking if alphabet is vowel or consonant by using if statment

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + "  is a vowel");
        }
        else if((ch>'a'&& ch<'z')||(ch>'A'&& ch<'Z')){
            System.out.println(ch + "  is a consonant");}
         else {System.out.println("its invalid data");}
    }
    public static void main(String[] args) {
        VowelConsonant3 obj1 = new VowelConsonant3();
        obj1.method1();
    }

}

