package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioTres {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Tres";

    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);

        Integer cantidadBancos = CommandosAuxiliares.getEnteroPorVentana("Ingrese la cantidad de bancos que tiene el aula:", NOMBRE_EJERCICIO);
        if (cantidadBancos == null) {
            return;
        }
        Integer cantidadAlumnos = CommandosAuxiliares.getEnteroPorVentana("Ingrese la cantidad de alumnos inscriptos para el curso:", NOMBRE_EJERCICIO);
        if (cantidadAlumnos == null) {
            return;
        }

        if (cantidadBancos >= cantidadAlumnos) {
            JOptionPane.showMessageDialog(null, "La cantidad de bancos existentes alcanzan para la cantidad alumnos insciptos.", NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);

        } else {
            int bancosFaltantes = cantidadAlumnos - cantidadBancos;
            JOptionPane.showMessageDialog(null, "La cantidad de bancos existentes no alcanzan para la cantidad alumnos insciptos.\nSe necesitan agregar la siguiente cantidad de bancos: "
                    + bancosFaltantes, NOMBRE_EJERCICIO, 0);
        }
    }
}
