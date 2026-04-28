// Herencia: Moto hereda de Vehiculo
public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    // Polimorfismo: sobrescribe el metodo del padre
    @Override
    public void mover() {
        System.out.println("La moto " + marca + " acelera con " + cilindrada + "cc.");
    }
}
