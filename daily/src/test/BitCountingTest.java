package test;

import _6kyu.BitCounting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author legand
 * @description
 * @date 2020-10-21 12:46 PM
 * @email shuzhen@chaoxing.com
 */
public class BitCountingTest {
    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}
