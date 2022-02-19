import java.util.Scanner;


public class Exercise35{
    public static void main(String[] args) {
        //Write a Java program to compute the area of a polygon
        Scanner sc = new Scanner(System.in);
        double sides, length;

        System.out.print("input the number of sides on the polygon: ");
        sides = sc.nextDouble();
        System.out.print("Input the length: ");
        length = sc.nextDouble();

        double areaPoly = (sides * Math.pow(length, 2)) / (4 * Math.tan((Math.PI/sides)));

        System.out.println("The area of the polygon is: " + areaPoly);
        sc.close();
    }
}