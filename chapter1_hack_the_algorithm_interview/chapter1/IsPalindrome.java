package lintcode_nine_solutions.chapter1_hack_the_algorithm_interview.chapter1;

public class IsPalindrome {
    public boolean isPalindrome(String s){
        if(s == null || s.length() <= 1) return true;
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left++))!= Character.toLowerCase(s.charAt(right--))){
                return false;
            }

        }
        return true;
    }
}
