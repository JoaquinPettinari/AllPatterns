package Decorator;

public class Cheddar extends PapaFrita {

    PapaFrita papita;

    public Cheddar(PapaFrita papita) {
        this.papita = papita;
    }

    public PapaFrita getPapita() {
        return papita;
    }

    @Override
    public int getPrecio() {
        return getPapita().getPrecio() + 30;
    }
}
