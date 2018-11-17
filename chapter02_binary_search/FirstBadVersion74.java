package lintcode_nine_solutions.chapter02_binary_search;
/*The code base version is an integer start from 1 to n. One day, someone committed a bad version in the code case, so it caused this version and the following versions are all failed in the unit tests. Find the first bad version.

You can call isBadVersion to help you determine which version is the first bad one. The details interface can be found in the code's annotation part.

Example
Given n = 5:

isBadVersion(3) -> false
isBadVersion(5) -> true
isBadVersion(4) -> true
Here we are 100% sure that the 4th version is the first bad version.
*/
public class FirstBadVersion74 {
    public int findFirstBadVersion(int n) {
        if(n == 1 && SVNRepo.isBadVersion(n)) return 1;
        int start = 1;
        int end = n;
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if(!SVNRepo.isBadVersion(mid)){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(SVNRepo.isBadVersion(start)) return start;
        return end;

        // write your code here
    }
}
