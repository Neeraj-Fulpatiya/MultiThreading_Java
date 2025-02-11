public class binarySearch{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};  // Sorted array
        int target = 30;  // Element to search for
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        // Binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Output result
        if (found) {
            System.out.println("Element " + target + " found in the array.");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
