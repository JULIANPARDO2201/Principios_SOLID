package SRP;

public class Vehiculo_Reporte{
    
    private Vehiculo v;
    
    public Vehiculo_Reporte(Vehiculo v){
        this.v = v;
    }

    //Responsablidad Reporte
    public void generarPDF(Vehiculo v) {
        System.out.println("Generando PDF con los datos de "+ v.getMarca()+"...");
    }
}
