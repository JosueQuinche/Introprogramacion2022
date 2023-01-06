package segundo_bimestre.semana4;

/**
 * Programa para genrear la transpuesta de una matriz
 */

public class MatrizTraspuestaa {
    public static void main(String[] args) {
        char letras[][] = {
                {'a','b','c'},
                {'d','e','f'}
        }; // dimension 2x3
        int filas = letras.length;//2
        int cols = letras[0].length;//3
        char transpuesta[][] = new char[cols][filas];
        for (int fila = 0; fila < cols ; fila++) {
            for (int col = 0; col < filas; col++) {
                transpuesta[fila][col] = letras[col][fila];
                System.out.print(transpuesta[fila][col]+ "\t");


            }
            System.out.println();

        }



    }
}
