package tecnicasenprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioUno {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Uno";
    
    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Ingrese el primer numero");
        int numUno = ingresarNumeroEntero();
        System.out.println("Ingrese el segundo numero");
        int numDos = ingresarNumeroEntero();
        int suma = numUno + numDos;
        System.out.println("La suma de los dos numero ingresados es: " + suma);
    }

    private static int ingresarNumeroEntero() {
        Scanner scan = new Scanner(System.in);
        String numStr;
        do {
            numStr = scan.next();
            if (!CommandosAuxiliares.esEntero(numStr)) {
                System.out.println("No ingresó un numero válido, por favor intente nuevamente");
            }

        } while (!CommandosAuxiliares.esEntero(numStr));
        int num = Integer.parseInt(numStr);
        return num;
    }

}
