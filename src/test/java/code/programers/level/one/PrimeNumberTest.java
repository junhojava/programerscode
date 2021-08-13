package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import datatype.Number;
import solution.Che;

public class PrimeNumberTest {

    Che che = new Che();
    PrimeNumber pn = new PrimeNumber();

    public boolean[] booleanArray(int length){
        boolean[] result = new boolean[length];

        for(int index=0; index < length; index++)
            result[index] = false;

        return result;
    }

    @Test
    void tsetInit()
    {
        che.length(10);

        assertArrayEquals(booleanArray(10), che.getTable());
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