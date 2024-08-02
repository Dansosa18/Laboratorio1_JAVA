package umg.principal.Conductores;
public class ConductorDeMoto extends Conductor{
    private boolean tieneLicenciaMoto;
    public ConductorDeMoto(String nombre, String licencia, boolean tieneLicenciaMoto) {
        super(nombre, licencia);
        this.tieneLicenciaMoto = tieneLicenciaMoto;

    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene Licencia de Moto: " + tieneLicenciaMoto);
    }
}