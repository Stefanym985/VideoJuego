public class Material extends Item {
    public Material(String nombre, int cantidad) {
        super(nombre, "material", cantidad);
    }

    @Override
    public void usar(Personaje personaje) {
        System.out.println(" Debes combinar con otros materiales para crear objetos útiles.");
    }

}
