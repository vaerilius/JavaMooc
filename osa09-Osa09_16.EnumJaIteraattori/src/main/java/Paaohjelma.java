
public class Paaohjelma {

    public static void main(String[] args) {
Tyontekijat yliopisto = new Tyontekijat();
yliopisto.lisaa(new Henkilo("Petrus", Koulutus.FT));
yliopisto.lisaa(new Henkilo("Arto", Koulutus.FilYO));
yliopisto.lisaa(new Henkilo("Elina", Koulutus.FT));

yliopisto.tulosta();

yliopisto.irtisano(Koulutus.FilYO);

System.out.println("==");

yliopisto.tulosta();
    }

}
