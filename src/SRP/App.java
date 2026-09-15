package SRP;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vehiculo carro1 = new Vehiculo("Renault", 200);
        Vehiculo_Repositorio carroRepo = new Vehiculo_Repositorio(carro1);
        Vehiculo_Reporte carroReport = new Vehiculo_Reporte(carro1);

        carro1.acelerar();
        carroRepo.guardar(carro1);
        carroReport.generarPDF(carro1);
        
    }
}
