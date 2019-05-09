
public class MuistavaTuotevarasto extends Tuotevarasto {

    private Muutoshistoria muutoshistoria;

    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        super.lisaaVarastoon(alkuSaldo);
        this.muutoshistoria = new Muutoshistoria();
        this.muutoshistoria.lisaa(alkuSaldo);

    }

    public void lisaaVarastoon(double maara) {

        super.lisaaVarastoon(maara);
        this.muutoshistoria.lisaa(super.getSaldo());
    }

    public double otaVarastosta(double maara) {
        this.muutoshistoria.lisaa(super.getSaldo() - maara);

        return super.otaVarastosta(maara);
    }

    public void tulostaAnalyysi() {
        String analyysi;
        
        analyysi = "Tuote: " + super.getNimi() + "\n"
                + "Historia: " + historia() + "\n"
                + "Suurin tuotemäärä: " + this.muutoshistoria.maxArvo() + "\n"
                + "Pienin tuotemäärä: " +  this.muutoshistoria.minArvo()  + "\n"
                + "Keskiarvo: " +  this.muutoshistoria.keskiarvo()
                ;
        System.out.println(analyysi);

    }

    public String historia() {

        return "" + this.muutoshistoria;
    }

}
