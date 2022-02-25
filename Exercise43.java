import java.util.Scanner;
public class Exercise43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.print("Input number: ");
        num = sc.nextLine();
        System.out.println(num + " + " + num + num + " + " + num + num + num);
        int number1 = Integer.parseInt(num);

        int ans = number1 + (number1 * 10 + number1) + (number1 * 100 + number1 * 10 + number1);
        System.out.println("The answer is: " + ans);
        sc.close();
    }
}