package pooInterfaces.Package.Equipamentos;

import pooInterfaces.Package.Digitalizadora;

public class Scanner implements Digitalizadora {
    public void digitalizar() {
        System.out.println("Digitalizando documento no Scanner");
    }

}
