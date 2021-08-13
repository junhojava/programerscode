package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

import datatype.Number;
import solution.Sieve;

public class FindPrimeNumber {

    AlterKey ak;
    BiggestNumber bn;
    Sieve sieve;

    @Test
    void testCaseOne()
    {
        int result = 1;
        int max = 0;

        String numbers = "011";
        int[] strArray = new int[numbers.length()];
        Map<Integer, Boolean> map = new HashMap<>();

        ak = new AlterKey();
        bn = new BiggestNumber();
        sieve = new Sieve();

        bn.list = new ArrayList<>();

        for(int index=0; index< strArray.length; index++){
            strArray[index] = Integer.parseInt(numbers.substring(index, index+1));
        }

        int[] akArray = ak.columns(strArray.length);
        int[][] combination = ak.dimension(akArray);

        for(int[] arr:combination){
            bn.list.add(arr);
        }

        while(result < strArray.length){
            result++;

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

        result = 0;

        for(Entry<Integer, Boolean> entry : map.entrySet()){
            if(sieve.getList().contains(entry.getKey())){
                result++;
            }
        }

        assertEquals(2, result);
    }
}