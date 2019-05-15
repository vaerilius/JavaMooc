import java.util.Comparator;

public class SamatMaatVierekkain implements Comparator<Kortti> {
    public int compare(Kortti k1, Kortti k2) {
        return k1.getMaa().ordinal() - k2.getMaa().ordinal();
    }
}