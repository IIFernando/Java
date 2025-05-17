package POO.Package.Equipamentos;
import POO.Package.Copiadora; // Precisa importar a interface copiadora

// Implementa a interface copiadora
// E ao invés de utilizar extends, utiliza-se implements
public class Xerox implements Copiadora {
    // Implementado a interface copiadora
    public void copiar() {
        System.out.println("Copiando documento na Xerox");
    }

}
