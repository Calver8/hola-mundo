public class Main {
    public static void main(String[] args) {
        // Polimorfismo: tipo padre, objeto hijo
        Vehiculo auto = new Auto("Toyota", "Corolla", 2022, 4);
        Vehiculo moto = new Moto("Yamaha", "MT-07", 2023, 689);
        Vehiculo camion = new Camion("Scania", "R450", 2021, 25.5);

        auto.mostrarDatos();
        auto.mover();

        moto.mostrarDatos();
        moto.mover();

        camion.mostrarDatos();
        camion.mover();

        // Tambien funciona con un arreglo
        System.out.println("\n--- Arreglo de vehiculos ---");
        Vehiculo[] vehiculos = { auto, moto, camion };
        for (Vehiculo v : vehiculos) {
            v.mover();
        }
    }
}
