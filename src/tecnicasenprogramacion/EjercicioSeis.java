package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioSeis {

    public static void ejecutar() {
        CommandosConsola.SepararEjercicios("Seis");
        //Solicito el número a multiplicar y valido que sea un número o que se ingresó algo. 
        String numStr = "0";
        do {
            if (!esEntero(numStr)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero para continuar.", "Ejercicio Seis", 0);
            }
            numStr = JOptionPane.showInputDialog(null, "Ingresar número que desea concocer su tabla de multiplicación:", "Ejercicio Seis", -1);
        } while (!esEntero(numStr) && numStr != null);
        if (numStr == null) {
            TecnicasEnProgramacion.seleccionEnunciado();
            System.exit(0);
        }
        int num = Integer.parseInt(numStr);
        //Solicito hasta cuál multiplo se desea mostrar en cosola y valido que sea un número distinto a cero (0)
        String numHastaStr = "1";
        do {
            if (!(esEntero(numHastaStr) && !numHastaStr.equals("0"))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero que sea mayor a cero (0) para continuar.", "Ejercicio Seis", 0);
            }
            numHastaStr = JOptionPane.showInputDialog(null, "Ingresar hasta que número desea multiplicar el valor ingresado:", "Ejercicio Seis", -1);
        } while (numHastaStr != null && !(esEntero(numHastaStr) && !numHastaStr.equals("0")));
        if (numHastaStr == null) {
            TecnicasEnProgramacion.seleccionEnunciado();
            System.exit(0);
        }
        int numHasta = Integer.parseInt(numHastaStr);
        JOptionPane.showMessageDialog(null, "La solucion del ejercicio se muestra por consola.", "Ejercicio Seis", JOptionPane.INFORMATION_MESSAGE);

        //Muestro la tabla de multiplicacion en consola segun los datos ingresados.
        int n = 1;
        while (n <= numHasta) {
            System.out.println(num + " x " + n + " = " + (num * n));
            n++;
        }

        TecnicasEnProgramacion.seleccionEnunciado();
    }

    private static boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
