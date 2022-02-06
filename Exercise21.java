import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] value = new int[20];
        int decimal;

        System.out.print("Enter Decimal Number: ");
        decimal = sc.nextInt();

        while (decimal != 0) {
            value[i++] = decimal % 8;
            decimal = decimal / 8;
        }

        System.out.print("octal number: ");

        i--;
        while (i >= 0) {
            System.out.print(value[i--]);
        } 

        /*for(int j=i-1; j>0; j--)
        {
            System.out.print(value[j]);
        } */



        
    }
}