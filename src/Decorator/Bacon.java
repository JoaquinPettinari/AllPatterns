package Decorator;

public class Bacon extends Hamburguesa {
    Hamburguesa hamburguesa;

    public Bacon(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 50;
    }
}
