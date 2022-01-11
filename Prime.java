public class Prime {
    public static void main(String[] args) {
        int low = 20, high = 50;

    }

    public static boolean CheckPrime(int lo, int hi) {
        int total = hi - lo;
        int prime = total;
        for (int i = 0; i < total; i++) {
            if (prime % 2 == 0) {
                return false;
            } else {
                return true; 
            }
        }
    }

}