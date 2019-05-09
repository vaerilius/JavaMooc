package hashmap;

public class Number implements Information {

    public String number;

    public Number(String number) {
        this.number = number;
    }

    @Override
    public void getNumber() {
        System.out.println(number);
    }

}
