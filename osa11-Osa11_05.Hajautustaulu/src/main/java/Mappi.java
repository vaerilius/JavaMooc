
import java.util.ArrayList;


public class Mappi<K, V> {
    private ArrayList<Pair<K, V>>[] pairs;
    private int howManyPairs;

    public Mappi() {
        this.pairs = new ArrayList[4];
        this.howManyPairs = 0;
    }
    public V find(K key) {
        int devolutionValue = Math.abs(key.hashCode() % this.pairs.length);
        if (this.pairs[devolutionValue] == null) {
            return null;
        }
        ArrayList<Pair<K, V>> indexOfValue = this.pairs[devolutionValue];
        
        for (int i = 0; i < indexOfValue.size(); i++) {
            if (indexOfValue.get(i).getKey().equals(key)) {
                return indexOfValue.get(i).getValue();
            }
        }
        return null;
        
    }
    private ArrayList<Pair<K, V>> getKeyList(K key) {
    int devolutionValue = Math.abs(key.hashCode() % pairs.length);
    if (pairs[devolutionValue] == null) {
        pairs[devolutionValue] = new ArrayList<>();
    }

    return pairs[devolutionValue];
}
    private int getIndexOfKey(ArrayList<Pair<K,V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public void add(K key, V value) {
        ArrayList<Pair<K,V>> values = getKeyList(key);
        int index = getIndexOfKey(values, key);
        if (index < 0) {
            values.add(new Pair<>(key, value));
            howManyPairs++;
        } else {
            values.get(index).setValue(value);
        }
    }
    public V removePair(K key) {
        
        ArrayList<Pair<K,V>> values = getKeyList(key);
        if (values.size() == 0) {
            return null;
        }
        int index = getIndexOfKey(values, key);
        if (index<0 ) {
            return null;
        }
        Pair<K,V> pair = values.get(index);
        values.remove(pair);
        return pair.getValue();
    }
    
    
}
