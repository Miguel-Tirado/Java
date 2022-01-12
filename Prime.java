public class Prime {
    public static void main(String[] args) {
        int low = 20, high = 50;
        while (low < high) {
            if(CheckPrime(low)) {
                System.out.print(low + " ");
            }
            low++;
        }
        

    }
    
    public static boolean CheckPrime(int num) {
        boolean flag = true;
        for(int i = 2; i < num/2; i++) { //i must be 2 since any num can be mod by 1 for the if statement below 
            if(num % i == 0) {
                flag = false; 
                return flag;
            }
        }
        return flag;
    }

}