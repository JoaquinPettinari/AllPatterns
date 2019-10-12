package Decorator;

public class QuesoAzul extends Hamburguesa {
    Hamburguesa hamburguesa;

    public QuesoAzul(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 20;
    }
}
