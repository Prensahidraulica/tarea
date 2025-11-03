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

    public static String aplicarDescuento() {
        boolean repetir = false;

        do {
            try {
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de tu producto o productos: "));
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

                String mensaje = """
                        El color de la bola es %s, por lo que tienes un descuento del %.0f%%

                        El precio original es %.2f y el precio con descuento es %.2f
                        """.formatted(color, descuento * 100, precio, precioConDescuento);
                
                return mensaje;
            } catch (NumberFormatException nfe) {
                repetir = true;
                JOptionPane.showMessageDialog(null, "Error. Debes introducir un número válido para el precio.");
            }
        } while (!repetir);
        return null;

    }
}
