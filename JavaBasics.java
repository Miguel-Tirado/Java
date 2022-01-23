import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        //Initiate Scanner 
        Scanner sc = new Scanner(System.in);

        //Exercise 1 
        System.out.println("Hello");
        System.out.println("Miguel Tirado.");
        System.out.println("--------------------------");

        //Exercise 2 
        System.out.println(74+36);
        System.out.println("--------------------------");

        //Exercise 3
        System.out.println(50/3);
        System.out.println("--------------------------");

        //Exercise 4 
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 /8);
        System.out.println(5 + 15 / 3  * 2 - 8 % 3);
        System.out.println("--------------------------");

        //Excecise 6 
        int x,y;
        System.out.print("Input first number: ");
        x = sc.nextInt();
        System.out.print("Inpur second number: ");
        y = sc.nextInt();
        System.out.println(x + " x " + y + " = " + (x*y));
        System.out.println("--------------------------");

        //Excercise 6
        int num1, num2;
        System.out.print("Input first number: ");
        num1 = sc.nextInt();
        System.out.print("Inpur second number: ");
        num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));
        System.out.println("--------------------------");

        //second solution to excecise 6 
        int numA, numB;
        System.out.print("Input first number: ");
        numA = sc.nextInt();
        System.out.print("Inpur second number: ");
        numB = sc.nextInt();

        int sum = numA + numB;
        int sub = numA - numB;
        int mult = numA * numB;
        int div = numA / numB;
        int mod = numA % numB;

        System.out.printf("Sum = %d\nSub = %d\nMult = %d\nDiv = %d\nMod = %d\n",sum,sub,mult,div,mod);
        System.out.println("--------------------------");



        


    }
}