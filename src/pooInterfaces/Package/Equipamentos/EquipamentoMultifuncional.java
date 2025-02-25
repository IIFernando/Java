package pooInterfaces.Package.Equipamentos;

import pooInterfaces.Package.Copiadora;
import pooInterfaces.Package.Digitalizadora;
import pooInterfaces.Package.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("Copiando documento via Multifuncional");
    }

 public void digitalizar() {
        System.out.println("Digitalizando documento via Multifuncional");
 }

 public void imprimir() {
        System.out.println("Imprimindo documento via Multifuncional");
 }
    
}
