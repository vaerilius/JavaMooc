
public class Henkilo {

   private String name;
    private String osoite;

    public Henkilo(String name, String osoite) {
        this.name = name;
        this.osoite = osoite;
    }

    @Override
    public String toString() {
        
        return this.name + "\n"
                + "  " + this.osoite; 
    }
    

}
