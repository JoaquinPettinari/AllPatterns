package TemplateMethod;

public class TeNegro implements TipoDeTe {

    @Override
    public int temperaturaAgua() {
        return 95;
    }

    @Override
    public double tiempoInfusion() {
        return 360;
    }
}
