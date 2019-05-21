
public class Piilo<T> {

    private T t;

    public Piilo() {
        this.t = null;

    }

    public void laitaPiiloon(T piilotettava) {
        this.t = piilotettava;
    }

    public T otaPiilosta() {

        T uusi = this.t;
        if (onkoPiilossa()) {
            this.t = null;
        }
        return uusi;
    }

    public boolean onkoPiilossa() {

        return this.t != null;
    }

}
