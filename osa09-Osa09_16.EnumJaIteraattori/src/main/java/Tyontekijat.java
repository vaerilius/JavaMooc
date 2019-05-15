
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tyontekijat {

    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        this.tyontekijat = new ArrayList<>();
    }

    public void lisaa(Henkilo lisattava) {
        this.tyontekijat.add(lisattava);
    }

    public void lisaa(List<Henkilo> lisattavat) {
        Iterator<Henkilo> iteraattori = lisattavat.iterator();

        while (iteraattori.hasNext()) {
            tyontekijat.add(iteraattori.next());
        }
    }

    public void tulosta() {
        Iterator<Henkilo> ite = tyontekijat.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
    }

    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> ite = tyontekijat.iterator();
        while (ite.hasNext()) {
            if (koulutus.equals(ite.next().getKoulutus())) {
                tulosta();
            }

        }
    }

    public void irtisano(Koulutus koulutus) {

        Iterator<Henkilo> ite = tyontekijat.iterator();
        while (ite.hasNext()) {
            if (koulutus.equals(ite.next().getKoulutus())) {
                ite.remove();
            }

        }
    }

}
