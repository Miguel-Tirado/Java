import java.util.Scanner;
public class Exercise33 {
    public static void main(String[] args) {
        //Write a program to compute the sume of digits of an integer
        Scanner sc = new Scanner(System.in);
        int num, i = 0;
        int sum = 0, temp = 0;
        int value[] = new int[100];

        System.out.print("intput an integer:");
        num = sc.nextInt();

        while(num != 0) {
            sum += num % 10;
            num = num /10;
        }


        System.out.println("The sum of the digits is :" + sum);

    }
}