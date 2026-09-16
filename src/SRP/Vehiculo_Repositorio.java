package SRP;

public class Vehiculo_Repositorio{

    private Vehiculo v;
    
    public Vehiculo_Repositorio(Vehiculo v){
        this.v = v;
    }
    //Responsablidad Persistencia
    public void guardar(Vehiculo v) {
        System.out.println("Conectando a la BD ...");
        System.out.println("INSERT INTO vehiculos VALUES (" + v.getMarca() + ", " + v.getVelocidadMax() + ")");
    }
}
