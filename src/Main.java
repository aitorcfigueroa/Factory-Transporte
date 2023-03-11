import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Float[] paquete = new Float[4];
        int direccion = 0;
        Float coste = 0f;
        String transporte = "";
        String[] embalaje = {"Palé", "Caja de cartón", "Caja de madera"};
        Integer seleccionEmbalaje = 1;
        System.out.println("Bienvenido a Correos Aitor");
        System.out.println("Introduzca las dimensiones del paquete que desea enviar:");
        try {
            System.out.println("Introduzca el LARGO en centímetros:");
            paquete[0] = input.nextFloat();
            System.out.println("Introduzca el ANCHO en centímetros:");
            paquete[1] = input.nextFloat();
            System.out.println("Introduzca el ALTO en centímetros:");
            paquete[2] = input.nextFloat();
            System.out.println("Introduzca el PESO en kilogramos:");
            paquete[3] = input.nextFloat();
            System.out.println("Introduzca el código postal de envío:");
            direccion = input.nextInt();

            if (direccion < 1500 &&
                    paquete[0] < Bicicleta.medidasCarton.get("largo") &&
                    paquete[1] < Bicicleta.medidasCarton.get("ancho") &&
                    paquete[2] < Bicicleta.medidasCarton.get("alto") &&
                    paquete[3] < Bicicleta.medidasCarton.get("peso")) {
                transporte = "Bicicleta";
                coste = Bicicleta.costeTotal(direccion);
                seleccionEmbalaje = Bicicleta.tipoEmbalaje(paquete[0], paquete[1], paquete[2], paquete[3]);
            } else {
                transporte = "Camion";
                coste = Camion.costeTotal(direccion);
                seleccionEmbalaje = Camion.tipoEmbalaje(paquete[0], paquete[1], paquete[2], paquete[3]);
            }

            System.out.println("El paquete será enviado en " + transporte + " empaquetado en " + embalaje[seleccionEmbalaje] + " por un precio de " + coste);
        } catch (InputMismatchException ex) {
            System.out.println("[Error]: Los datos introducidos no son válidos.");
        }

        System.out.println("Hasta pronto!");

    }
}
