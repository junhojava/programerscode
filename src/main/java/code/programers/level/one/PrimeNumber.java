package code.programers.level.one;

import java.util.List;

import solution.Che;

public class PrimeNumber {
    boolean[] table;
    List<Integer> list;
    Che che;

    public PrimeNumber() {
        
    }

    public void init(int length)
    {
        che = new Che(length);
        
        this.table = che.getTable();
        this.list = che.getList();
    }

    void check(int number, int end)
    {
        che.addListNumber(number);
        for(int index=1; index*number<=end; index++)
        {
            table[index*number] = true;
        }
    }

    public int primeNumber(int number)
    {
        for(int index=2; index<=number; index++)
        {
            if(!table[index])
                check(index, number);
        }

        return list.size();
    }

    public List<Integer> primeNumbers()
    {
        return this.list;
    }
}