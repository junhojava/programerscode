package code.programers.level.one;

import java.util.List;

import solution.Sieve;

public class PrimeNumber {
    boolean[] table;
    List<Integer> list;
    Sieve sieve;

    public PrimeNumber() {
        
    }

    public void init(int length)
    {
        sieve = new Sieve(length);
        
        this.table = sieve.getTable();
        this.list = sieve.getList();
    }

    public int primeNumber(int number)
    {
        sieve.visitIndex(number);

        return list.size();
    }

    public List<Integer> primeNumbers()
    {
        return this.list;
    }
}