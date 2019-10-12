package TemplateMethod;

public class Te extends Infusion {

    public Te(TipoDeTe te) {
        super(te.tiempoInfusion(), te.temperaturaAgua());
    }

    @Override
    protected String diferente1() {
        return "Agregar azucar y/o leche opcionalmente";
    }

    @Override
    protected String diferente2() {
        return "Agregar la hojas de te al agua caliente";
    }
}
