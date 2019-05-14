
public class Kirja implements Comparable<Kirja> {

    private String nimi;
    private int minIka;

    public Kirja(String nimi, int minIka) {
        this.nimi = nimi;
        this.minIka = minIka;
    }

    public String getNimi() {
        return nimi;
    }

    public int getMinIka() {
        return minIka;
    }

    @Override
    public String toString() {
        
        return this.nimi + " ("+this.minIka +" vuotiaille ja vanhemmille)";
    }

    @Override
    public int compareTo(Kirja kirja) {
        return 0;
    }

}
