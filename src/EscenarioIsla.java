public class EscenarioIsla extends Escenario {

    public EscenarioIsla(int ancho, int alto) {
        super("Isla Sombra", ancho, alto);
    }

    @Override
    public void actualizar() {
        for (Entidad entidad : entidades) {
            entidad.actualizar();
        }
    }

    public void mostrarEstado() {
        System.out.println("ISLA SOMBRA");
        for (Entidad entidad : entidades) {
            if (entidad instanceof Personaje) {
                Personaje p = (Personaje) entidad;
                System.out.println(p.getNombre() 
                + " | Vida: " + p.getVida() 
                + " | Hambre: " + p.getNivelHambre() 
                + " | Sed: " + p.getNivelSed());
            }
        }
    }

    public boolean alguienMurio() {
        for (Entidad entidad : entidades) {
            if (entidad instanceof Personaje) {
                Personaje p = (Personaje) entidad;
                if (p.getVida() <= 0) {
                    System.out.println(p.getNombre() + " ha muerto...");
                    return true;
                }
            }
        }
        return false;
    }
}
