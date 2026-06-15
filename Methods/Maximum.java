package Methods;

public class Maximum {
    public static int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int max = findMaximum(10, 20);
        System.out.println("Maximum: " + max);
    }
}
