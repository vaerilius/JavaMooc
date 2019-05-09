
import java.util.HashMap;
import java.util.Map;

public class Ostoskori {

    private Map<String, Ostos> ostokset;

    public Ostoskori() {
        this.ostokset = new HashMap<>();
    }

    public void lisaa(String tuote, int hinta) {

        if (!this.ostokset.containsKey(tuote)) {
            Ostos ostos = new Ostos(tuote, 1, hinta);
            this.ostokset.put(tuote, ostos);
        } else {
            this.ostokset.get(tuote).kasvataMaaraa();

        }
    }

    public int hinta() {
        int hinta = 0;

        for (String ostos : ostokset.keySet()) {
            hinta += this.ostokset.get(ostos).hinta();
        }
        return hinta;
    }

    public void tulosta() {
        for (String ostos : ostokset.keySet()) {
            System.out.println(this.ostokset.get(ostos));
        }

    }
 

}
