package lintcode_nine_solutions.chapter02_binary_search;
/*ind the last position of a target number in a sorted array. Return -1 if target does not exist.
* */
public class LastPositionTarget458 {
    public int lastPosition(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        if(nums[end] == target) return end;
        else if(nums[start] == target) return start;
        return -1;
        // write your code here
    }

}
