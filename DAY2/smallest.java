package DAY2;
public class smallest {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 0, 1, 5 };
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("The smallest element in array is: " + small);
    }
}
