package Decorator;

public class HamburguesaCarne extends Hamburguesa {
    //Probando
    @Override
    public int getPrecio() {
        return super.getPrecio() + 200;
    }

}

