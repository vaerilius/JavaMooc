package maatila;

public class Maitosailio {

    private double sailio;
    private double saldo;

    public Maitosailio() {
        this.sailio = 2000;
        this.saldo = 0;
    }

    public Maitosailio(double tilavuus) {

        this.sailio = tilavuus;
        this.saldo = 0;
    }

    public double otaSailiosta(double maara) {
        if (this.saldo < maara) {
            this.saldo = 0;
        } else if (this.saldo > maara) {
                  this.saldo -= maara;
        }
  
        return this.saldo;
    }

    public void lisaaSailioon(double maara) {
        if (maara + this.saldo < this.sailio) {
            this.saldo += maara;
        } else {
            this.saldo = this.sailio;
        }
    }

    public double getTilavuus() {
        return this.sailio;
    }

    public double getSaldo() {
        return saldo;
    }

    public double paljonkoTilaaJaljella() {
        return (getTilavuus() - getSaldo());
    }

    @Override
    public String toString() {
        return Math.ceil(saldo) + "/" + Math.ceil(sailio);
    }

}
