package SRP;
public class Vehiculo {
    private String marca;
    private int velocidadMax;

    public Vehiculo(String marca, int velocidadMax){
        this.marca = marca;
        this.velocidadMax = velocidadMax;
    }
    
    public void acelerar(){
        System.out.println(marca+ " esta acelerando");
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
