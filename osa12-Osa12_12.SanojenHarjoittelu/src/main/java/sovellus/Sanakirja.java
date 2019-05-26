package sovellus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Sanakirja {

    private List<String> sanat;
    private Map<String, String> kaannokset;

    public Sanakirja() {

        this.sanat = new ArrayList<>();
        this.kaannokset = new HashMap<>();
        lisaa("sana", "word");
    }

    public String hae(String sana) {
        return this.kaannokset.get(sana);
    }

    public void lisaa(String sana, String kaannos) {
        if (!this.kaannokset.containsKey(sana)) {
            this.sanat.add(sana);
        }
        this.kaannokset.put(sana, kaannos);
    }

    public String arvoSana() {
        return this.sanat.get(new Random().nextInt(this.sanat.size()));
    }

}
