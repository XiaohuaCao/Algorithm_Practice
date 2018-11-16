package lintcode_nine_solutions.chapter01;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1) return s;
        boolean dp[][] = new boolean[s.length()][s.length()];
        int start = 0, end = 0;
        int maxLen = 0;
        //from end to front iterate the string s
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = i; j < s.length(); j++){
                if(j - i <= 2 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                }
                else if(j - i > 2 && s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]){
                    dp[i][j] = true;
                }

                if(dp[i][j] && maxLen < (j - i + 1)){
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);

        // write your code here
    }

}
