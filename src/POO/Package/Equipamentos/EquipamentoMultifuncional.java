package POO.Package.Equipamentos;

import POO.Package.Copiadora;
import POO.Package.Digitalizadora;
import POO.Package.Impressora;

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
