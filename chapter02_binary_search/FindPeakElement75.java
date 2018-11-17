package lintcode_nine_solutions.chapter02_binary_search;
/*There is an integer array which has the following features:

The numbers in adjacent positions are different.
A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
We define a position P is a peak if:

A[P] > A[P-1] && A[P] > A[P+1]
Find a peak element in this array. Return the index of the peak.
*/
public class FindPeakElement75 {
    public int findPeak(int[] A){
        if(A == null || A.length == 0) return -1;
        int start = 1; //答案再之间不会出界
        int end = A.length - 2;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(A[mid] > A[mid - 1]){
                start = mid;
            }
            else if(A[mid] > A[mid + 1]){
                end = mid;
            }else{
                end = mid;
            }
        }
        if(A[start] > A[end]) return start;
        else return end;

        // write your code here

    }

}
