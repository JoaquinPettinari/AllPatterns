package Observer;

import java.util.ArrayList;
import java.util.List;

public class Smn {
    private final List<MeteoData> meteoData;

    public Smn() {
        this.meteoData = new ArrayList<>();
    }

    public void actializarInformacion(){
        meteoData.stream().forEach(meteoData1 -> meteoData1.informacionActualizada());
    }
}
