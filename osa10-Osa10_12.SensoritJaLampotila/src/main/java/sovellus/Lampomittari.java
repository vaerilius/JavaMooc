package sovellus;

import java.util.Random;

public class Lampomittari implements Sensori {

    private boolean onkoMittariPaalla = false;

    @Override
    public boolean onPaalla() {
        return this.onkoMittariPaalla;
    }

    @Override
    public void paalle() {
        this.onkoMittariPaalla = true;
    }

    @Override
    public void poisPaalta() {
        this.onkoMittariPaalla = false;
    }

    @Override
    public int mittaa() {
        if (!onPaalla()) {
            throw new IllegalStateException("Mittari ei ole päällä");
        }

        
        return  new Random().nextInt(31 + 30) - 30;
    }

}
