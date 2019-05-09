package hashmap;

public class Adress implements Information {

    private String city;
    private String andress;

    public Adress(String city, String andress) {
        this.city = city;
        this.andress = andress;
    }

    @Override
    public void getNumber() {
        System.out.println(city);
        System.out.println(andress);
    }

}
