import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String letter;

        switch(c) {
            case 'a': letter = "Vowel";
                break;
            case 'e': letter = "Vowel";
                break;
            case 'i': letter = "Vowel";
                break;
            case 'o': letter = "Vowel";
                break;
            case 'u': letter = "Vowel";
                break;
            default: letter = "constant";
                break;
        }

        System.out.println(letter);


        
    }
}