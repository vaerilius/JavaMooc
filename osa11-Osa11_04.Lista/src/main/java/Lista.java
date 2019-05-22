
import java.util.ArrayList;


public class Lista<L> {
    private L[] list;
    private int count;

    public Lista() {
        this.list = (L[]) new Object[10];
        this.count = 0;
      
    }
    public void add(L value) {
        if (this.list.length == this.count) {
            increase();
        }
        this.list[this.count] = value;
        this.count ++;
    }
    private void increase() {
        int listSize = this.list.length + this.list.length / 2;
       L[] newList = (L[]) new Object[listSize];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list = newList;
    }
    public boolean contains(L value) {
  
        return indexOfValue(value) >= 0;
    } 
    public void remove(L value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        moveLeft(indexOfValue);
        this.count--;
    }

    public int indexOfValue(L value) {
        for (int i = 0; i < this.count; i++) {
            if(this.list[i].equals(value)) {
                return i;
            }
            
        }
        return -1;
    }
    private void moveLeft(int value) {
        for (int i = value; i < this.count - 1; i++) {
            this.list[i] = this.list[i +1]; 
        }
    }
    public L value(int index) {
        if (index < 0 || index >= this.count) {
            throw new ArrayIndexOutOfBoundsException("out of list");
        }
        return this.list[index];
    }
    public int sizeOf() {
        return this.count;
    }
    
    
    
}
