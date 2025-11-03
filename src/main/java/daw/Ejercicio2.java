package daw;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Llamar 10 veces al método esPrimo(num)
        // El usuario tiene que introducir un número y se debe decir si el número es primo o no

        for (int i = 0; i < 10; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número para saber si es primo o no: "));
            if (Funciones2.esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }
    }

}
