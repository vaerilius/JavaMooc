
import java.util.ArrayList;

public class Muutoshistoria {

    private ArrayList<Double> muutoshistoria;

    public Muutoshistoria() {

        this.muutoshistoria = new ArrayList<>();
    }

    public void lisaa(double tilanne) {
        this.muutoshistoria.add(tilanne);
    }

    public void nollaa() {

        this.muutoshistoria.removeAll(muutoshistoria);

    }

    public double maxArvo() {

        if ((this.muutoshistoria.size() > 0)) {
            double maxArvo = this.muutoshistoria.get(0);
            for (int i = 1; i < this.muutoshistoria.size(); i++) {
                if (maxArvo < this.muutoshistoria.get(i)) {
                    maxArvo = this.muutoshistoria.get(i);
                }
            }
            return maxArvo;
        }
        return 0;

    }

    public double minArvo() {
        if ((this.muutoshistoria.size() > 0)) {
            double minArvo = this.muutoshistoria.get(0);
            for (int i = 1; i < this.muutoshistoria.size(); i++) {
                if (minArvo > this.muutoshistoria.get(i)) {
                    minArvo = this.muutoshistoria.get(i);
                }
            }
            return minArvo;
        }
        return 0;
    }

    public double keskiarvo() {
        if ((this.muutoshistoria.size() > 0)) {
            double keskiArvo = 0;
            double summa = 0;

            for (int i = 0; i < this.muutoshistoria.size(); i++) {
                summa += this.muutoshistoria.get(i);
            }

            return (summa / this.muutoshistoria.size());
        }
        return 0;
    }

    public String toString() {

        return "" + this.muutoshistoria;
    }

}
