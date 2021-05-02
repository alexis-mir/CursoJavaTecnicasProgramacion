package tecnicasenprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCinco {
    
    private static final String NOMBRE_EJERCICIO = "Ejercicio Cinco";

    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        //Se indica al usuario que el ejercicio se ejecuta por consola
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        
        //Se solicita el numero del mes
        System.out.println("Ingresar el número del mes que desea conocer el nombre: ");
        int numMes = ingresarMes();

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
    }

    private static int ingresarMes() {
        Scanner scan = new Scanner(System.in);
        String numStr;
        int num = 0;
        boolean esMes = false;
        do {
            numStr = scan.next();
            if (!CommandosAuxiliares.esEntero(numStr)) {
                System.out.println("No ingresó un número válido, por favor intente nuevamente");
            } else {
                num = Integer.parseInt(numStr);
                esMes = num <= 12 && num >= 1;
                if (!esMes) {
                    System.out.println("Debe ingresar un número entre 1 y 12, por favor intente nuevamente");
                }
            }
        } while (!CommandosAuxiliares.esEntero(numStr) || !esMes);
        return num;
    }
}
