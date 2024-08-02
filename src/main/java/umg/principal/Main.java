package umg.principal;

import umg.principal.Conductores.Conductor;
import umg.principal.Conductores.ConductorDeCoche;
import umg.principal.Conductores.ConductorDeMoto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conductor conductor1 = new Conductor("Juan Perez", "456585");
        ConductorDeCoche conductor2 = new ConductorDeCoche("Ana Garcia", "45845484", 5);
        ConductorDeMoto conductor3= new ConductorDeMoto("Pedro Jimenez", "46568656", true);

        conductor1.mostrarInformacion();
        System.out.println(conductor1.toString());
        conductor2.mostrarInformacion();
        System.out.println(conductor2.toString());
        conductor3.mostrarInformacion();
        System.out.println(conductor3.toString());

    }

}