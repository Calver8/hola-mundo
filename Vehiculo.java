// Clase padre
public class Vehiculo {
    // Atributos
    protected String marca;
    protected String modelo;
    protected int anio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Metodo que las clases hijas van a sobrescribir (polimorfismo)
    public void mover() {
        System.out.println("El vehiculo se mueve.");
    }

    public void mostrarDatos() {
        System.out.println(marca + " " + modelo + " (" + anio + ")");
    }
}
