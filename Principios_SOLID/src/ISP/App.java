package ISP;

public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro();
        car.andarEnTierra();
        Avioneta avi = new Avioneta();
        avi.andarEnTierra();
        avi.volar();
        VehiculoAnfibio anf = new VehiculoAnfibio();
        anf.andarEnTierra();
        anf.navegar();
    }
}
