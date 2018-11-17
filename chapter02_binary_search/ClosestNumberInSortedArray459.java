package lintcode_nine_solutions.chapter02_binary_search;
/*Given a target number and an integer array A sorted in ascending order, find the index i in A such that A[i] is closest to the given target.

Return -1 if there is no element in the array.
*/
public class ClosestNumberInSortedArray459 {
    public int closestNumber(int[] A, int target) {
        if(A == null || A.length == 0) return -1;
        int start = 0, end = A.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(target > A[mid]){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(Math.abs(target - A[start]) < Math.abs(target - A[end])){
            return start;
        }
        return end;

        // write your code here
    }
}
