
public class Paaohjelma {

    public static void main(String[] args) {
        Elio elio = new Elio(20, 30);
        System.out.println(elio);
        elio.siirra(-10, 5);
        System.out.println(elio);
        elio.siirra(50, 20);
        System.out.println(elio);
    }
}
