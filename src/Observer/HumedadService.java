package Observer;

import java.util.Random;

public class HumedadService {

    public double getHumedad() {
        return new Random().nextDouble();
    }
}
