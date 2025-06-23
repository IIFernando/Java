package POO.Package;

public class Retangulo {



    private double base;
    private double altura;
    private double area;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double Calculo(){
        area = this.base * this.altura;
        return area;
    }

    public void RetornoRetangulo() {
        double resultado = Calculo();  // chamada do método private
        System.out.println("Área: " + resultado);
    }
}
