
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Kasi implements Comparable<Kasi> {

    private List<Kortti> kasi;

    public Kasi() {
        this.kasi = new ArrayList<>();

    }

    public void lisaa(Kortti kortti) {
       
        this.kasi.add(kortti);
    }

    public void tulosta() {
        Iterator<Kortti> ite = kasi.iterator();
        while (ite.hasNext()) {
            Kortti next = ite.next();

            System.out.println(next);
        }
    }

    public void jarjesta() {
        Collections.sort(kasi);
    }
    public void jarjestaMaittain(){
        Collections.sort(kasi, new SamatMaatVierekkainArvojarjestykseen());
    }

    @Override
    public int compareTo(Kasi kasi) {
        int tamaSumma = this.kasi.stream()
                .mapToInt(kortti -> kortti.getArvo())
                .sum();
        int kasiSumma = kasi.kasi.stream()
                .mapToInt(kortti -> kortti.getArvo())
                .sum();

        return  tamaSumma - kasiSumma;

    }

}
