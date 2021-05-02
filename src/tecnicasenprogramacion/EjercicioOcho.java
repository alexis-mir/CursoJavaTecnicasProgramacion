package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioOcho {

    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios("Ocho");
        int cantNum = 4;
        JOptionPane.showMessageDialog(null, "Debe ingresar " + cantNum + " números para luego ser promediados", "Ejercicio Ocho", JOptionPane.INFORMATION_MESSAGE);

        double total = 0;

        for (int i = 1; i <= cantNum; i++) {
            String palabra = "";
            switch (i) {
                case 1:
                    palabra = "1er";
                    break;
                case 2:
                    palabra = "2do";
                    break;
                case 3:
                    palabra = "3er";
                    break;
                case 4:
                    palabra = "4to";
                    break;
                default:
                    break;
            }
            Double num = CommandosAuxiliares.getDecimalPorVentana("Ingresar el " + palabra + " número:", "Ejercicio Ocho");//Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar el " + palabra +" número:", "Ejercicio Ocho", JOptionPane.QUESTION_MESSAGE));
            if (num == null) {
                return;
            }
            total += num;
        }

        double prom = total / cantNum;

        JOptionPane.showMessageDialog(null, "El promedio de los números ingresados es: " + prom, "Ejercicio Ocho", JOptionPane.INFORMATION_MESSAGE);
    }
}
