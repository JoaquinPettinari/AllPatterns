package TemplateMethod;

public class TeBlanco implements TipoDeTe {

    @Override
    public int temperaturaAgua() {
        return 85;
    }

    @Override
    public double tiempoInfusion() {
        return 240;
    }
}
