import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        //Write a program to convert an octal number into hexadecimal
        Scanner sc = new Scanner(System.in);
        int i = 0, place = 0, rem;
        int decimal;
        int[] value = new int[100];
        int Number = 0;
        char[] hexv = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexdecNum = "";

        System.out.print("Enter Octal Number number: ");
        decimal = sc.nextInt();

        while (decimal != 0) {
            value[i] = decimal % 10;
            decimal = decimal /10;
            Number = (int) (Number + value[i] * Math.pow(8,place));
            i++;
            place++;
        }

        while (Number != 0) {
            rem = Number % 16;
            hexdecNum = hexv[rem] + hexdecNum;
            Number = Number/16;
        }

        System.out.println("The hexadecimal number is: " + hexdecNum);
        sc.close();


    }
}
