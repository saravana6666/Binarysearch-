
                 /*
                 Saravana Bava S K
                 date : 24.08.2024
                 */


public class Binary {

    /*
     * Performs a binary search on a sorted array.
     * target the integer value to search for
     * return the index of the target value if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        
        int[] sortedArray1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("Index of 7: " + binarySearch(sortedArray1, 7)); 

        
        System.out.println("Index of 15: " + binarySearch(sortedArray1, 15)); 

        System.out.println("Index of 2: " + binarySearch(sortedArray1, 2));
       
        System.out.println("Index of 20: " + binarySearch(sortedArray1, 20)); // Output: -1

        int[] sortedArray2 = {};
        System.out.println("Index of 1 in empty array: " + binarySearch(sortedArray2, 1)); // Output: -1

        
        try {
            System.out.println("Index of 5 in null array: " + binarySearch(null, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
        }
    }
}

