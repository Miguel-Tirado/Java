import java.util.Scanner;
public class Exercise38{
    public static void main(String[] args) {
        // Write a program ti count the letters, spaces, numbers and other characters of an input string
        Scanner sc = new Scanner(System.in);
        String sentence;
        int spaces = 0, digits = 0,letters = 0,other = 0;

        System.out.print("Input a string is: ");
        sentence = sc.nextLine();

        for(int i = 0; i < sentence.length();i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            } else if(Character.isDigit(sentence.charAt(i))){
                digits++;
            } else if (Character.isLetter(sentence.charAt(i))){
                letters++;
            } else if (!(sentence.charAt(i) == ' ') && !(Character.isDigit(sentence.charAt(i))) && !(Character.isLetter(sentence.charAt(i))) ) {
                other++;
            }
        }

        sc.close();

        System.out.printf("Letter: %d\n",letters);
        System.out.printf("Space: %d\n",spaces);
        System.out.printf("number: %d\n",digits);
        System.out.printf("other: %d\n",other);
    }
}