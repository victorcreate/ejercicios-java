/*
1. La mochila del aventurero
Un personaje comienza una aventura con:

10 monedas.
3 pociones.
25 puntos de vida.
Durante la aventura:

Encuentra 15 monedas.
Compra una poción.
Pierde 8 puntos de vida.
Encuentra 2 pociones.
Crea las variables necesarias y modifica sus valores.

Finalmente, muestra por pantalla, con los mensajes informativos que creas adecuados::

Las monedas que tiene.
Las pociones que tiene.
Los puntos de vida. */


public class ej1 {
    public static void main(String[] args) {
        int monedas =10;
        int pociones =3;
        int puntosdevida=25;

        monedas+=15;

        System.out.println("Tiene " + monedas + " monedas" );

         pociones=+3;

         System.out.println("Tiene " + pociones + " pociones");

         puntosdevida-=8;

         System.out.println("Tiene " + puntosdevida + " puntos de vida");





    }
}
