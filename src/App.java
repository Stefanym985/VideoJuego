import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        Personaje ben = new Personaje(
        10, 
        10, 
        10, 
        "Constuye rapidamente", 
        "Sus niveles de hambre y sed bajan rapidamente", 
        "Ben");

        Personaje mara = new Personaje(
        10, 
        10, 
        10, 
        "Puede recolectar alimentos y agua mas rapido que los demas personajes y sabe reconocer alimentos peligrosos para la salud", 
        "Tiene dificultades para defenderse", 
        "Mara");

        Personaje willy = new Personaje(
        10, 
        10, 
        10, 
        "Puede curar a los demas personajes rapidamente con su botiquin", 
        "Tiene dificultades para construir herramientas y resguardos", 
        "Willy");

         // Creamos el servicio de tiempo
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate(() -> mara.vida(), 0, 3, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(() -> ben.vida(), 0, 3, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(() -> willy.vida(), 0, 3, TimeUnit.MINUTES);

        System.out.println( "Tienes que conseguir alimentos... El tiempo corre!!");

        try {
        Thread.sleep(5000); // 5 segundos
    } catch (InterruptedException e) {
         e.printStackTrace();
    }

    // CREAR OBJETOS DE LOS ITEMS
    Comida Coco = new Comida("Coco", 1, 0, 5);
    Comida Mango = new Comida ("Mango", 1, 4, 0);
    Comida Pescado = new Comida ("Pescado", 1, 6, 0);
    Comida Yuca = new Comida ("Yuca", 1, 4, 0);
    Comida Higo = new Comida ("Higo", 1, 2, 0);

    Material fuselaje = new Material ("fuselaje", 1);
    Material Hojas = new Material ("Hojas", 1);
    Material Fundas_Asiento = new Material ("fundas de asiento", 1);
    Material Cables = new Material ("Cables", 1);

    Material Resina_Arbol = new Material ("Resina de arbol", 1);
    Material Espuma_Asientos = new Material ("Espuma de asientos", 1);
    Material Cristales = new Material ("Cristales", 1);

    Material Alcohol = new Material ("Alcohol", 3);
    Material Vendas = new Material ("Vendas", 10);
    Material Analgesicos = new Material ("Analgesicos", 3);
    Material Suero_Fisiologico = new Material ("Suero Fisiologico", 1);
    Material Agujas = new Material ("Agujas", 2);

    ArrayList<Item> itemsMara = new ArrayList<>();
    itemsMara.add(Coco);
    itemsMara.add(Yuca);
    itemsMara.add(Higo);
    itemsMara.add(Mango);
    itemsMara.add(Pescado);

    ArrayList<Item> itemsBen = new ArrayList<>();
    itemsBen.add(fuselaje);
    itemsBen.add(Cables);
    itemsBen.add(Hojas);
    itemsBen.add(Fundas_Asiento);

     ArrayList<Item> itemsWilly = new ArrayList<>();
     itemsWilly.add(Alcohol);
     itemsWilly.add(Vendas);
     itemsWilly.add(Suero_Fisiologico);
     itemsWilly.add(Agujas);
     itemsWilly.add(Analgesicos);

    mara.recogerItems(itemsMara);
    ben.recogerItems(itemsBen);
    willy.recogerItems(itemsWilly);

    // METODO DE MOSTRAR INVENTARIO
    mara.mostrarInventario();
    ben.mostrarInventario();
    willy.mostrarInventario();
    
    // METODO DE CONSTRUIR REFUGIO
    ben.construirRefugio();

    // METODO DE RECOGER COMIDA
    mara.recogerComida(itemsMara);

    // METODO DE CURAR HERIDAS
    willy.curarHeridas(ben);
    willy.curarHeridas(mara);
    willy.curarHeridas(willy);

     


        
}
}