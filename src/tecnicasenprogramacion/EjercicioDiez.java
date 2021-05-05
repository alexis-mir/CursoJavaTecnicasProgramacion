package tecnicasenprogramacion;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

class EjercicioDiez {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Diez";

    static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);

        int[] aulasCantBancos = {40, 35, 30};
        String[] aulasIdentificador = {"Azul", "Verde", "Amarillo"};
        int capacidadMax = 40;

        Integer cantAlumnosInscriptos;
        boolean dentroRango = false;
        boolean esNulo = false;
        do {
            cantAlumnosInscriptos = CommandosAuxiliares.getEnteroPorVentana("Ingresar la cantidad de alumnos inscriptos para cursar tercer grado: ", NOMBRE_EJERCICIO);
            esNulo = cantAlumnosInscriptos == null;
            if (!esNulo) {
                dentroRango = cantAlumnosInscriptos <= capacidadMax && cantAlumnosInscriptos > 0;
                if (!dentroRango) {
                    JOptionPane.showMessageDialog(null, "El numero ingresado no se encuentra dentro del rango permitido.\nLa capacidad máxima de alumnos es: " + capacidadMax, NOMBRE_EJERCICIO, 0);
                }
            }
        } while (!esNulo && !dentroRango);
        if (esNulo) {
            return;
        }
        List<String> aulasIndicadas = new ArrayList<>();
        int indexIdentificador = 0;
        for (String aula : aulasIdentificador) {

            boolean aulaValida = cantAlumnosInscriptos <= aulasCantBancos[indexIdentificador];
            if (aulaValida) {
                aulasIndicadas.add(aula);
            }
            indexIdentificador++;
        }
        StringBuilder aulasIndicadasString = new StringBuilder();
        int indexAuxiliar = 1;

        for (Object aula : aulasIndicadas) {
            indexAuxiliar++;
            aulasIndicadasString.append(aula);
            if (aulasIndicadas.size() == indexAuxiliar) {
                aulasIndicadasString.append(" y ");
            } else if (indexAuxiliar < aulasIndicadas.size()) {
                aulasIndicadasString.append(", ");
            } else {
                aulasIndicadasString.append(".");
            }
        }
        if (aulasIndicadas.size() != 1) {
            JOptionPane.showMessageDialog(null, "Las aulas indicadas para la cantidad de alumnos inscriptos son: " + aulasIndicadasString.toString(), NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El aula indicada para la cantidad de alumnos inscriptos es: " + aulasIndicadasString.toString(), NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
