package test;

import _7kyu.SquareDigit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author legand
 * @description
 * @date 2020-10-21 2:06 PM
 * @email shuzhen@chaoxing.com
 */
public class SquareEveryDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
    }
}
