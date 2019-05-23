
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        Random arpoja = new Random();
        while (this.numerot.size() < 7) {
            int arvottuLuku = arpoja.nextInt(40) + 1;
            if (!sisaltaaNumeron(arvottuLuku)) {
                numerot.add(arvottuLuku);
            }

        }

        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
    }

    public boolean sisaltaaNumeron(int numero) {

        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
        return this.numerot.contains(numero);
    }
}
