public class App {
    public static void main(String[] args) {

        MetodosOrdenamiento ordenador = new MetodosOrdenamiento();
        int[] arregloBurbuja = { 34, 2, 10, 6, 7, 5, 1, 15 };
        int[] arregloSeleccion = { 34, 2, 10, 6, 7, 5, 1, 15 };
        int[] arregloInsercion = { 34, 2, 10, 6, 7, 5, 1, 15 };

        // Insctucciones:
        // Todas las llamadas a los metodos deberan estar descomentadas y se debera
        // poder ejecutar
        // todo el poreycto sin error al finalizar la practica

        /// Consejo descomentar metodo por metodo para que puedan ir provando cada uno
        /// de ellos y resolviendo.

        /// Anotar en cada metodo el error encontrado y como lo cambio en TEXTO
                 //RESUELTO
        // Metodo burbujaTradicional
        int[] arregloBurbujaOrdenado1 = ordenador.burbujaTradicional(arregloBurbuja);
        System.out.println(
        "Resultado burbuja tradicional Metodo 1 : " +
        java.util.Arrays.toString(arregloBurbujaOrdenado1));
                        //RESUELTO
        // // Metodo burbujaTradicionalSegundo
         int[] arregloBurbujaOrdenado2 =
         ordenador.burbujaTradicionalSegundo(arregloBurbuja);
         System.out.println(
         "Resultado burbuja tradicional Metodo 2: " +
         java.util.Arrays.toString(arregloBurbujaOrdenado2));
                        //RESUELTO
         //// // Metodo burbujaTradicionalTercero
         int[] arregloBurbujaOrdenado3 =
         ordenador.burbujaTradicionalTercero(arregloBurbuja);
         System.out.println(
         "Resultado burbuja tradicional Metodo 3: " +
         java.util.Arrays.toString(arregloBurbujaOrdenado3));
                            //RESUELTO
        // Metodo seleccionPrimero
         int[] arregloSeleccionOrdenado1 =
         ordenador.seleccionPrimero(arregloSeleccion);
         System.out.println(
         "Resultado selección Metodo 1: " +
         java.util.Arrays.toString(arregloSeleccionOrdenado1));
                            //RESUELTO
        // Metodo seleccionSegundo
         int[] arregloSeleccionOrdenado2 =
         ordenador.seleccionSegundo(arregloSeleccion);
         System.out.println(
         "Resultado selección Metodo 2: " +
         java.util.Arrays.toString(arregloSeleccionOrdenado2));
                                //RESUELTO
        // // Metodo seleccionTercero
         int[] arregloSeleccionOrdenado3 =
         ordenador.seleccionTercero(arregloSeleccion);
         System.out.println(
         "Resultado selección Metodo 3: " +
         java.util.Arrays.toString(arregloSeleccionOrdenado3));
                            //RESUELTO
        // // Metodo insercionPrimero
         int[] arregloInsercionOrdenado1 =
         ordenador.insercionPrimero(arregloInsercion);
         System.out.println(
         "Resultado selección Metodo 1: " +
         java.util.Arrays.toString(arregloInsercionOrdenado1));
                    //RESUELTO
        // // Metodo insercionSegundo
         int[] arregloInsercionOrdenado2 =
         ordenador.insercionSegundo(arregloInsercion);
         System.out.println(
         "Resultado selección Metodo 1: " +
         java.util.Arrays.toString(arregloInsercionOrdenado2));

        // // Metodo insercionTercero
         int[] arregloInsercionOrdenado3 =
         ordenador.insercionTercero(arregloInsercion);
         System.out.println(
         "Resultado selección Metodo 1: " +
         java.util.Arrays.toString(arregloInsercionOrdenado3));

    }
}