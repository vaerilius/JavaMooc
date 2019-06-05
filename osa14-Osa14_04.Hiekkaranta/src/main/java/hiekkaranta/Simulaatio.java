package hiekkaranta;

import hiekkaranta.Tyyppi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Simulaatio {

    private Tyyppi[][] taulu;
    private int leveys;
    private int korkeus;

    public Simulaatio(int leveys, int korkeus) {
        this.taulu = new Tyyppi[leveys][korkeus];

        this.taulu = alusta();

        this.leveys = leveys;
        this.korkeus = korkeus;

    }

    public void lisaa(int x, int y, Tyyppi tyyppi) {
        if (!ruudussa(x, y)) {
            return;
        }

        this.taulu[x][y] = tyyppi;
    }

    public Tyyppi sisalto(int x, int y) {

        if (!ruudussa(x, y)) {
            return Tyyppi.METALLI;
        }
        return this.taulu[x][y];
    }

    public void paivita() {

        for (int x = 0; x < taulu.length; x++) {
            for (int y = taulu[x].length; y > 0; y--) {

                if (sisalto(x, y) == Tyyppi.HIEKKA) {
                    siirraHiekkaa(x, y);
                    continue;
                }
                if (sisalto(x, y) == Tyyppi.VESI) {
                    siirraVetta(x, y);
                    continue;
                }
            }
        }
    }

    private Tyyppi[][] alusta() {
        for (int i = 0; i < taulu.length; i++) {
            for (int j = 0; j < taulu[i].length; j++) {
                taulu[i][j] = Tyyppi.TYHJA;
            }
        }

        return this.taulu;
    }

    private Boolean ruudussa(int x, int y) {
        if (x < 0 || y < 0 || x >= this.taulu.length || y >= this.taulu[x].length) {
            return false;
        }
        return true;
    }

    private void siirraHiekkaa(int x, int y) {

        List<Piste> tyhjatJaVedetAlla = vapaatAlaPuolella(x, y, Tyyppi.TYHJA, Tyyppi.VESI);
        if (tyhjatJaVedetAlla.isEmpty()) {
            return;
        }
        vaihdaPaikkoja(tyhjatJaVedetAlla, x, y);

    }

    private void siirraVetta(int x, int y) {
        List<Piste> tyhjatAlapuolella = vapaatAlaPuolella(x, y, Tyyppi.TYHJA);
        if (!tyhjatAlapuolella.isEmpty()) {
            vaihdaPaikkoja(tyhjatAlapuolella, x, y);
            return;
        }

        if (sisalto(x + 1, y) == Tyyppi.TYHJA) {
            tyhjatAlapuolella.add(new Piste(x + 1, y));
        }
        if (sisalto(x - 1, y) == Tyyppi.TYHJA) {
            tyhjatAlapuolella.add(new Piste(x - 1, y));
        }

        if (!tyhjatAlapuolella.isEmpty()) {
            vaihdaPaikkoja(tyhjatAlapuolella, x, y);
        }

    }

    private List<Piste> vapaatAlaPuolella(int x, int y, Tyyppi... tyypit) {
        List<Piste> kohdat = new ArrayList<>();

        for (int i = -1; i <= 1; i++) {
            Tyyppi tarkastettavaKohta = sisalto(x + i, y + 1);

            boolean tyhjaTaiVesi = false;
            for (int j = 0; j < tyypit.length; j++) {
                Tyyppi tyhjaTaiVesiTyyppi = tyypit[j];
                if (tarkastettavaKohta == tyhjaTaiVesiTyyppi) {
                    tyhjaTaiVesi = true;
                    break;
                }
            }

            if (tyhjaTaiVesi) {
                kohdat.add(new Piste(x + i, y + 1));
            }
        }

        return kohdat;

    }

    private void vaihdaPaikkoja(List<Piste> tyhjatJaVedetAlla, int x, int y) {
        Collections.shuffle(tyhjatJaVedetAlla);
        Piste vaihdettavaAlla = tyhjatJaVedetAlla.get(0);
        Tyyppi vaihdettavaKohta = sisalto(x, y);
        taulu[x][y] = taulu[vaihdettavaAlla.getX()][vaihdettavaAlla.getY()];
        this.taulu[vaihdettavaAlla.getX()][vaihdettavaAlla.getY()] = vaihdettavaKohta;

    }

}
