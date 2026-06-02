package DAY3;

public class Search {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8, 10 };
        int target = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found  ");
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
}
