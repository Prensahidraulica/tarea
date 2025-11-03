package daw;

import java.util.Random;

import javax.swing.JOptionPane;

public class Funciones1 {

    public static final String menuInicial = """
                      ~ Bienvenido a caja de cobro ~

            Saldrá una bola de un color aleatorio de un biombo, y 
            cada color te dará un descuento para tu producto:

            - Rojo: 15%
            - Naranja: 25%
            - Azul: 50%
            - Negro: No hay descuento
            """;

    public static double introducirPrecio(double precio) {
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de tu producto o productos: "));
        return precio;
    }

    public static double descuento(double precio) {
        Random numAleatorioRandom = new Random();
        int numAleatorio = numAleatorioRandom.nextInt(1, 5);
        String color = "";
        double descuento = 0;
        double precioConDescuento = 0;

        switch (numAleatorio) {
            case 1:
                color = "rojo";
                descuento = 0.15;
                precioConDescuento = precio - (precio * descuento);
                break;
            case 2:
                color = "naranja";
                descuento = 0.25;
                precioConDescuento = precio - (precio * descuento);
                break;
            case 3:
                color = "azul";
                descuento = 0.5;
                precioConDescuento = precio - (precio * descuento);
                break;
            case 4:
                color = "negro";
                descuento = 0;
                precioConDescuento = precio - (precio * descuento);
                break;
        }

        return precioConDescuento;

    }
}
