import java.util.ArrayList;

public class Inventario {

    private ArrayList<Item> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public void quitarItem(Item item) {
        this.items.remove(item);
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public boolean tieneItem(String nombre, int cantidad) {
        for (Item item : items) {
            if (item.getNombre().equals(nombre)
                && item.getCantidad() >= cantidad) {
                return true;
            }
        }
        return false;
    }
    public void consumirItem(String nombre, int cantidad) {
        for (Item item : items) {
            if (item.getNombre().equals(nombre)) {
                item.disminuirCantidad(cantidad);
                if (item.getCantidad() <= 0) {
                    quitarItem(item);
                }
                return;
            }
        }
    }

}