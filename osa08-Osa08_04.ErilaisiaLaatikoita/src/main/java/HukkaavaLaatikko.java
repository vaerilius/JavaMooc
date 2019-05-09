
import java.util.ArrayList;

class HukkaavaLaatikko extends Laatikko {

    private ArrayList<Tavara> tavarat;

    public HukkaavaLaatikko() {
        this.tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        this.tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {

        return false;
    }

}
