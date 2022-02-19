import java.util.Scanner;
import java.lang.Math;

public class Exercise25 {
    public static void main(String[] args) {
        //Write a java program to convert a octal number to a decimal number 
        Scanner sc = new Scanner(System.in);
        int i = 0, place = 0;
        int decimal;
        int[] value = new int[100];
        int octal = 0;

        System.out.print("Enter octal number: ");
        decimal = sc.nextInt();

        while (decimal != 0) {
            value[i] = decimal % 10;
            decimal = decimal /10;
            octal = (int) (octal + value[i] * Math.pow(8,place));
            i++;
            place++;
        }

        System.out.println("The decimal number is: " + octal);
        
        sc.close();
    }
}