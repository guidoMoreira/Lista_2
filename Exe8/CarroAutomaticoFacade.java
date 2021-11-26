package Exe8;

public class CarroAutomaticoFacade {
    private Freios freios;
    private Motor motor;
    private Portas portas;

    public CarroAutomaticoFacade(){
        freios = new Freios();
        motor = new Motor();
        portas = new Portas();
    }

    public void LigarCarro(){
        freios.Checar();
        portas.Trancar();
        motor.Ligar();
    }
}
