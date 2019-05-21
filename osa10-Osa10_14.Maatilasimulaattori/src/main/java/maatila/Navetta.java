package maatila;

import java.util.List;

public class Navetta {

    private Maitosailio maitosailio;
    private Lypsyrobotti lypsyrobootti;

    public Navetta(Maitosailio maitosailio) {
        this.maitosailio = maitosailio;

    }

    public Maitosailio getMaitosailio() {
        return maitosailio;
    }

    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti) {
        this.lypsyrobootti = lypsyrobotti;
        this.lypsyrobootti.setMaitosailio(maitosailio);
    }

    public void hoida(Lehma lehma) {
        if (lypsyrobootti == null) {
            throw new IllegalStateException("Robottia ei ole asennettu");
        }
        this.lypsyrobootti.lypsa(lehma);
    }

    public void hoida(List<Lehma> lehmat) {

        if (this.lypsyrobootti == null) {
            throw new IllegalStateException("Robottia ei ole asennettu");
        }

        lehmat.stream()
                .map(lehma -> lehma)
                .forEach(lehma -> this.lypsyrobootti.lypsa(lehma));

    }

    @Override
    public String toString() {
        return "Navetta: " + this.maitosailio.toString();
    }

}
