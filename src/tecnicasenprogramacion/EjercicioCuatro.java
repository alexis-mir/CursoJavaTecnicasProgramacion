package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioCuatro {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Cuatro";

    public static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        // Consulto el monto de compra, lo convierto a entero y lo almaceno.
        Double montoCompra = CommandosAuxiliares.getDecimalPorVentana("Ingresar monto de la compra: ", NOMBRE_EJERCICIO);
        if (montoCompra == null) {
            return;
        }

        //creo lista de formas de pago y pido al usuario que seleccione una
        String[] formasPagos = {"Contado", "Tarjeta", "Otros"};
        Object formaPagoSelec = JOptionPane.showInputDialog(null, "Seleccionar forma de pago: ", NOMBRE_EJERCICIO, -1, null, formasPagos, formasPagos[0]);
        if (formaPagoSelec == null) {
            return;
        }

        //si la forma de pago es contado ejecuto el descuento del 10%
        if (formaPagoSelec.equals(formasPagos[0])) {
            Double montoCompraConDesc = montoCompra * 0.9;
            JOptionPane.showMessageDialog(null, "Por la forma de pago seleccionada se le aplica un 10% de descuento.\nEl monto total a abonar es de: "
                    + montoCompraConDesc, NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay descuento para la forma de pago seleccionada.\nEl monto a total a abonar es de: "
                    + montoCompra, NOMBRE_EJERCICIO, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
