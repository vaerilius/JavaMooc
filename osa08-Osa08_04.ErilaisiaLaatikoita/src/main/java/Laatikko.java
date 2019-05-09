
import java.util.ArrayList;

public abstract class Laatikko {

    public abstract void lisaa(Tavara tavara);

    public void lisaa(ArrayList<Tavara> tavarat) {
        for (Tavara tavara : tavarat) {
            lisaa(tavara);
        }
    }

    public abstract boolean onkoLaatikossa(Tavara tavara);
}
