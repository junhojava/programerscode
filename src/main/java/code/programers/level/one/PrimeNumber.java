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

    public int primeNumber(int number)
    {
        che.visitIndex(number);

        return list.size();
    }

    public List<Integer> primeNumbers()
    {
        return this.list;
    }
}