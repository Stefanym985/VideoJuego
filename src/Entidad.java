public abstract class Entidad {
    
    protected String nombre;
    protected int x;
    protected int y;

    public Entidad(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // METODO ABSTRACTO diferente para cada hijo a su manera
    public abstract void actualizar();

}
