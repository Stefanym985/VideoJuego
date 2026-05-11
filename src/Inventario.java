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
}