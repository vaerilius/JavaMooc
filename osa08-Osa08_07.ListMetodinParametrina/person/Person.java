package person;

public class Person implements NewInterface {

    private String name;
    private String city;
    private Birthday birthday;

    public Person(String name, String city, Birthday birthday) {
        this.name = name;
        this.city = city;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void getPerson() {

        System.out.println("name: " + this.name);
        System.out.println("City: " + this.city);

        System.out.println("Birthday: " + this.birthday);
    }

}
