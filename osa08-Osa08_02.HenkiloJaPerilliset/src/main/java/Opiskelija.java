
public class Opiskelija extends Henkilo {

    private int opistopisteita;

    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opistopisteita = 0;
    }

    public int opintopisteita() {
        return this.opistopisteita;
    }

    public void opiskele() {
       this.opistopisteita++;
    }

    @Override
    public String toString() {
     return super.toString() + "\n"
             + "  opintopisteitä " + this.opistopisteita;
    }
    

}
