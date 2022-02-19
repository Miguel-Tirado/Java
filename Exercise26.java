import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        //write a program to convert a Number number to a binary number 
        Scanner sc = new Scanner(System.in);
        int i = 0, place = 0;
        int decimal;
        int[] value = new int[100];
        int Number = 0;

        System.out.print("Enter Octal Number number: ");
        decimal = sc.nextInt();

        while (decimal != 0) {
            value[i] = decimal % 10;
            decimal = decimal /10;
            Number = (int) (Number + value[i] * Math.pow(8,place));
            i++;
            place++;
        }
        

        int num1 = 0, j = 0; 
        int[] value2 = new int[20];



        while (Number != 0){
            value2[j++] = (Number  % 2);
            Number = Number /2;
        }

        j--;
        while (j > 0) {
            System.out.print(value2[j--]);
        }
        sc.close();
    }
}