package lintcode_nine_solutions.chapter02_binary_search;
/*Given a big sorted array with positive integers sorted by ascending order. The array is so big so that you can not get the length of the whole array directly, and you can only access the kth number by ArrayReader.get(k) (or ArrayReader->get(k) for C++). Find the first index of a target number. Your algorithm should be in O(log k), where k is the first index of the target number.

Return -1, if the number doesn't exist in the array.
*/

public class SearchBigSortedArray447 {
    public int searchBigSrtedArray(ArrayReader reader, int target){
        int end = 1;
        while(target > reader.get(end - 1)){
            end *= 2;
        }
        int start = 0;
        end -= 1;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(start <= reader.get(mid)){
                end = mid;
            }else if(target > reader.get(mid)){
                start = mid;
            }
        }
        if(reader.get(start) == target) return start;
        if(reader.get(end) == target) return end;
        return -1;
    }
}
