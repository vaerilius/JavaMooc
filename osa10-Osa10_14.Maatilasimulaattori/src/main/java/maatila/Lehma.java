package maatila;

import java.util.Random;
import maatila.Eleleva;
import maatila.Lypsava;

public class Lehma implements Lypsava, Eleleva {

    private String nimi;
    private double utareidenTilavuus;
    private double saldo;
    private static final String[] NIMIA = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Lehma() {

        this.nimi = NIMIA[new Random().nextInt(26)];
        this.saldo = 0;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
    }

    public Lehma(String nimi) {
        this.nimi = nimi;
        this.utareidenTilavuus = 15 + new Random().nextInt(26);
        this.saldo = 0;
    }

    public double getTilavuus() {
        return this.utareidenTilavuus;
    }

    public String getNimi() {
        return nimi;
    }

    public double getMaara() {
        return saldo;
    }

    public double getUtareidenTilavuus() {
        return utareidenTilavuus;
    }

    @Override
    public String toString() {
        return this.nimi + " " + Math.ceil(saldo) + "/" + this.utareidenTilavuus;
    }

    @Override
    public double lypsa() {
        double maitoaLypsettiin = Math.abs(saldo);
        this.saldo = 0;
        return maitoaLypsettiin;
    }

    @Override
    public void eleleTunti() {

        this.saldo += 1 + new Random().nextDouble();
        if (this.saldo > getUtareidenTilavuus()) {
            this.saldo = getUtareidenTilavuus();
        }

    }

}
