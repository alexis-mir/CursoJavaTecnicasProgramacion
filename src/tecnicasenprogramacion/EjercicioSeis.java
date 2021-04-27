package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioSeis {

    public static void ejecutar() {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar número que desea concocer su tabla de multiplicación:", "Ejercicio Seis", -1));

        int multiplicarHasta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar hasta que número desea multiplicar el valor ingresado:", "Ejercicio Seis", -1));

        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", "Ejercicio Seis", JOptionPane.INFORMATION_MESSAGE);

        int n = 1;
        while (n <= multiplicarHasta) {
            System.out.println(num + " x " + n + " = " + (num*n));
            n++;
        }

        TecnicasEnProgramacion.seleccionEnunciado();
    }
}
