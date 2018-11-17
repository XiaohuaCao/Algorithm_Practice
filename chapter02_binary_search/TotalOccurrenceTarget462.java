package lintcode_nine_solutions.chapter02_binary_search;

public class TotalOccurrenceTarget462 {
    public int totalOccurrence(int[] A, int target) {
        //find the first pos of target and the last pos target
        if(A == null || A.length == 0) return 0;
        int first = firstPos(A, target);
        int last = lastPos(A, target);
        if(first == -1) return 0;
        if(first == last) return 1;
        else return last - first + 1;

    }
    //find the first pos
    public int firstPos(int[] A, int target){
        int start = 0, end = A.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(target <= A[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(A[start] == target) return start;
        else if(A[end] == target) return end;
        return -1;

    }
    //find the last pos
    public int lastPos(int[] A, int target){
        int start = 0, end = A.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(target < A[mid]){
                end = mid;
            }else{
                start = mid;
            }
        }
        if(A[end] == target) return end;
        else if(A[start] == target) return start;
        return -1;

    }
}
