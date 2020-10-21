package _7kyu;

import java.util.stream.Collectors;

/**
 * @author legand
 * @description
 * @date 2020-10-21 2:05 PM
 * @email shuzhen@chaoxing.com
 */
public class SquareDigit {
    public int squareDigits(int n) {
        int value = 0;
        int v     = 0;
        while (n != 0) {
            int t = n % 10;
            value += t * t * Math.pow(10, v);
            ++v;
            if (t > 3) {
                ++v;
            }
            n = n / 10;
        }
        return value;
    }
    
    public int squareDigits2(int n) {
        String result = "";
        
        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }
        
        return Integer.parseInt(result) ;
    }
    
    public int squareDigits3(int n) {
        return Integer.parseInt(String.valueOf(n)
                                      .chars()
                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                      .map(i -> i * i)
                                      .mapToObj(String::valueOf)
                                      .collect(Collectors.joining("")));
    }
}
