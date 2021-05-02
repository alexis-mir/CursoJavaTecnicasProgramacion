package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class CommandosAuxiliares {

    public static final int VALIDAR_INT = 1;
    public static final int VALIDAR_DOUBLE = 2;

    public final static void SeparadorEjercicios(String ejercicio) {
        System.out.println("\n===========================================================\nSe está ejecutando el " + ejercicio + "\n===========================================================");
    }

    public static boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean esNumero(String cadena) {
        try {
            if (cadena == null) {
                return false;
            }
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Integer getEnteroPorVentana(String cuerpoVentana, String tituloVentana) {
        Integer num;
        String numStr;
        do {
            numStr = JOptionPane.showInputDialog(null, cuerpoVentana, tituloVentana, -1);
            if (!CommandosAuxiliares.esEntero(numStr) && numStr != null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número entero para continuar.", tituloVentana, 0);
            }
        } while (!CommandosAuxiliares.esEntero(numStr) && numStr != null);
        if (numStr == null) {
            return null;
        }
        num = new Integer(numStr);
        return num;
    }

    public static Double getDecimalPorVentana(String cuerpoVentana, String tituloVentana) {
        Double num;
        String numStr;
        do {
            numStr = JOptionPane.showInputDialog(null, cuerpoVentana, tituloVentana, -1);
            if (!CommandosAuxiliares.esNumero(numStr) && numStr != null) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número decimal para continuar.", tituloVentana, 0);
            }
        } while (!CommandosAuxiliares.esNumero(numStr) && numStr != null);
        if (numStr == null) {
            return null;
        }
        num = new Double(numStr);
        return num;
    }
}
