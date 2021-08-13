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
    void testCase()
    {
        che.length(11);
        che.visitIndex(10);
        int count = che.getList().size();

        assertEquals(4, count);
        assertTrue(Number.isPrimeNumber(2));
        assertTrue(Number.isPrimeNumber(3));
        assertTrue(Number.isPrimeNumber(11));
        assertFalse(Number.isPrimeNumber(10));
    }
}