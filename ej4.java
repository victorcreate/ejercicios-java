public class ej4 {

    public static void main(String[] args) {
        
        int vida = 100;
        vida-=25;
        System.out.println("Despues del primer ataque le queda " + vida + " puntos de vida");
        vida+=15;
        System.out.println("Le aumenta la vida a " + vida + " puntos gracias a la poción" );
        vida-=40;
        System.out.println("Recibe otro ataque y le quedan " + vida + " puntos de vida" );
        vida+=20;
        System.out.println("Encuentra una pocion que le deja a " + vida + " puntos de vida");
    }
    
}
