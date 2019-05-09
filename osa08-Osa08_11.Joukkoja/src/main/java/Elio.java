
public class Elio implements Siirrettava {

    private int x;
    private int y;

    public Elio(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

    @Override
    public void siirra(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

}
