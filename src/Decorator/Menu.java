package Decorator;

public class Menu {
    Hamburguesa hamburguesa;
    PapaFrita papaFrita;

    public Menu(Hamburguesa hamburguesa, PapaFrita papaFrita) {
        this.hamburguesa = hamburguesa;
        this.papaFrita = papaFrita;
    }

    public int precioCocaCola(){
        return 40;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public PapaFrita getPapaFrita() {
        return papaFrita;
    }

    public double descuento(){
        return (getHamburguesa().getPrecio() + getPapaFrita().getPrecio()) * 0.20;
    }

    public double precio(){                                 // PONGO UN METODO DE COCA, POR LAS DUDAS.
        return getHamburguesa().getPrecio() + getPapaFrita().getPrecio() + precioCocaCola() - descuento();
    }


}
