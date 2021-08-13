package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import datatype.Number;
import solution.Sieve;

public class PrimeNumberTest {

    Sieve sieve = new Sieve();

    public boolean[] booleanArray(int length){
        boolean[] result = new boolean[length];

        for(int index=0; index < length; index++)
            result[index] = false;

        return result;
    }

    @Test
    void tsetInit()
    {
        sieve.length(10);

        assertArrayEquals(booleanArray(10), sieve.getTable());
    }

    @Test
    void testCase()
    {
        sieve.length(11);
        sieve.visitIndex(10);
        int count = sieve.getList().size();

        assertEquals(4, count);
        assertTrue(Number.isPrimeNumber(2));
        assertTrue(Number.isPrimeNumber(3));
        assertTrue(Number.isPrimeNumber(11));
        assertFalse(Number.isPrimeNumber(10));
    }
}