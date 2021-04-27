package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioSiete {
    public static void ejecutar(){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar número que desea concocer su tabla de multiplicación:", "Ejercicio Siete", -1));

        int multiplicarHasta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar hasta que número desea multiplicar el valor ingresado:", "Ejercicio Siete", -1));

        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", "Ejercicio Siete", JOptionPane.INFORMATION_MESSAGE);
        
        int n = 0;
        do {
            n++;
            System.out.println(num + " x " + n + " = " + (num*n));
            
        } while (n < multiplicarHasta);
        
        TecnicasEnProgramacion.seleccionEnunciado();
    }
}