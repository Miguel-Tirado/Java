import java.io.Console;
import java.util.Scanner;


public class Exercise42 {
    public static void main(String[] args) {
        //Write a Java program to input and display your password
        Console cs = System.console();

        char[] ch = cs.readPassword("Input your Password: ");

        System.out.println("Your password was: " + new String(ch));


    }
}