import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        // write a program to convert a hexadecimal to a decimal number
        String hexdec_num;
        int dec_num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hexadecimal number:" );
        hexdec_num = sc.nextLine();

        dec_num = HexToDecimal(hexdec_num);

        System.out.print("Equivilant decimal number is: " + dec_num);

        sc.close();
    }

    public static int HexToDecimal(String s) {
        String digits = "0123456789ABCDEFG";
        s = s.toUpperCase();
        int val = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = val * 16 + d;
        }
        return val;
    }
}