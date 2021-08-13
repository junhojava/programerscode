package solution;

import java.util.ArrayList;
import java.util.List;

public class Che {
    private boolean[] table;
    List<Integer> list;
    
    public Che(int length) {
        this.table = new boolean[length];
        this.list = new ArrayList<>();
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
}
