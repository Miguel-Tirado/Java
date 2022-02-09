import java.util.Scanner;
import java.lang.Math;

public class Exercise24{
    public static void main(String[] args) {
        // Write a program to convert a binary number to a Octal number 
        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0, place = 0, binaryNum;
        int[] decimal = new int[1000];
        int decValue =  0;
        int[] value = new int[100];
        
        System.out.print("Enter binary number: ");
        binaryNum = sc.nextInt();

        while (binaryNum != 0) {
            decimal[i] = (int)(((binaryNum % 10) % 2) * Math.pow(2, place));
            binaryNum = binaryNum / 10;
            decValue = decValue + decimal[i];
            place++;
            i++;
        }

        while (decValue != 0) {
            value[j++] = decValue % 8;
            decValue = decValue / 8;
        }

        System.out.print("Octal number is: ");
        j--;
        while (j >= 0) {
            System.out.print(value[j--]);
        } 

        sc.close();

    }
}