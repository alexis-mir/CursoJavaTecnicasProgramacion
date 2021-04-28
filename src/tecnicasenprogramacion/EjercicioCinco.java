package tecnicasenprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCinco {

    public static void ejecutar(){
        CommandosConsola.SepararEjercicios();
        //Se indica al usuario que el ejercicio se ejecuta por consola
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", "Ejercicio Cinco", JOptionPane.INFORMATION_MESSAGE);

        // iniciacion de la class Scanner
        Scanner scan = new Scanner(System.in);

        // Se pide el mes en formato de numero
        System.out.println("Ingresar el numero del mes que desea conocer el nombre: ");

        int numMes = scan.nextInt();

        // Se muestra por consola el nombre del mes ingresado
        switch (numMes) {
            case 1:
                System.out.println("El nombre del mes ingresado es Enero");
                break;
            case 2:
                System.out.println("El nombre del mes ingresado es Febrero");
                break;
            case 3:
                System.out.println("El nombre del mes ingresado es Marzo");
                break;
            case 4:
                System.out.println("El nombre del mes ingresado es Abril");
                break;
            case 5:
                System.out.println("El nombre del mes ingresado es Mayo");
                break;
            case 6:
                System.out.println("El nombre del mes ingresado es Junio");
                break;
            case 7:
                System.out.println("El nombre del mes ingresado es Julio");
                break;
            case 8:
                System.out.println("El nombre del mes ingresado es Agosto");
                break;
            case 9:
                System.out.println("El nombre del mes ingresado es Septiembre");
                break;
            case 10:
                System.out.println("El nombre del mes ingresado es Octubre");
                break;
            case 11:
                System.out.println("El nombre del mes ingresado es Noviembre");
                break;
            case 12:
                System.out.println("El nombre del mes ingresado es Diciembre");
                break;
            default:
                System.out.println("El número ingresado es incorrecto.");
                break;

        }
        TecnicasEnProgramacion.seleccionEnunciado();
    }
}
