package week_8;
import java.util.Scanner;
//finding maximum and minimum number from provided numbers
public class MinAndMaxInputChallenge2 {
    public static void method1(int[] a) {
        int max = 0;
        int min = 0;
        int i = 0;
        //using while method for finding maximum number and minimum number
        while (i < a.length) {
            if (i == 0)
                max = min = a[i];
            else if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min)
                min = a[i];
            i++;}
        System.out.println("this is maximum numnber:" + max);
            System.out.println("this is minimum numnber:" + min);
        }
        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of aray ");
        int sizeOfArray = obj.nextInt();
        //using if statment for giving size of array to console
        if (sizeOfArray < 0)
            System.out.println("invalid  number");
        else {
            int a[] = new int[sizeOfArray];
            int i = 0;
            while (i < a.length) {
                System.out.println("please enter number" + (i + 1) + " : ");
                a[i] = obj.nextInt();
                i++;}

             method1(a);

            }
        }
    }

