public class BubbleSort {
    
    public static void sort(int nums[]){
        for(int i=1;i<nums.length;i++){
            for (int j = 1; j < nums.length; j++) {
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={6,7,3,4,2,9};
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        
    }
}
