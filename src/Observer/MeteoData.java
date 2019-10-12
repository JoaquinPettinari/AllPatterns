package Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.*;

public class MeteoData {

    private final EstacionMeteorologica estacionMeteorologica;
    private final List<Display> displayList;

    public MeteoData(EstacionMeteorologica estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
        this.displayList = new ArrayList<>();
    }

    public void agregarDisplay(Display display){
        displayList.add(display);
    }

    public void eliminarDisplay(Display display){
        displayList.remove(display);
    }


    public EstacionMeteorologica getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public double getHumedad(){
        return getEstacionMeteorologica().getHumedadService().getHumedad();
    }

    public double getTemperatura(){
        return getEstacionMeteorologica().getTemperaturaService().getTemperatura();
    }

    public double getPresion(){
        return getEstacionMeteorologica().getPresionService().getPresion();
    }

    /**
     * No nos interesa saber como MeteData obtiene los datos de la estación meteorológica.
     * Solo nos interesa saber que cada vez q algún dato se actualiza, se ejecuta el método
     * informacionActualizada
     */
    public void informacionActualizada() {
        displayList.stream().forEach( display -> display.actualizarDatos(getTemperatura(), getPresion(), getHumedad()));
    }

    public void situacionActual(){
        displayList.stream().forEach(display -> System.out.println(display.toString()));

    }
}
