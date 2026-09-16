package LSP;

// La superclase solo define lo que TODO vehículo cumple sin excepción
public abstract class Vehiculo {
    protected String marca;
    protected int velocidadMax;

    public Vehiculo(String marca, int velocidadMax) {
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }

    public abstract void acelerar();
}

