// Herencia: Auto hereda de Vehiculo
public class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int anio, int puertas) {
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    // Polimorfismo: sobrescribe el metodo del padre
    @Override
    public void mover() {
        System.out.println("El auto " + marca + " anda por la ruta con " + puertas + " puertas.");
    }
}
