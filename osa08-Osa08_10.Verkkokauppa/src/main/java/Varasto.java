
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Varasto {

    private Map<String, Integer> varasto;
    private Map<String, Integer> saldo;

    public Varasto() {
        this.varasto = new HashMap<>();
        this.saldo = new HashMap<>();
    }

    public void lisaaTuote(String tuote, int hinta, int saldo) {
        this.varasto.put(tuote, hinta);
        this.saldo.put(tuote, saldo);

    }

    public int hinta(String tuote) {
        Collection<String> tuoteNimi = varasto.keySet();
        for (String tamaTuote : tuoteNimi) {
            if (tamaTuote.equals(tuote)) {
                return varasto.get(tamaTuote);
            }
        }

        return -99;
    }

    public int saldo(String tuote) {
        Collection<String> tuoteNimi = saldo.keySet();
        for (String tamaTuote : tuoteNimi) {
            if (tamaTuote.equals(tuote)) {

                return saldo.get(tamaTuote);
            }
        }

        return 0;
    }

    public boolean ota(String tuote) {
        Collection<String> tuoteNimi = saldo.keySet();

        for (String tamaTuote : tuoteNimi) {
            if (tamaTuote.equals(tuote)) {

                if (this.saldo.get(tamaTuote) == 1) {
                    this.saldo.remove(tamaTuote);
                    return true;
                }
                this.saldo.replace(tamaTuote, this.saldo(tuote), this.saldo(tuote) - 1);
                return true;
            }
        }

        return false;
    }

    public Set<String> tuotteet() {
        Set<String> nimet = this.varasto.keySet();
        return nimet;
    }

}
