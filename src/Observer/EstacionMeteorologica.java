package Observer;

public class EstacionMeteorologica {

    private final HumedadService humedadService;
    private final PresionService presionService;
    private final TemperaturaService temperaturaService;

    public EstacionMeteorologica(HumedadService humedadService, PresionService presionService, TemperaturaService temperaturaService) {
        this.humedadService = humedadService;
        this.presionService = presionService;
        this.temperaturaService = temperaturaService;
    }

    public HumedadService getHumedadService() {
        return humedadService;
    }

    public PresionService getPresionService() {
        return presionService;
    }

    public TemperaturaService getTemperaturaService() {
        return temperaturaService;
    }
}
