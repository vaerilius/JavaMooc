
public class Main {

    public static void main(String[] args) {
        Aanteleva koira = new Koira();
        koira.aantele();

        Aanteleva kissa = new Kissa("Karvinen");
        kissa.aantele();
        Kissa k = (Kissa) kissa;
        k.mourua();

    }

}
