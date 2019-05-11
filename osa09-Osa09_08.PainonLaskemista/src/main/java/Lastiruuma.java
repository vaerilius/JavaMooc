
import java.util.ArrayList;

public class Lastiruuma {

    private ArrayList<Matkalaukku> matkalaukut;
    private int maksimipaino;

    public Lastiruuma(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.matkalaukut = new ArrayList<>();
    }

    public void lisaaMatkalaukku(Matkalaukku matkalaukku) {
        if (this.yhteispaino() + matkalaukku.yhteispaino() > maksimipaino) {
            return;
        }

        this.matkalaukut.add(matkalaukku);
    }

    public int yhteispaino() {
        int summa = this.matkalaukut.stream()
                .map(laukku -> laukku.yhteispaino())
                .reduce(0, (eSaldo, laukunPaino) -> eSaldo + laukunPaino);

        return summa;
    }

    public void tulostaTavarat() {
        
              matkalaukut.stream()
                .forEach(tavara -> tavara.tulostaTavarat());
    }

    @Override
    public String toString() {
        if (this.matkalaukut.isEmpty()) {
            return "ei matkalaukkuja (0 kg)";
        }

        if (this.matkalaukut.size() == 1) {
            return "1 matkalaukku (" + this.yhteispaino() + " kg)";
        }

        return this.matkalaukut.size() + " matkalaukkua (" + this.yhteispaino() + " kg)";
    }
}
