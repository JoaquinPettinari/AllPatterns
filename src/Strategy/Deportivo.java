package Strategy;

public class Deportivo implements TipoConduccion {

    @Override
    public int velocidadMaxima() {
        return 180;
    }

    @Override
    public int consumo() {
        return 5;
    }
}
