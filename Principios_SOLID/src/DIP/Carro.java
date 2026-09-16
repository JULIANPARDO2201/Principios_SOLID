package DIP;

// Carro (alto nivel) depende de la ABSTRACCIÓN Motor, no de un detalle
public class Carro {
    private Motor motor;

    // El motor se "inyecta" desde afuera, vía constructor
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public void arrancar() {
        motor.encender();
    }
}
