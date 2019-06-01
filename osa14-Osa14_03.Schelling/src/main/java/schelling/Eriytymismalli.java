package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private Taulukko taulukko;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;

    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.taulukko = new Taulukko(leveys, korkeus);

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        arvoAlkuarvot();
    }

    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {

                // Random-luokan metodi nextDouble palauttaa satunnaisen luvun
                // nollan ja yhden välillä
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();

                // jos 100*arvo on pienempi kuin prosAlueestaKaytossa, paikkaan
                // asetetaan arvo
                if (100 * satunnainenLukuNollanJaYhdenValilla < prosAlueestaKaytossa) {
                    int ryhma = 1 + arpoja.nextInt(ryhmienLukumaara);

                    this.taulukko.aseta(x, y, ryhma);

                }
            }
        }
    }

    public Taulukko getData() {
        return this.taulukko;
    }

    public void setData(Taulukko taulukko) {
        this.taulukko = taulukko;
    }

    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        // Luo täällä lista, missä on kaikki tyhjät paikat piste-olioina.
        // Tyhjissä paikoissa on arvo 0
        for (int i = 0; i < this.taulukko.getKorkeus(); i++) {
            for (int j = 0; j < taulukko.getLeveys(); j++) {

                if (this.taulukko.hae(i, j) == 0) {
                    tyhjat.add(new Piste(i, j));
                }

            }
        }

        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomat = haeTyytymattomat();

        if (tyytymattomat.isEmpty()) {
            return;
        }

        Collections.shuffle(tyytymattomat);

        while (!tyytymattomat.isEmpty()) {
            Piste tyytymaton = tyytymattomat.remove(0);

            ArrayList<Piste> tyhjat = tyhjatPaikat();
            Collections.shuffle(tyhjat);

            Piste tyhja = tyhjat.get(0);

            int tyytymattomanRyhma = this.taulukko.hae(tyytymaton.getX(), tyytymaton.getY());

            this.taulukko.aseta(tyhja.getX(), tyhja.getY(), tyytymattomanRyhma);
            this.taulukko.aseta(tyytymaton.getX(), tyytymaton.getY(), 0);
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        // Etsi täällä tyytymättömät

        for (int i = 0; i < taulukko.getKorkeus(); i++) {
            for (int j = 0; j < taulukko.getLeveys(); j++) {
                int arvo = taulukko.hae(i, j);

                if (arvo == 0) {
                    continue;
                }
                if (naapureita(arvo, i, j)) {
                    tyytymattomat.add(new Piste(i, j));
                }

            }

        }

        return tyytymattomat;
    }

    public void tyhjenna() {
        for (int i = 0; i < this.taulukko.getKorkeus(); i++) {
            for (int j = 0; j < taulukko.getLeveys(); j++) {
                this.taulukko.aseta(i, j, 0);
            }
        }
    }

    private boolean naapureita(int arvo, int x, int y) {
        int count= 0;
        for (int i = x-1; i <= x +1; i++) {
            for (int j = y -1; j <= y +1; j++) {

                if (arvo== taulukko.hae(i, j)) {
                    count++;
                }
            }
        }

        return count <= tyytyvaisyysraja;
    }

}
