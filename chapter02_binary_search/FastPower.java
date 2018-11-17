package lintcode_nine_solutions.chapter02_binary_search;

public class FastPower {
    public int fastPower(int a, int b, int n){
        if(n == 0) return 1 % b;
        if(n == 1) return a % b;
        long half = fastPower(a, b, n / 2);
        long product = (half * half) % b;
        if(n % 2 == 1){
            product = (product * a) % b;

        }
        return (int) product;
    }
}
