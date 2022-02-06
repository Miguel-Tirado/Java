import java.util.Scanner;
import java.lang.Math.*;

public class JavaBasics {
    public static void main(String[] args) {
        //Initiate Scanner 
        Scanner sc = new Scanner(System.in);

        /*
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

        //Exercise 7 
        int num;
        System.out.print("Input a number: ");
        num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("--------------------------");

        //Exercise 8 
        System.out.println("     J    a   v     v     a  ");
        System.out.println("     J   a  a  v   v    a   a");
        System.out.println("  J  J  aaaaaa  v v    aaaaaaa");
        System.out.println("   JJ  a      a  v    a       a");
        System.out.println("--------------------------------");

        //Excericise 10 
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
        System.out.println("--------------------------------");

        //Exercise 11 
        double radius;
        System.out.print("Radius = ");
        radius = sc.nextDouble();
        System.out.println("Perimeter is = " + (2* Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * radius * radius));
        System.out.println("--------------------------------");

        //Exercise 12 
        int anum1, anum2, anum3;
        System.out.print("Enter first number: ");
        anum1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        anum2 = sc.nextInt();
        System.out.print("Enter third number: ");
        anum3 = sc.nextInt();
        System.out.println("The average is the following: " + ((anum1 + anum2 + anum3)/3));
        System.out.println("--------------------------------");

        
        //Exercise 13 
        double width, height;
        System.out.print("width = ");
        width = sc.nextDouble();
        System.out.print("height = ");
        height = sc.nextDouble();

    
        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("Perimiter is 2 * " + width + " + " + height + " = " + (2*(width + height)));

        
        //Exercise 14 
        for (int i = 0; i < 4; i ++) {
            System.out.println("* * * * * * ==================================");
            System.out.println(" * * * * *  ==================================");
        }
        for (int i = 0; i < 6; i ++) {
            System.out.println("==============================================");
        }

        //Exercise 15 
        int a , b, temp;
        System.out.print("Enter value for a: ");
        a = sc.nextInt();
        System.out.print("Enter value for b: ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;
        System.out.printf("Swap a is %d\nb is %d\n",a,b);
        */ 
        //Excercise 16
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");

        //Excercise 17
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);
      
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();
      
        while (binary1 != 0 || binary2 != 0) 
        {
         sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
         remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
         binary1 = binary1 / 10;
         binary2 = binary2 / 10;
        }
        if (remainder != 0) {
         sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
         System.out.print(sum[i--]);
        }
         System.out.print("\n");  


        // Exercise 18 
        














        



        


    }
}