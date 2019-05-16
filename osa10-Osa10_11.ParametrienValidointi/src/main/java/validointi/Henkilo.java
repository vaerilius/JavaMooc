package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        if (nimi == null || nimi.isEmpty() || nimi.length() > 40 ||
                ika < 0 || ika > 120) {
             throw new IllegalArgumentException("Nimi ei ole ");
        }
       
        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}
