package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioTres {

    public static void ejecutar() {

        String cantidadBancosString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de bancos que tiene el aula:", "Ejercicio Tres", -1);
        String cantidadAlumnosString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de alumnos inscriptos para el curso:", "Ejercicio Tres", -1);

        int cantidadBancos = Integer.parseInt(cantidadBancosString);
        int cantidadAlumnos = Integer.parseInt(cantidadAlumnosString);

        if (cantidadBancos >= cantidadAlumnos) {
            JOptionPane.showMessageDialog(null, "La cantidad de bancos existentes alcanzan para la cantidad alumnos insciptos.", "Ejercicio Tres", JOptionPane.INFORMATION_MESSAGE);

        } else {
            int bancosFaltantes = cantidadAlumnos - cantidadBancos;
            JOptionPane.showMessageDialog(null, "La cantidad de bancos existentes no alcanzan para la cantidad alumnos insciptos.\nSe necesitan agregar la siguiente cantidad de bancos: "
                    + bancosFaltantes, "Ejercicio Tres", 0);
        }
        TecnicasEnProgramacion.seleccionEnunciado();
    }
}
