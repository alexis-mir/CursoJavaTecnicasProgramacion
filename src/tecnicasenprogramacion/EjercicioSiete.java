package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioSiete {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Siete";

    public static void ejecutar() {

        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        //Solicito el número a multiplicar y valido que sea un número o que se ingresó algo. 
        Integer num = CommandosAuxiliares.getEnteroPorVentana("Ingresar número que desea concocer su tabla de multiplicación:", NOMBRE_EJERCICIO);
        if (num == null) {
            return;
        }

        //Solicito hasta cuál multiplo se desea mostrar en cosola y valido que sea un número mayor a cero (0)
        String numHastaStr = "1";
        int numHasta = 0;
        boolean esMayorQueCero = false;
        do {
            numHastaStr = JOptionPane.showInputDialog(null, "Ingresar hasta que número desea multiplicar el valor ingresado:", NOMBRE_EJERCICIO, -1);
            if (numHastaStr != null) {

                if (CommandosAuxiliares.esEntero(numHastaStr)) {
                    numHasta = Integer.parseInt(numHastaStr);
                }
                if (numHasta <= 0 || !CommandosAuxiliares.esEntero(numHastaStr)) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un número entero que sea mayor a cero (0) para continuar.", NOMBRE_EJERCICIO, 0);
                } else {
                    esMayorQueCero = true;
                }
            }
        } while (numHastaStr != null && !esMayorQueCero);
        if (numHastaStr == null) {
            return;
        }
        JOptionPane.showMessageDialog(null, "La solucion del ejercicio se muestra por consola.", NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);

        int n = 0;
        do {
            n++;
            System.out.println(num + " x " + n + " = " + (num * n));

        } while (n < numHasta);
    }
}
