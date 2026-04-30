import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
       
        Personaje p1 = new Personaje(10, 10, 10, "Constuye rapidamente herramientas y resguardos", "Sus niveles de hambre y sed bajan rapidamente debido al esfuerzo fisico que realiza y depende de los demas personajes para sobrevivir");
        Personaje p2 = new Personaje(10,10, 10, " Puede recolectar alimentos y agua mas rapido que los demas personajes y sabe reconocer alimentos peligrosos para la salud", "Tiene dificultades para defenderse de los animales salvajes, por lo que se ve obligada a depender de los demas personajes para sobrevivir");
        Personaje p3 = new Personaje(10, 10, 10, "Puede curar a los demas personajes rapidamente con su botiquin", "Tiene dificultades para construir herramientas y resguardos, por lo que se ve obligado a depender de los demas personajes para sobrevivir");

         // Creamos el servicio de tiempo
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate(() -> p1.vida(), 0, 3, TimeUnit.MINUTES);

        System.out.println( "Tienes que conseguir alimentos... El tiempo corre");
    }
}
