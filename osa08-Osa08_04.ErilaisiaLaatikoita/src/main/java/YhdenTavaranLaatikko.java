
import java.util.ArrayList;

class YhdenTavaranLaatikko extends Laatikko {

    private ArrayList<Tavara> tavarat;

    public YhdenTavaranLaatikko() {

        this.tavarat = new ArrayList<>();

    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavarat.size() == 0) {
            this.tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {

        for (Tavara tavara1 : tavarat) {
            if (tavara1.equals(tavara)) {
                  return true;
            }
        }

        return false;
    }

}
