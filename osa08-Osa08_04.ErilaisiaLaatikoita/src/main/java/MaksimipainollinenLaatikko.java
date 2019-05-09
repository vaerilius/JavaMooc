
import java.util.ArrayList;

class MaksimipainollinenLaatikko extends Laatikko {

    private int maksimipoinollinenLaatikko;
    private ArrayList<Tavara> tavarat;

    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipoinollinenLaatikko = maksimipaino;
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        int painoYhteensa = 0;
        for (Tavara tavara1 : tavarat) {
            painoYhteensa += tavara1.getPaino();
        }

        if (tavara.getPaino() <= this.maksimipoinollinenLaatikko - painoYhteensa) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        
        for (Tavara tamaTavara : tavarat) {
            if (tamaTavara.equals(tavara)) {
                return true;
            }
        }

        return false;
    }

}
