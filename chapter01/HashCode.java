package lintcode_nine_solutions.chapter01;
/*
* In data structure Hash, hash function is used to convert a string(or any other type) into an integer smaller than hash size and bigger or equal to zero. The objective of designing a hash function is to "hash" the key as unreasonable as possible. A good hash function can avoid collision as less as possible. A widely used hash function algorithm is using a magic number 33, consider any string as a 33 based big integer like follow:

hashcode("abcd") = (ascii(a) * 333 + ascii(b) * 332 + ascii(c) *33 + ascii(d)) % HASH_SIZE

                              = (97* 333 + 98 * 332 + 99 * 33 +100) % HASH_SIZE

                              = 3595978 % HASH_SIZE
                              */
public class HashCode {
    public int hashCode(char[] key, int HASH_SIZE){
        if(key == null || key.length == 0) return 0;
        long sum = 0;
        for(int i = 0; i < key.length; i++){
            sum = (33 * sum + (int) key[i]) % HASH_SIZE;
        }
        return (int) sum;
    }
}
