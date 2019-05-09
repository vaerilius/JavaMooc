
public class Opettaja extends Henkilo{
    private int palkka;
    
    public Opettaja(String name, String osoite, int palkka) {
        super(name, osoite);
        this.palkka = palkka;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  palkka " +  this.palkka + " euroa/kk "; 
    }
    
  
    
}
