package lintcode_nine_solutions.chapter02_binary_search;

public class Pow {
    public double fastPow(double x, long n){
        long N = n;
        if(N < 0){
            x = 1 / x;
            N = -N;
        }
        return helpPow(x, N);

    }

    private double helpPow(double x, long n) {
        if(n == 0){
            return 1.0;
        }
        double half = helpPow(x, n / 2);
        if(n % 2 == 0){
            return half * half;
        }else{
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Pow test = new Pow();
        System.out.println(test.fastPow(2, 3));
    }
}
