
public class Ostos {

    private int hinta;
    private String tuote;
    private int kpl;

    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.hinta = yksikkohinta;
    }

    public int hinta() {
        return this.hinta * this.kpl;
    }

    public void kasvataMaaraa() {
        this.kpl++;
    }

    public String nimi() {
        return this.tuote;
    }

    @Override
    public String toString() {
        return this.tuote + ": " + this.kpl;
    }

}
