public class Comida extends Item {

    private int nivelHambreRestaurado;
    private int nivelSedRestaurado;

    public Comida(String nombre, int cantidad, int nivelHambreRestaurado, int nivelSedRestaurado) {
        super(nombre, "comida", cantidad);
        this.nivelHambreRestaurado = nivelHambreRestaurado;
        this.nivelSedRestaurado = nivelSedRestaurado;
    }

     public int getNivelHambreRestaurado() {
        return nivelHambreRestaurado;

    }

    public int getNivelSedRestaurado() {
        return nivelSedRestaurado;
    }


    //METODO DE USAR COMIDA
    @Override
    public void usar (Personaje personaje){
    
         if (this.cantidad > 0) {

            int nuevoNivel =
                personaje.getNivelHambre() + nivelHambreRestaurado;

            if (nuevoNivel > 10) {
                nuevoNivel = 10;
            }

            personaje.setNivelHambre(nuevoNivel);

            disminuirCantidad(1);

            System.out.println(
                "Perfecto, has restaurado tu nivel de hambre en "
                + nivelHambreRestaurado
                + " puntos."
            );

        } else {
            System.out.println("No tienes suficiente comida para comer.");
        }
    }

    
}