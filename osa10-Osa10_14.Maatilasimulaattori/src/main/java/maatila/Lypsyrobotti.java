package maatila;

public class Lypsyrobotti {

    private Maitosailio maitosailio;
    

    public Lypsyrobotti() {
        this.maitosailio = null;    
    }

    public Maitosailio getMaitosailio() {

        return this.maitosailio ;
    }

    public void setMaitosailio(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;
    }

    public void lypsa(Lypsava lypsava) {
        if (maitosailio == null) {
            throw new IllegalStateException("Maidot menevät hukkaan!");
        }

        this.maitosailio.lisaaSailioon(lypsava.lypsa());
        
    }



}
