public class Comida extends Item {

    private int nivelHambreRestaurado;

    public Comida(String nombre, int cantidad) {
        super(nombre, "comida", cantidad);
        this.nivelHambreRestaurado = nivelHambreRestaurado;
    }

    @Override
    public void usar (Personaje personaje){
        personaje.nivelHambre += nivelHambreRestaurado;
        disminuirCantidad(1);
        System.out.println("Perfecto, has restaurado tu nivel de hambre en " + nivelHambreRestaurado + " puntos.");
    }
}
