import java.util.Scanner;

public class Exercise19A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bin1;
        int num1 = 0, i = 0; 
        int[] value = new int[20];


        System.out.print("Enter number: ");
        num1 = sc.nextInt();

        while (num1 != 0){
            value[i++] = (num1  % 2);
            num1 = num1 /2;
        }

        while (i >= 0) {
            System.out.print(value[i--]);
        }

        int dec_num, rem;
        String hexdec_num ="";

        char[] hexV = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        System.out.print("Enter number for hex: ");
        dec_num = sc.nextInt();

        while (dec_num != 0) {
            rem = (dec_num % 16);
            hexdec_num =  hexV[rem] + hexdec_num;
            dec_num = dec_num /16;
        }

        System.out.println("Hexadecimal number is: " + hexdec_num);

    }
}