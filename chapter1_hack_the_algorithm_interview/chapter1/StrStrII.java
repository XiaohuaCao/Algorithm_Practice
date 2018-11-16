package lintcode_nine_solutions.chapter1_hack_the_algorithm_interview.chapter1;
/*为了保证O(n+m)的时间复杂度，可以使用更通用的Rabin-Karp算法。

算法非常简单，总结为三点：

用hash的比较代替字符串的比较，时间复杂度为O(1)（一般假设hash不碰撞）
需要提前计算出初始的srcHash和固定的tgtHash，时间复杂度为O(m)
待比较的新srcStr是渐变的，计算新srcHash的时间复杂度为O(1)
因此，Rabin-Karp的时间复杂度也是O(n+m)
*/
public class StrStrII {
    public int strStr2(String source, String target){
        int magic = 31;
        int base = 1000000;
        if(source == null || target == null) return -1;
        if(target.length() == 0) return 0;
        int m = target.length();
        int power = 1;
        for(int i = 0; i < m; i++){
            power = (power * magic) % base;
        }
        int targetCode = 0;
        for(int i = 0; i < m; i++){
            targetCode = (targetCode * magic + (int) target.charAt(i)) % base;
        }
        int hashCode = 0;
        for(int j = 0; j < source.length(); j++){
            hashCode = (hashCode * magic + (int) source.charAt(j)) % base;
            if(j + 1 > m) continue;
            if(j >= m) {
                hashCode = hashCode - source.charAt(j - m) * power % base;
                if(hashCode == targetCode){
                    if(source.substring(j - m + 1, j + 1).equals(target)){
                        return j - m + 1;
                    }
                }
            }

        }
        return -1;
    }
}
