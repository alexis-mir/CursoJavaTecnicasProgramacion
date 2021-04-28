package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioSeis {

    public static void ejecutar() {
        CommandosConsola.SepararEjercicios();
        //Solicito el numero a miltiplicar y valido que sea un numero o que se ingresó algo. 
        String numString = "0";
        do {
            if (!esNumero(numString)) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero para continuar.", "Ejercicio Seis", 0);
            }
            numString = JOptionPane.showInputDialog(null, "Ingresar número que desea concocer su tabla de multiplicación:", "Ejercicio Seis", -1);
        } while (!esNumero(numString) && numString != null);
        if (numString == null) {
            TecnicasEnProgramacion.seleccionEnunciado();
            System.exit(0);
        }
        int num = Integer.parseInt(numString);
        //Solicito hasta cuál multiplo se desea mostrar en cosola y valido que sea un numero distinto a cero (0)
        String multiplicarHastaString = "1";
        do {
            if (!(esNumero(multiplicarHastaString) && !multiplicarHastaString.equals("0"))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero que sea mayor a cero (0) para continuar.", "Ejercicio Seis", 0);
            }
            multiplicarHastaString = JOptionPane.showInputDialog(null, "Ingresar hasta que número desea multiplicar el valor ingresado:", "Ejercicio Seis", -1);
            System.out.println("la variable multiplicarHastaString es:\n" + multiplicarHastaString);
        } while (multiplicarHastaString != null && !(esNumero(multiplicarHastaString) && !multiplicarHastaString.equals("0")));
        if (multiplicarHastaString == null) {
            TecnicasEnProgramacion.seleccionEnunciado();
            System.exit(0);
        }
        int multiplicarHasta = Integer.parseInt(multiplicarHastaString);
        JOptionPane.showMessageDialog(null, "La solucion del ejercicio se muestra por consola.", "Ejercicio Seis", JOptionPane.INFORMATION_MESSAGE);

        //Muestro la tabla de multiplicacion en consola segun los datos ingresados.
        int n = 1;
        while (n <= multiplicarHasta) {
            System.out.println(num + " x " + n + " = " + (num * n));
            n++;
        }

        TecnicasEnProgramacion.seleccionEnunciado();
    }

    private static boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
