
public class Sivari implements Palvelusvelvollinen{

    private int paivia;
    public Sivari() {
        this.paivia = 362;
    }
    
    @Override
    public int paiviaJaljella() {
        return this.paivia;
    }

    @Override
    public void palvele() {
        if (this.paiviaJaljella() > 0) {
            this.paivia--;
        }
    }
    
}
