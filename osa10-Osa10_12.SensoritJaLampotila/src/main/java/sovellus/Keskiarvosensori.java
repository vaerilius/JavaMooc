package sovellus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Keskiarvosensori implements Sensori {

    private Collection<Sensori> sensorit;
    private List<Integer> kaikkiMittaukset;

    public Keskiarvosensori() {

        this.kaikkiMittaukset = new ArrayList<>();
        this.sensorit = new ArrayList<>();
    }

    public void lisaaSensori(Sensori lisattava) {

        this.sensorit.add(lisattava);

    }

    public List<Integer> mittaukset() {

        return kaikkiMittaukset;
    }

    @Override
    public boolean onPaalla() {
        Iterator<Sensori> ite = sensorit.iterator();

        while (ite.hasNext()) {
            Sensori next = ite.next();
            if (!next.onPaalla()) {
                return false;
            }

        }

        return true;
    }

    @Override
    public void paalle() {
        Iterator<Sensori> ite = sensorit.iterator();

        while (ite.hasNext()) {
            Sensori next = ite.next();
            next.paalle();

        }

    }

    @Override
    public void poisPaalta() {
        Iterator<Sensori> ite = sensorit.iterator();

        while (ite.hasNext()) {
            Sensori next = ite.next();
            if (next.onPaalla()) {
                next.poisPaalta();
            }
        }

    }

    @Override
    public int mittaa() {
        if (this.sensorit.isEmpty()) {
            throw new IllegalStateException("Tyhjä");
        } else {

            int ka = (int) this.sensorit.stream()
                    .mapToInt(mittausArvo -> mittausArvo.mittaa())
                    .average().getAsDouble();

            this.kaikkiMittaukset.add(ka);
            return ka;

        }

    }

}
