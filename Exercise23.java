import java.util.Scanner;
import java.lang.Math;

public class Exercise23{
    public static void main(String[] args) {
        // Write a program to convert a binday number to a decimal number 
        // Note 1010 1111 % 10000 = 1111 AKA the last 4 digts 
        // Note 1010 1111 / 10000 = 1010 the beging 4 digits 
        Scanner sc = new Scanner(System.in);
        int i = 0, place = 0, rem, binaryNum;
        int[] decimal = new int[1000];
        int decValue =  0;
        char[] hexv = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexdecNum = "";
        
        System.out.print("Enter binary number: ");
        binaryNum = sc.nextInt();

        while (binaryNum != 0) {
            decimal[i] = (int)(((binaryNum % 10) % 2) * Math.pow(2, place));
            binaryNum = binaryNum / 10;
            decValue = decValue + decimal[i];
            place++;
            i++;
        }

        System.out.println("The decimal is: " + decValue);

        // Add code to connver decimal to hex below 
        while (decValue != 0) {
            rem = decValue % 16;
            hexdecNum = hexv[rem] + hexdecNum;
            decValue = decValue/16;
        }
        
        System.out.println("Hexadecimal number is: " + hexdecNum);
        sc.close();
    }
}