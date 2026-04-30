public class Mara extends Personaje {

   public Mara(int nivelHambre,int  nivelSed, int vida, String ventaja, String deventaja) {
        super(10, 10, 10, " Puede recolectar alimentos y agua mas rapido que los demas personajes y sabe reconocer alimentos peligrosos para la salud", "Tiene dificultades para defenderse de los animales salvajes, por lo que se ve obligada a depender de los demas personajes para sobrevivir");

}

public void vida(){
    if  (this.nivelHambre = 0 || this.nivelSed = 0) {
        this.vida - = 4;
    }
 }

}
