package Decorator;

public class Huevo extends Hamburguesa {
    Hamburguesa hamburguesa;

    public Huevo(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 10;
    }
}
