public class swap{
    public static void main(String[] args) {
        int x = 8;
        int y = 4;
        int temp;

        System.out.println("x: " + x + " y: " + y);
        System.out.println("swap");

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + " y: " + y);

    }
}