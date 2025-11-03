package daw;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        double precio = 0;
        // Bola roja indica un 15% de descuento
        // Bola naranja indica un 25% de descuento
        // Bola azul indica un 50% de descuento
        // Bola negra indica que no hay descuento

        JOptionPane.showMessageDialog(null, Funciones1.menuInicial);
        
        precio = Funciones1.introducirPrecio(precio);

        JOptionPane.showMessageDialog(null, "Tu producto o conjunto de productos ahora cuestan " +Funciones1.descuento(precio));
    }
}