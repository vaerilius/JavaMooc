package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        if (luvusta < 0) {
            throw new IllegalArgumentException("Luku ei saa olla nega");
        }

        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (joukonKoko < 0 || osaJoukonKoko < 0) {
            throw new IllegalArgumentException("Luvut ei saa olla nega");
        }

        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
