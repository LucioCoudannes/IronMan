
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Integer numadv = (int) (Math.random() * 500) + 1;

        Integer num = 0;
        Integer cont = 0;
        System.out.println("el numero no secreto es " + numadv);
        do {

            System.out.println("Ingrese el numero adivinar");
            try {
                num = leer.nextInt();
            } catch (Exception e) {
                System.out.println("pone un numero marmota");
                cont++;
                leer.next();
                continue;
            }

            if (num.intValue() != numadv.intValue()) {
                System.out.println("le erraste");
                cont++;
                if (num.intValue() < numadv.intValue()) {

                    System.out.println("El numero secreto es Mayor");

                } else {
                    System.out.println("El numero Secreto es Menor");
                }
            } else {
                System.out.println("Adivinaste");
            };

        } while (num.intValue() != numadv.intValue());

        System.out.println("Fallaste " + cont);

    }

}
