package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioNueve {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Nueve";

    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        JOptionPane.showMessageDialog(null, "El ejercicio se ejecuta por consola.\nContinue en la consola.", NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        boolean[] butacasOcupadas = {true, false, true, true, false, false, true, true, false, true, false, false, true, true};
        int cantButacasVacias = 0;
        for (boolean i : butacasOcupadas) {
            if (!i) {
                cantButacasVacias++;
            }
        }
        int cantButacasOcupadas = butacasOcupadas.length - cantButacasVacias;
        System.out.println("Hay " + butacasOcupadas.length + " butacas, " + cantButacasVacias + " están vacias y " + cantButacasOcupadas + " están ocupadas.");
    }
}
