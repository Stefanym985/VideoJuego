public abstract class Item {

   
    protected String nombre;
    protected String tipo; //  material, comida 
    protected int cantidad;   

    public Item(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
   
    // METODO DE AGREGAR Y DISMINUIR CANTIDAD

    public void agregarCantidad (int cantidad) {
        this.cantidad += cantidad;
    }
    public void disminuirCantidad (int cantidad) {
        this.cantidad -= cantidad;
        if (this.cantidad < 0) {
            this.cantidad = 0;
        }
    }

    // METODO DE USAR ITEMS
    public void usar(Personaje personaje){

    }



    
   

}
