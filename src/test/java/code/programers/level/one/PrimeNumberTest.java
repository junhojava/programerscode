package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import datatype.Number;

public class PrimeNumberTest {

    PrimeNumber pn = new PrimeNumber();

    @Test
    void tsetInit()
    {
        pn.init(10);

        assertArrayEquals(new boolean[]{false, false, false, false, false, false, false, false, false, false}, pn.table);
    }

    @Test
    void testCaseOne()
    {
        pn.init(11);

        int count = pn.primeNumber(10);

        assertEquals(4, count);
        assertTrue(Number.isPrimeNumber(2));
        assertTrue(Number.isPrimeNumber(3));
        assertTrue(Number.isPrimeNumber(11));
        assertFalse(Number.isPrimeNumber(10));
    }

    @Test
    void testCaseTwo()
    {
        pn.init(6);

        int count = pn.primeNumber(5);

        assertEquals(3, count);
    }
}