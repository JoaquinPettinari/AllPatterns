package Decorator;

public class SalsaBarbacoa extends PapaFrita {

    PapaFrita papita;

    public SalsaBarbacoa(PapaFrita papita) {
        this.papita = papita;
    }

    public PapaFrita getPapita() {
        return papita;
    }

    @Override
    public int getPrecio() {
        return getPapita().getPrecio() + 20;
    }
}
