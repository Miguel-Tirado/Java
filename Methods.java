public class Methods {
    public static void main(String args[]) {
        int x = 2;
        int y = 4;
        double z = 2.2;
        int arr[] = {1,4,2,3,4,5,6,8,10,10};

        for (int i = 0; i < arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("True");
                }
            }
            System.out.println(arr[i]);
        }

        message();
        System.out.println("The sum of x + y = " + add(x,y));
        System.out.println("The mult of x * y = " + mult(x,y));

    }

    public static void message () {
        System.out.println("Hello world!");
    }

    public static int add(int x, int y) {
        //returns the sum of x and y
        int sum = x + y;
        return sum;
    }

    public static int mult(int x, int y) {
        //returns the mulitplication of x and y
        int ans = x * y;
        return ans;
    }

}