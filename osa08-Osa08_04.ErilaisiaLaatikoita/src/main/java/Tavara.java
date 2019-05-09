
public class Tavara{

    private String nimi;
    private int paino;
   
    
    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
        
    }

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return nimi;
    }

    public int getPaino() {
        return paino;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Tavara verrattava = (Tavara) obj;

        if (this.nimi == null || !this.nimi.equals(verrattava.getNimi())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.nimi.hashCode();
    }
}
