public class Henkilo {
    private String nimi;
    private Koulutus status;

    public Henkilo(String nimi, Koulutus status) {
        this.nimi = nimi;
        this.status = status;
    }

    public String getNimi() {
        return nimi;
    }
    public Koulutus getKoulutus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.status; 
    }
    
    
    
}
