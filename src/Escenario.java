import java.util.ArrayList;

public abstract class Escenario {

    protected String nombre;
    protected int ancho;
    protected int alto;
    protected ArrayList<Entidad> entidades;

    public Escenario(String nombre, int ancho, int alto) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.entidades = new ArrayList<>();
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public ArrayList<Entidad> getEntidades() {
        return entidades;
    }

    // METODOS DE ENTIDADES
    public void agregarEntidad(Entidad entidad) {
        entidades.add(entidad);
    }

    public void eliminarEntidad(Entidad entidad) {
        entidades.remove(entidad);
    }

    // METODO ABSTRACTO
    public abstract void actualizar();

    // METODO NORMAL
    public void mostrarInfo() {
        System.out.println("Escenario: " + nombre);
        System.out.println("Dimensiones: " + ancho + "x" + alto);
        System.out.println("Entidades: " + entidades.size());
    }
}
