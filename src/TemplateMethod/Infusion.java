package TemplateMethod;

public abstract class Infusion {
    protected double tiempoInfusion;
    protected int grados;

    public Infusion(double tiempoInfusion, int grados) {
        this.tiempoInfusion = tiempoInfusion;
        this.grados = grados;

        
    }

    public String servir() {
        return calentarAgua() +
        diferente2() +
        servirEnUnaTasa() +
        diferente1();
    }

    protected abstract String diferente1();

    protected abstract String diferente2();

    private String calentarAgua(){ return "Calentar el Agua ";}

    private String servirEnUnaTasa() { return "Servir en una tasa";}




}
