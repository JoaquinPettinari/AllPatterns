package Decorator;

public class BaconPapa extends PapaFrita {

    PapaFrita papita;

    public BaconPapa(PapaFrita papita) {
        this.papita = papita;
    }

    public PapaFrita getPapita() {
        return papita;
    }

    @Override
    public int getPrecio() {
        return getPapita().getPrecio() + 45;
    }
}
