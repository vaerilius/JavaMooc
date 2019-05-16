
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;


public class Sovelluslogiikka {
    private Kayttoliittyma kayttoliittyma;
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.kayttoliittyma = kayttoliittyma;
    }
    public void suorita(int montaKertaa) {
        for (int i = 0; i < montaKertaa; i++) {
            System.out.println("Sovelluslogiikka toimii");
            this.kayttoliittyma.paivita();
        }
    }
    
}
