package Decorator;

public class CebollaCaramelizada extends Hamburguesa {
    Hamburguesa hamburguesa;

    public CebollaCaramelizada(Hamburguesa hamburguesa){
        this.hamburguesa = hamburguesa;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    @Override
    public int getPrecio() {
        return getHamburguesa().getPrecio() + 60;
    }
}
