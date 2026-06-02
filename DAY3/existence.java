package DAY3;

public class existence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 3;
        boolean exists = false;

        for (int num : arr) {
            if (num == target) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Element " + target + " exists in the array.");
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }
    }
}
