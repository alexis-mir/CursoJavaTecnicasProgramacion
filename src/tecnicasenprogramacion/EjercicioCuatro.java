package tecnicasenprogramacion;

import javax.swing.JOptionPane;

public class EjercicioCuatro {

    public static void ejecutar() {
        // Consulto el monto de compra, lo convierto a entero y lo almaceno.
        Double montoCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresar monto de la compra: ", "Ejercicio Cuatro", -1));
        
        //creo lista de formas de pago y pido al usuario que seleccione una
        String[] formasPagos = {"Contado", "Tarjeta", "Otros"};

        Object formaPagoSelec = JOptionPane.showInputDialog(null, "Seleccionar forma de pago: ", "Ejercicio Cuatro", -1, null, formasPagos, formasPagos[0]);
        System.out.println(formaPagoSelec);

        
        //si la forma de pago es contado ejecuto el descuento del 10%
        if (formaPagoSelec.equals(formasPagos[0])) {
            Double montoCompraConDesc = montoCompra * 0.9;
            JOptionPane.showMessageDialog(null, "Por la forma de pago seleccionada se le aplica un 10% de descuento.\nEl monto total a abonar es de: " + montoCompraConDesc, "Ejercicio Cuatro" , JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay descuento para la forma de pago seleccionada.\nEl monto a total a abonar es de: " + montoCompra, "Ejercicio Cuatro" , JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
