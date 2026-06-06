package DAY4;

public class checkexistence {
    public static boolean binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return binarySearch(arr, low, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, high, target);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 10;
        boolean exists = binarySearch(arr, 0, arr.length - 1, target);
        if (exists) {
            System.out.println("Element " + target + " exists in the array.");
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }
    }
}
