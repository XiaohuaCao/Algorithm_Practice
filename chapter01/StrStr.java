package lintcode_nine_solutions.chapter01;

public class StrStr {
    public int strStr(String source, String target) {
        if(source == null || target == null) return -1;
        if(target.length() == 0) return 0;
        if(target.length() > source.length()) return -1;
        int i = 0;

        for(; i < source.length() - target.length() + 1; i++){
            int j = 0;
            for (; j < target.length(); j++){
                if(source.charAt(i + j) != target.charAt(j)){
                    break;
                }
            }
            if(j == target.length()){
                return i;
            }

        }
        return -1;
        // Write your code here
    }
}
