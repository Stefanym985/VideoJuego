import java.util.ArrayList;

public class Personaje {

    protected int nivelHambre;
    protected int nivelSed;
    protected int vida; 
    protected String ventaja;
    protected String desventaja;
    protected String nombre;
    private Inventario inventario;

    

    public Personaje (int nivelHambre, int nivelSed, int vida, String ventaja, String desventaja, String nombre){
        this.nivelHambre = nivelHambre;
        this.nivelSed = nivelSed;
        this.vida = vida;
        this.ventaja = ventaja;
        this.desventaja = desventaja;
        this.nombre = nombre;
        this.inventario = new Inventario();
    }
    public Inventario getInventario(){
        return inventario;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public int getNivelSed() {
        return nivelSed;
    }

    public int getVida() {
        return vida;
    }

    public String getVentaja() {
        return ventaja;
    }

    public String getDesventaja() {
        return desventaja;
    }
    public String getNombre() {
        return nombre;
    }

    // SETTERS 
    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    public void setNivelSed(int nivelSed) {
        this.nivelSed = nivelSed;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = vida;
        }
    }

    public void setVentaja(String ventaja) {
        this.ventaja = ventaja;
    }

    public void setDesventaja(String desventaja) {
        this.desventaja = desventaja;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//METODO DE VIDA Y DESGASTE
    
    public void vida() {
        if (this.nivelHambre == 0 || this.nivelSed == 0) {
            this.vida -= 2;
        } 
        System.out.println("se esta ejecutando el metodo de desgaste");
    }

    // METODO DE DESGASTE
    public void desgaste() {// Cada vez que se ejecuta este metodo le va quitando 3 puntos en hambre y sed a los personajes por medio del cronometro cada 3 minutos 
        this.nivelHambre -= 3; 
        this.nivelSed -= 3;

        if (this.nivelHambre <= 0) this.nivelHambre = 0;
        if (this.nivelSed <= 0) this.nivelSed = 0;

        if (this.nivelHambre <= 0 || this.nivelSed <= 0) {  // Si nivel de hambre o sed llegan a cero la vida decrece en 2 puntos
        this.vida -= 2;
    }
    }

    // METODO DE RECOGER ITEMS
    public void recogerItems(ArrayList<Item> items) {
        
        for (Item item : items){
            inventario.agregarItem(item);
    }
    
}
// METODO DE MOSTRAR INVENTARIO
    public void mostrarInventario() {
    System.out.println("Inventario de " + nombre + ":");

    for(Item item : inventario.getItems()) {

        System.out.println("- " + item.getNombre());
    }
}



}