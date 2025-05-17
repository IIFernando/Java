package POO;

import POO.Package.Equipamentos.EquipamentoMultifuncional;
//import poo.Package.Equipamentos.Deskjet;
// import poo.Package.Equipamentos.Lasejet;
import POO.Package.Impressora;

//Quando é preciso que uma classe herde de mais de uma classe, é possível utilizar interfaces.
//As interfaces são utilizadas para definir um contrato que outras classes devem seguir.
//A interface impressora define um contrato que as classes que a implementam devem seguir.
//A interface impressora possui um método chamado imprimir que deve ser implementado pelas classes que a implementam.
//A classe EquipamentoMultifuncional implementa a interface impressora.
//A classe EquipamentoMultifuncional possui um método chamado imprimir que implementa o método imprimir da interface impressora.
//A classe EquipamentoMultifuncional possui um método chamado digitalizar que implementa o método digitalizar da interface digitalizadora.
//A classe EquipamentoMultifuncional possui um método chamado enviarFax que implementa o método enviarFax da interface fax.
//A classe EquipamentoMultifuncional possui um método chamado imprimir que implementa o método imprimir da interface impressora.
public class Equipamentos {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
    }

}
