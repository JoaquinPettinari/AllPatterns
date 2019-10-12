package TemplateMethod;

public class TeVerde implements TipoDeTe{

    @Override
    public int temperaturaAgua() {
        return 65;
    }

    @Override
    public double tiempoInfusion() {
        return 90;
    }
}
