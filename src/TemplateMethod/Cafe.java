package TemplateMethod;

public class Cafe extends Infusion {

    public Cafe(double tiempoInfusion, int grados) {
        super(tiempoInfusion, grados);
    }

    @Override
    protected String diferente1() {
        return "Agregar azucar, Leche/Limón adicionalmente";
    }

    @Override
    protected String diferente2() {
        return "Pasar el agua a presión sobre el grano de cafe molido";
    }
}
