package DAY6;

public class sum {
    public static int sum1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum1(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum1(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
