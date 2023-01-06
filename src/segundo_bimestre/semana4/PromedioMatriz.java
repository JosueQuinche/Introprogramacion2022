package segundo_bimestre.semana4;

/**
 * Programa para calcular el promedio de los elemtos de una matriz dada
 */
public class PromedioMatriz {
    public static void main(String[] args) {
        int numero[][] = {
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        int suma_total = 0;
        for (int fila = 0; fila < numero.length ; fila++) {
            for (int cols = 0; cols < numero[0].length ; cols++) {
                //suma_total = suma_total + numero[fila][cols];
                suma_total += numero[fila][cols];


            }

        }
        int nro_elemto = numero.length * numero[0].length;
        double promedio = (double) suma_total / (double) nro_elemto;
        System.out.println("Suma: "+ suma_total);
        System.out.println("Promedio : "+ promedio);
    }

}
