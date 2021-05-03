package tecnicasenprogramacion;

import java.util.Arrays;

class EjercicioOnce {

    private static final String NOMBRE_EJERCICIO = "Ejercicio Once";

    static void ejecutar() {
        CommandosAuxiliares.SeparadorEjercicios(NOMBRE_EJERCICIO);
        int[] listaNum = new int[3];
        int[] listaNumInvertida = new int[3];

        listaNum[0] = 3;
        listaNum[1] = 2;
        listaNum[2] = 1;

        System.out.println(Arrays.toString(listaNum));
        for (int i = 0; i < listaNum.length; i++) {
            listaNumInvertida[i] = listaNum[listaNum.length - i - 1];
        }
        System.out.println(Arrays.toString(listaNumInvertida));

    }

}
