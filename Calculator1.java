import java.util.*;

public class Calculator1 {
    public static void main(String args[]) {
        int x,y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two values: ");
        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();
        System.out.println("x + Y is equal to " + (x + y));
        sc.close();
    }

}