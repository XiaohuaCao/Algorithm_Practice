package lintcode_nine_solutions.chapter01;

import java.util.HashSet;
import java.util.Set;

/*Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Example
Given s = "abccccdd" return 7

One longest palindrome that can be built is "dccaccd", whose length is 7.
*/
public class LongestPalindrome627 {
    public int longestPalindrome(String s){
        if(s == null || s.length() == 0) return 0;
        Set<Character> set = new HashSet<>();
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                len += 2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        if(set.size() != 0) return len + 1;
        else{
            return len;
        }

    }
}
