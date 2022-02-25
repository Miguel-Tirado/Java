
import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        //Write a program to reverse a string 
        Scanner sc = new Scanner(System.in);
        String sent;
        char[] sentReverse = new char[100];

        System.out.print("Input a string is: ");
        sent = sc.nextLine();


        for(int i = sent.length() - 1; i >= 0; i--) {
            sentReverse[i] = sent.charAt(i);
            System.out.print(sentReverse[i]);
        }
       sc.close();
    }
}