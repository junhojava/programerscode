package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * eratosthenes algorithm for extract prime number
 * @version 1.0
 * 
 */
public class Sieve {
    private boolean[] table;
    List<Integer> list;

    public Sieve(){

    }
    
    public Sieve(int length) {
        this.length(length);
    }

    public void setTable(boolean[] table){
        this.table = table;
    }

    public boolean[] getTable(){
        return this.table;
    }

    public void setList(List<Integer> list){
        this.list = list;
    }

    public List<Integer> getList(){
        return this.list;
    }

    public void addListNumber(int number){
        getList().add(number);
    }

    public void multiple(int multipleNumber, int endNumber){
        for(int index=1; index*multipleNumber <= endNumber ; index++){
            table[index*multipleNumber] = true;
        }
    }

    public void visitIndex(int endNumber){
        for(int index = 2; index <= endNumber; index++){
            if(!table[index]){
                addListNumber(index);
                multiple(index, endNumber);
            }
        }
    }

    public void length(int length){
        this.table = new boolean[length];
        this.list = new ArrayList<>();
    }
}
