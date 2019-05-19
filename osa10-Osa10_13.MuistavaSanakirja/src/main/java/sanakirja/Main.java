package sanakirja;

public class Main {

    public static void main(String[] args) {
        MuistavaSanakirja s = new MuistavaSanakirja("sanat.txt");
        s.lataa();
        s.kaanna("olut");
        s.tallenna();

    }
}
