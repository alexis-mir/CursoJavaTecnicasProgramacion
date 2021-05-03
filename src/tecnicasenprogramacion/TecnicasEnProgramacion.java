package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class TecnicasEnProgramacion {

    private static boolean sesionActiva = true;

    public static void main(String[] args) {
        while (sesionActiva) {
            seleccionEnunciado();
        }
    }

    public static void seleccionEnunciado() {
        String[] enunciados = {"Estructuras de Control", "Estructuras de Datos", "Algoritmos Fundamentales"};
        int enunciadoSeleccionado = JOptionPane.showOptionDialog(null, "Elije una categoria:", "Módulo Técnicas de Programación", 0, -1, null, enunciados, enunciados[0]);
        switch (enunciadoSeleccionado) {
            case 0://Ejercicios 1-8 Estructura de Control
                seleccionEjerciciosControl();
                break;
            case 1://Ejercicios 9-11 Estructuras de Datos
                seleccionEjerciciosDatos();
                break;
            case 2://Ejercicios 12-15 Algoritmos Fundamentales
                seleccionEjerciciosAlgoritmos();
                break;
            case -1:
                sesionActiva = false;
                break;
            default:
                break;
        }
    }

    public static void seleccionEjerciciosControl() {
        //Ejercicios 1-8 Estructura de Control
        String[] ejerciciosControl = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8"};
        int ejercicioSeleccionado = JOptionPane.showOptionDialog(null, "Elije un ejercicio a ejecutar:", "Estructuras de Control", 0, -1, null, ejerciciosControl, ejerciciosControl[0]);

        switch (ejercicioSeleccionado) {
            case 0:
                EjercicioUno.ejecutar();
                break;
            case 1:
                EjercicioDos.ejecutar();
                break;
            case 2:
                EjercicioTres.ejecutar();
                break;
            case 3:
                EjercicioCuatro.ejecutar();
                break;
            case 4:
                EjercicioCinco.ejecutar();
                break;
            case 5:
                EjercicioSeis.ejecutar();
                break;
            case 6:
                EjercicioSiete.ejecutar();
                break;
            case 7:
                EjercicioOcho.ejecutar();
                break;
            default:
                break;
        }
    }

    public static void seleccionEjerciciosDatos() {
        //Ejercicios 9-11 Estructuras de Datos
        String[] ejerciciosDatos = {"Ejercicio 9", "Ejercicio 10", "Ejercicio 11"};
        int ejercicioSeleccionado = JOptionPane.showOptionDialog(null, "Elije un ejercicio a ejecutar:", "Estructuras de Datos", 0, -1, null, ejerciciosDatos, ejerciciosDatos[0]);

        switch (ejercicioSeleccionado) {
            case 0:
                EjercicioNueve.ejecutar();
                break;
            case 1:
                EjercicioDiez.ejecutar();
                break;
            case 2:
                EjercicioOnce.ejecutar();
                break;
            default:
                break;
        }

    }

    public static void seleccionEjerciciosAlgoritmos() {
        //Ejercicios 12-15 Algoritmos Fundamentales

    }
}
