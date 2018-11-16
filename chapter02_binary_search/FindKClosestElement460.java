package lintcode_nine_solutions.chapter02_binary_search;

import java.util.PriorityQueue;
import java.util.Queue;

/*
* Given a target number, a non-negative integer k and an integer array A sorted in ascending order, find the k closest numbers to target in A, sorted in ascending order by the difference between the number and target. Otherwise, sorted in ascending order by number if the difference is same.
* 用二分法：找出target位置，再向左右拓展，选接近target的数依次填入结果
* O(logn + k) time complexity
* space: O(k).
* */
public class FindKClosestElement460 {
    public int[] kClosestNumbers(int[] A, int target, int k){
        if(k <= 0 || A.length == 0){
            return new int[0];
        }
        //find target position
        int left = 0, right = A.length - 1;
        //find left and right pos which is closest to target
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(target < A[mid]){
                right = mid;
            }else{
                left = mid;
            }
        }
        //get k numbers
        int[] results = new int[k];
        int count = 0;
        while(left >= 0 && right < A.length && count < k){
            if(Math.abs(target - A[left]) <= Math.abs(target - A[right])){
                results[count++] = A[left--];
            }else{
                results[count++] = A[right++];
            }
        }
        while(count < k && left >= 0){
            results[count++] = A[left--];
        }
        while(count < k && right < A.length){
            results[count++] = A[right++];
        }
        return results;

    }
    /*用heap做的

    Time: O(log(n) + k)
    Space: O(k)*/
    public int[] kClosestNumberPriorityQueue(int[] A, int target, int k){
        int[] res = new int[k];
        Queue<Integer> queue = new PriorityQueue<>(
                (a, b) -> {
                    if(Math.abs(a - target) == Math.abs(b - target)) return a - b;
                    else return Math.abs(a - target) - Math.abs(b - target);
                }
        );
        for(int num: A){
            queue.add(num);
        }

        int index = 0;
        while(index < k){
            res[index++] = queue.poll();
        }
        return res;
    }
}
