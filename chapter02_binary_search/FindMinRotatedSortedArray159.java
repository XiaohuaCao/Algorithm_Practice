package lintcode_nine_solutions.chapter02_binary_search;

public class FindMinRotatedSortedArray159 {
    public int findMin(int[] nums){
        if(nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        if(nums[0] < nums[nums.length - 1]) return nums[0];
        int target = nums[nums.length - 1];
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= target){
                start = mid;
            }
            else if(nums[mid] < target){
                end = mid;
            }


        }
        return Math.min(nums[start], nums[end]);
        // write your code here

    }
}
