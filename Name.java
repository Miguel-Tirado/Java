import java.util.*;

public class Name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while (!name.equals("miguel")) {
            System.out.println("please enter the correct name: ");
            name = sc.nextLine();
        }

        System.out.println("You entered the correct name!");
        sc.close();


    }
}