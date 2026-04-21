// Herencia: Camion hereda de Vehiculo
public class Camion extends Vehiculo {
    private double toneladas;

    public Camion(String marca, String modelo, int anio, double toneladas) {
        super(marca, modelo, anio);
        this.toneladas = toneladas;
    }

    // Polimorfismo: sobrescribe el metodo del padre
    @Override
    public void mover() {
        System.out.println("El camion " + marca + " lleva " + toneladas + " toneladas.");
    }
}
