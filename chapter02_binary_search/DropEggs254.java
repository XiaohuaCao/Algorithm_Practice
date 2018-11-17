package lintcode_nine_solutions.chapter02_binary_search;
/*1):times + (times - 1)…),一直到times-x = 1，即绝对定位到一个位置，
这时候到达的层数一定>=最高层。(这种也是每种可能都最大化了这个times的情况)。
 */

/*思路：
* 假设最少drop x 次， 则必须从x 层开始扔，因为当第一个蛋碎后，第二个蛋还需要扔 x - 1次，
* 如果蛋不碎，还得扔 x - 1次，所以得从x + x - 1层开始，
* x + (x - 1) + (x - 2) ... >= 100 */

public class Solution {
    public int dropEggs(int n){
        long sum = 0;
        int inc = 1;
        while(sum < n){
            sum += inc;
            inc++;
        }
        return inc - 1;

    }

}
