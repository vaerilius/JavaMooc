

public class Opiskelija implements Comparable<Opiskelija>{

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }


    @Override
    public int compareTo(Opiskelija opiskelija) {
        
        return this.nimi.compareTo(opiskelija.getNimi());
    }
}
