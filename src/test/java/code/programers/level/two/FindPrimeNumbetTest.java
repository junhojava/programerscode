package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import datatype.Number;
import solution.Sieve;

public class FindPrimeNumbetTest {

    @Test
    void testCaseOne()
    {
        Sieve sieve = new Sieve();
        BiggestNumber bn = new BiggestNumber();
        AlterKey ak = new AlterKey();

        bn.list = new ArrayList<>();
        int max = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        int count = 1;

        String numbers = "011";
        int[] strArray = new int[numbers.length()];

        for(int index=0; index< strArray.length; index++)
            strArray[index] = Integer.parseInt(numbers.substring(index, index+1));

        int[] akArray = ak.columns(strArray.length);
        int[][] combination = ak.dimension(akArray);

        for(int[] arr:combination){
            bn.list.add(arr);
        }

        while(count < strArray.length){
            count++;

            combination = ak.combination(akArray, combination);

            for(int[] arr: combination){
                bn.permutation(arr, 0);
            }
        }

        for(int[] arr:bn.list){
            int number = Number.extractInt(arr, strArray);

            map.put(number, map.getOrDefault(number, false));

            if(max < number){
                max = number;
            }
        }

        sieve.length(max + 1);
        sieve.visitIndex(max);

        count = 0;

        for(Entry<Integer, Boolean> entry : map.entrySet()){
            if(sieve.getList().contains(entry.getKey())){
                count++;
            }
        }

        assertEquals(2, count);
    }
}