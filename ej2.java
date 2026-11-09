/*
2. Viaje en moto
Una motocicleta comienza un viaje con:

125 km recorridos.
8 litros de combustible.
Una velocidad de 90 km/h.
Durante el viaje recorre otros 75 km y consume 3 litros de combustible.

Después aumenta su velocidad en 20 km/h.

Crea las variables y realiza las modificaciones necesarias. Usa comentarios en el código, para definir las medidas usadas en cada variable (km, litros y km/h...)

Muestra finalmente los valores de:

Kilómetros recorridos.
Combustible restante.
Velocidad. */


public class ej2 {
    public static void main(String[] args) {

        int kilometros =125;
        int litros=8;
        int velocidad=90;

        kilometros+=75;
        litros-=3;

        System.out.println("Ha recorrido " + kilometros + " kilometros" );
        System.out.println("Tiene " + litros + " litros");
         velocidad+=20;

         System.out.println("La velocidad final es de " + velocidad + "km/h");
        

    }
    
}
