package LSP;

public class App {
    public static void main(String[] args) throws Exception {
        Carro car = new Carro("Mazda", 203);
        Bicicleta bike = new Bicicleta("BMX", 30);

        bike.acelerar();
        car.acelerar();
    }
}
