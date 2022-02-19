import java.util.Scanner;

public class Exercise32{
    public static void main(String[] args) {
        //Write a program that compare 2 numbers
        Scanner sc = new Scanner(System.in);
        int num1,num2;

        System.out.print("Input first integer: ");
        num1 = sc.nextInt();
        System.out.print("Inpit second integer: ");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " == " + num2);
        } else {
            System.out.println(num1 + " != " + num2);
        }

        if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " > " + num2);
        }

        if (num1 <= num2) {
            System.out.println(num1 + " <= " + num2);
        } else {
            System.out.println(num1 + " >= " + num2);
        }
        


    }
}