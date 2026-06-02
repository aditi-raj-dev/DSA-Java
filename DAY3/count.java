package DAY3;

public class count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 5, 5 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count++;
            }
        }
        System.out.println("Count of 2 in the array is: " + count);
    }
}
