package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class TecnicasEnProgramacion {

    public static void main(String[] args) {

        String[] enunciados = {
            "Estructuras de Control",
            "Estructuras de Datos",
            "Algoritmos Fundamentales"
        };
        int enunciadoSeleccionado = JOptionPane.showOptionDialog(null, "Elije una categoria:", "Módulo Técnicas de Programación", 0, -1, null, enunciados, enunciados[0]);
        switch (enunciadoSeleccionado) {
            case 0:

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
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    default:
                        break;

                }

                break;
            case 1:

                System.out.println("Boton B");

                break;
            case 2:

                System.out.println("Boton C");

                break;
            default:
                break;
        }
    }

}
