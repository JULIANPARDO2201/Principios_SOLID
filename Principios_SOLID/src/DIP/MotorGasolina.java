package DIP;

// Detalles concretos (bajo nivel), dependen de la abstracción Motor
public class MotorGasolina implements Motor {
    @Override
    public void encender() {
        System.out.println("Motor a gasolina encendido.");
    }
}
