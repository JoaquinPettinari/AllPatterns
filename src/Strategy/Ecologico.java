package Strategy;

public class Ecologico implements TipoConduccion {

    @Override
    public int velocidadMaxima() {
        return 120;
    }

    @Override
    public int consumo() {
        return 16;
    }
}
