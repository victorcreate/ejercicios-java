/*
3. La cuenta del restaurante
En una cuenta de restaurante hay:

Comida: 42.50 €
Bebida: 8.75 €
Postre: 6.50 €
Calcula el precio total utilizando variables.

Después se aplica un descuento de 10 €.

Finalmente, añade 5 € de propina.

Muestra el precio final.

Importante: utiliza variables double y operadores aritméticos. 
No escribas directamente el resultado final.
 */


public class ej3 {
    public static void main(String[] args) {

        double comida = 42.50;
        double bebida = 8.75;
        double postre = 6.50;

        double total = comida+bebida+postre;

        double descuento = 10;
        double totlaConDescuento = total - descuento;

        double propina = 5;
        double precioFinal = totlaConDescuento + propina;

        System.out.println("Total " + total );
        System.out.println("Total con descuento " + totlaConDescuento );
        System.out.println("Precio final " + precioFinal );






    }
    
}
