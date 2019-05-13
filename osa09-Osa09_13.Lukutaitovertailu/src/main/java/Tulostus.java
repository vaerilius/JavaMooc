
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Tulostus implements Comparable<Tulostus> {

    private String maa;
    private String sukupuoli;
    private double prosentti;
    private int vuosi;

    public Tulostus(String maa, int vuosi, String sukupuoli, double prosentti) {
        this.maa = maa;
        this.sukupuoli = sukupuoli;
        this.prosentti = prosentti;
        this.vuosi = vuosi;
    }

    public int getVuosi() {
        return vuosi;
    }

    public double getProsentti() {
        return prosentti;
    }

    public String getMaa() {
        return maa;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }


    @Override
    public String toString() {

        return this.getMaa() + " (" + this.getVuosi() + "), " + this.getSukupuoli().split(" ")[1] + ", " + this.getProsentti();
    }

    @Override
    public int compareTo(Tulostus o) {
        return new Double(this.prosentti).compareTo(o.getProsentti()); //To change body of generated methods, choose Tools | Templates.
    }

    public int compareTo(Tulostus v1, Tulostus v2) {
        return Double.compare(v1.getProsentti(), v2.getProsentti());
    }

}
