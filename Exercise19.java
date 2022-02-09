import java.util.Scanner;
import java.lang.Math;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bin1;
        int i = 0, place = 0;
        int[] value = new int[20];
        int decimal = 0;

        System.out.print("Enter binary 1: ");
        bin1 = sc.nextLong();
        
        //this program coverts a binary number into the decimal equivalent 
        while (bin1 != 0) {
            value[i] = (int)(((bin1 % 10) % 2) * Math.pow(2, place));
            bin1 = bin1 /10;
            decimal = decimal + value[i];
            place++;
            i++;

        }
        System.out.println("Decimal: " + decimal);
        while (i >= 0) {
            System.out.print(value[i--]);
        }
        sc.close();
    }
}