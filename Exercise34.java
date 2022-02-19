import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = 0;

        System.out.print("Input the length of the hexagon: ");
        length = sc.nextDouble();

        double areaHex = (6 * Math.pow(length,2)) / (4 * (Math.tan((Math.PI/6))));

        System.out.printf("The area od the hexagon is: %f",areaHex);
        sc.close();


    }
}