package Decorator;

public abstract class Hamburguesa {
    protected int medallonesExtra = 0;

    public void agregarMedallon(){
        if(medallonesExtra <= 2){medallonesExtra++;}
        else throw new RuntimeException("Tiene que ser maximo 3 medallones extras");

    }

    protected int getMedallonesExtra() {
        return medallonesExtra;
    }

    public int getPrecio(){
        return 50 * getMedallonesExtra();
    }

}
