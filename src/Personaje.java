public class Personaje {

    private String nombre;
    private int edad; 
    private String poder;
    private String relacion;

    public Personaje (String nombre, int edad, String poder, String relacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.poder = poder;
        this.relacion = relacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPoder() {
        return poder;
    }
    public void setPoder(String poder) {
        this.poder = poder;
    }
    public String getRelacion() {
        return relacion;
    }
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    
}
