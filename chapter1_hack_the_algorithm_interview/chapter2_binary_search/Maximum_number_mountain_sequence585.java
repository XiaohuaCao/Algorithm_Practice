package lintcode_nine_solutions.chapter1_hack_the_algorithm_interview.chapter2_binary_search;
/*585. Maximum Number in Mountain Sequence
Given a mountain sequence of n integers which increase firstly and then decrease, find the mountain top.
*/
public class Maximum_number_mountain_sequence585 {
    public int mountainSequence(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        int start = 0;
        int end = nums.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(mid > 1 && nums[mid] > nums[mid - 1]){
                start = mid;
            }else{
                end = mid;
            }
        }
        return Math.max(nums[start], nums[end]);
    }
}
