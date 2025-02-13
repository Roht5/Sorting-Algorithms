public class SelectionSort {
    public static void sort(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[smallest]) {
                    smallest = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
        }
    }

    public static void main(String[] args) {

        int nums[] = { 6, 7, 3, 4, 2, 9 };
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
