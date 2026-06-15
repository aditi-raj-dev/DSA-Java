package Methods;

public class EvenOdd {
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 7;
        String result = checkEvenOdd(num);
        System.out.println(num + " is " + result);
    }
}
