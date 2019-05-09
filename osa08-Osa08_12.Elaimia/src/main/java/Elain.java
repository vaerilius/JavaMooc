
public abstract class Elain {

    private String nimi;

    public Elain(String nimi) {
        this.nimi = nimi;
    }
 
    public void syo() {
        System.out.println(getNimi() + " syo");
    }
    public void nuku() {
        System.out.println(getNimi() + " nukkuu");
    }
    public String getNimi() {
        return this.nimi;
    }
    
}
