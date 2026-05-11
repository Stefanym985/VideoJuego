public class Medicina extends Item {
    private int curacion;

    public Medicina(String nombre, int curacion) {
        super(nombre);
        this.curacion = curacion;
    }

    public int getCuracion() {
        return curacion;
    }

}
