public class QuickSort {

    public static void quickSort(int[] nums, int low, int high) {
        // We carry it until more than one element is present in the array
        // One element is always Sorted array
        if (low < high) {
            // We partitioned the array so that Element less than pivot(End element)
            // are on the Left side and element greater than pivot are on the Right side
            int pi = partition(nums, low, high);
            // Now we will call sort Left side elements
            quickSort(nums, low, pi - 1);
            // And call sort Right side elements
            quickSort(nums, pi + 1, high);
            // As we got the exact index of pivot element no need to Fix it
        }
    }

    // 6 , 7, 3, 4, 2, 9,*1*
    // 1,    7, 3, 4, 2, 9,*6*
    //       3, 7, 4, 2, 9,*6*
    //       3, 4, 7, 2, 9,*6*
    //       3, 4, 2, 7, 9,*6*
    //       3, 4, *2*        ,6,        9,*7*
    //       2, 4, *3*                   7, 9
    //       2,    3, 4
    //1, 2, 3, 4, 6, 7, 9.



    // This is basically partitioning array into two parts getting the right
    // position of pivot element
    public static int partition(int nums[], int low, int high) {
        int pivot = nums[high];
        // Setting it as one index less than starting index as none element less than
        // pivot has been found
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                // Swaping
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        // Swaping the position of element after the left side with pivot element
        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int nums[] = { 6, 7, 3, 4, 2, 9, 1 };
        quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
