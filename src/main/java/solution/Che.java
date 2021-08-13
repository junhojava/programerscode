package solution;

public class Che {
    private boolean[] table;
    
    public void init(int length){
        setTable(new boolean[length]);
        
    }

    public void setTable(boolean[] table){
        this.table = table;
    }

    public boolean[] getTable(){
        return this.table;
    }
}
