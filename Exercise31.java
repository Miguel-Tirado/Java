
public class Exercise31 {
    public static void main(String[] args) {
        /*System.getPropery(String key) returns a string containing the value of the property,
        if the property does not exist then it returns null 
        System indicates this computer system that Im using*/

        System.out.println("Java Version: " + System.getProperty("Java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL:" + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        System.out.println("OS version: " + System.getProperty("os.name"));
    }
}