package _6kyu;

import java.math.BigInteger;

/**
 * @author legand
 * @description
 * @date 2020-10-21 12:43 PM
 * @email shuzhen@chaoxing.com
 */
public class BitCounting {
    public static int countBits(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        
        return count;
    }
    
    public static int countBits2(int n) {
        return Integer.bitCount(n);
    }
    
    public static int countBits3(int n) {
        return (int)Integer.toBinaryString(n).chars().filter(c->c=='1').count();
        //return Integer.toBinaryString(n).replaceAll("0", "").length();
    }
    
}
