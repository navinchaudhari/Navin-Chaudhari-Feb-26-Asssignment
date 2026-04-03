package inventory;

public class Inventory <T>{
    T obj;

    public Inventory(T obj) {
        this.obj = obj;
    }

    T getObj(){
        return this.obj;
    }
    void addObj(T obj){
        this.obj = obj;
    }
}
