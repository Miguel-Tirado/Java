public class ForLoops {
    public static void main(String args[]) {

        int list[] = {2,4,6,8,10,12,14};

        for (int i = 0; i < 10; i++) {
            System.out.println("The value is: " + i);
        }

        for (int i:list) {
            System.out.println(i);
        }

        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

    }
}