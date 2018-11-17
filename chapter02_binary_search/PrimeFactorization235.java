package lintcode_nine_solutions.chapter02_binary_search;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization235 {
    public List<Integer> primeFactorization(int num){
        List<Integer> res = new ArrayList<>();
        if(num < 2) return res;
        // int temp = num;
        for(int i = 2; i * i <= num; i++){
            while(num % i == 0){
                res.add(i);
                num /= i;;
            }
        }
        if(num != 1){
            res.add(num);
        }
        return res;
    }
}
