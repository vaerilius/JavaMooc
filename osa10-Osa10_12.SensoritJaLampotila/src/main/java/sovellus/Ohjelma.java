package sovellus;

public class Ohjelma {

public static void main(String[] args) {
Keskiarvosensori ka = new Keskiarvosensori();
ka.lisaaSensori( new Vakiosensori(4) );
ka.lisaaSensori( new Vakiosensori(5) );
ka.lisaaSensori( new Vakiosensori(9) );

ka.mittaa();
    System.out.println(ka.mittaa());
}

}
