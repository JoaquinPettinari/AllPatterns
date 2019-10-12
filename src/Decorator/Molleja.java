package Decorator;

public class Molleja extends Hamburguesa{
    Hamburguesa hamburguesa;

    public Molleja(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 80;
    }
}
