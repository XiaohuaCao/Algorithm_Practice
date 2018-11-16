package lintcode_nine_solutions.chapter01;
/*Given a string s, find the longest palindromic subsequence's length in s. You may assume that the maximum length of s is 1000.

Example
Given s = "bbbab" return 4
One possible longest palindromic subsequence is "bbbb".
*/
public class LongestPalindromeSubSeq667 {
    public int longestPalindromeSubseq(String s){
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        //dp[][] is store maximum length of palendrome between i ...j
        //dp[i][j] = dp[i + 1][j - 1] + 2 when char（i) == char(j)
        //dp[i][j] = Math.max(dp[i][j - 1], dp[i+1][j]
        int[][] dp = new int[s.length()][s.length()];
        for(int i = s.length() - 1; i >= 0; i++){
            dp[i][i] = 1;
            for(int j = i + 1; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1] + 2;

                }else{
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
       return dp[0][s.length() - 1];
    }
}
