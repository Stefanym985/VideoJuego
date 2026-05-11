public class Ben extends Personaje {

    public Ben(int nivelHambre,int  nivelSed, int vida, String ventaja, String deventaja) {
        super(10, 10, 10, "Construye rapidamente herramientas y resguardos", "Sus niveles de hambre y sed bajan rapidamente debido al esfuerzo fisico que realiza y depende de los demas personajes para sobrevivir");

}
// METODOS DE VIDA
 @Override
 public void vida(){
    if  (this.nivelHambre == 0 || this.nivelSed == 0) {
        this.vida -= 3;
    }
 } 

}