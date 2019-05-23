
import java.util.ArrayList;


public class Putki<T>{
    private ArrayList<T> t;

    public Putki() {
        this.t = new ArrayList();
    }
    

  public void lisaaPutkeen(T arvo) {
      this.t.add(arvo);
    }

   public boolean onkoPutkessa() {
       return this.t.isEmpty() != true;
    }

    public T otaPutkesta() {
        if (this.t.isEmpty()) {
            return null;
        }
        
        return this.t.remove(0);
    }
    
}
