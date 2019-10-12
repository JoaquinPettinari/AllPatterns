package Strategy;

public class Auto {

    private TipoConduccion tipoConduccion;
    private int cantidadCombustible;
    private int kilometraje = 0;

    public Auto(TipoConduccion tipoConduccion, int cantidadCombustible){
        this.tipoConduccion = tipoConduccion;
        this.cantidadCombustible = cantidadCombustible;

    }

    public void setCantidadCombustible(int cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public int getCantidadCombustible(){ return this.cantidadCombustible;}

    public int getKilometraje() {
        return kilometraje;
    }

    public int consumo(){
        return tipoConduccion.consumo();
    }

    public int velocidadMaxima(){
        return tipoConduccion.velocidadMaxima();
    }

    public void avanzar(int cuanto){
        int hastaDondeLlego = cantidadCombustible / tipoConduccion.consumo();
        if(cuanto > hastaDondeLlego){
            cantidadCombustible -= hastaDondeLlego;
            kilometraje += hastaDondeLlego;
        }
        else{
        cantidadCombustible -= cuanto / tipoConduccion.consumo();
        kilometraje += cuanto;
        }
    }



}
