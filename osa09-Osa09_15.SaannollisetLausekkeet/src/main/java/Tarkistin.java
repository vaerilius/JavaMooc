
public class Tarkistin {

    public boolean onViikonpaiva(String merkkijono) {

        if (merkkijono.matches("(ma|ti|ke|to|pe|la|su)")) {
            System.out.println("Muoto on oikea.");
            return true;
        } else {
            System.out.println("Muoto ei ole oikea.");
            return false;
        }

    }

    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("(a|e|i|o|u|y|ä|ö){0,}")) {
            System.out.println("Muoto on oikea.");
            return true;
        } else {
            System.out.println("Muoto ei ole oikea.");
            return false;
        }
    }

    public boolean kellonaika(String merkkijono) {
        if (merkkijono.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            System.out.println("Muoto on oikea.");
            return true;
        } else {
            System.out.println("Muoto ei ole oikea.");
            return false;
        }
    }

}
