import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character;

        System.out.print("Enter character: ");
        character = sc.next().charAt(0);

        int ascii = (int) character;

        System.out.printf("The ASCII value of %c is : %d",character,ascii);
        sc.close();

    }
}