package POO.Package;

public class Quadrado {

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private double lado(double lado){
        this.area = lado * lado;
        return area;
    }

    public void calcularArea() {
        double resultado = lado(area);  // chamada do método private
        System.out.println("Área: " + resultado);
    }
}
