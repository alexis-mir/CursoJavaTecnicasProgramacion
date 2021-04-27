package tecnicasenprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioUno {

    public static void ejecutar() {
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", "Ejercicio Uno", JOptionPane.INFORMATION_MESSAGE);

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int numUno = scan.nextInt();

        System.out.println("Ingrese el segundo numero");
        int numDos = scan.nextInt();

        int suma = numUno + numDos;

        System.out.println("La suma de los dos numero ingresados es: " + suma);
        TecnicasEnProgramacion.seleccionEnunciado();
    }

}
