
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Lukutaitovertailu {

    public static void main(String[] args) {
        ArrayList<Tulostus> rivit = lueTiedot("lukutaito.csv");
        Collections.sort(rivit);
        rivit.stream()
                .sorted()
                .forEach(rivi -> System.out.println(rivi));
    }

    public static ArrayList<Tulostus> lueTiedot(String tiedosto) {
        ArrayList<Tulostus> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get(tiedosto))
                    .map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length >= 5)
                    .map(palat -> new Tulostus(palat[3], Integer.valueOf(palat[4]), palat[2], Double.valueOf(palat[5])))
                    .forEach(rivi -> rivit.add(rivi));

        } catch (Exception e) {
            System.out.println("Virhe " + e.getMessage());
        }

        return rivit;
    }

    private static class Tulostus implements Comparable<Tulostus> {

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
            return this.getMaa() + " (" + this.getVuosi() + "), " + this.getSukupuoli() + ", " + this.getProsentti();
        }

        @Override
        public int compareTo(Tulostus o) {
            return new Double(this.prosentti).compareTo(o.getProsentti());
        }

    }
}
