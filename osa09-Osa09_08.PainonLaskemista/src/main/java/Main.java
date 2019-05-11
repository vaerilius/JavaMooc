
public class Main {

    public static void main(String[] args) {
        // käytä tätä pääohjelmaa luokkiesi testaamiseen!
        Matkalaukku laukku = new Matkalaukku(10);
        Matkalaukku laukku2 = new Matkalaukku(10);
        Lastiruuma ruuma = new Lastiruuma(20);

        laukku.lisaaTavara(new Tavara("tietokone", 5));
        laukku.lisaaTavara(new Tavara("Java-kirja", 4));
        laukku2.lisaaTavara(new Tavara("läppäri", 5));
        laukku2.lisaaTavara(new Tavara("Javanjatko-kirja", 4));
        
        ruuma.lisaaMatkalaukku(laukku);
        ruuma.lisaaMatkalaukku(laukku2);

        /*        System.out.println(laukku.yhteispaino());
        laukku.tulostaTavarat();*/
        
        ruuma.tulostaTavarat();
        System.out.println(ruuma.yhteispaino());

    }

}
