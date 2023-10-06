public class Main {

    public static void main(String[] args) {
        // Usando cada elemento de la enumeración Transporte
        for (Transporte transporte : Transporte.values()) {
            System.out.println("type of transport: " + transporte);
            System.out.println("engine type: " + transporte.getMotor());
            System.out.println("capacity: " + transporte.getCapacidad() + " passengers");
            System.out.println(transporte.mostrarDescripcion());
            System.out.println();
        }
    }
}
