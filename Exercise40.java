import java.nio.charset.Charset;

public class Exercise40 {
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        //avalableCharsets() returns a map 
        // keyset() is used to create a set of the key elements contained in the hash map
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
        
    }
}