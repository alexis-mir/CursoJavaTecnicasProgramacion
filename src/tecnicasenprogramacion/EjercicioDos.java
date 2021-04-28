package tecnicasenprogramacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioDos {

    public static void ejecutar() {
        CommandosConsola.SepararEjercicios();
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", "Ejercicio Dos", JOptionPane.INFORMATION_MESSAGE);
        String usuario = "admin";
        String contrasenia = "pass";

        JOptionPane.showMessageDialog(null, "El usuario es:   " + usuario + "\nLa contraseña es:   " + contrasenia, "Ejercicio Dos", JOptionPane.WARNING_MESSAGE);

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el usuario:");
        String usuarioIngresado = scan.next();

        System.out.println("Ingresa la contraseña:");
        String contraseniaIngresada = scan.next();

        if ((usuarioIngresado.equals(usuario)) && contraseniaIngresada.equals(contrasenia)) {
            System.out.println("El usuario y la contraseña son correctas");
        } else {
            System.out.println("El usuario y/o la contraseña son incorrectas");
        }
        TecnicasEnProgramacion.seleccionEnunciado();
    }
}
