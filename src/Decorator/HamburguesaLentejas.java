package Decorator;

public class HamburguesaLentejas extends Hamburguesa {
    @Override
    public int getPrecio() {
        return super.getPrecio() + 220;
    }
}
