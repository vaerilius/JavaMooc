package sovellus;

public class Vakiosensori implements Sensori {

    private int mittausArvo;

    public Vakiosensori(int mittausArvo) {
        this.mittausArvo = mittausArvo;
    }

    @Override
    public boolean onPaalla() {
        return true;
    }

    @Override
    public void paalle() {
      
    }

    @Override
    public void poisPaalta() {
        
    }

    @Override
    public int mittaa() {

        return this.mittausArvo;
    }

}
