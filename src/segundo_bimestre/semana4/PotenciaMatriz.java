package segundo_bimestre.semana4;

import java.util.Scanner;

/**
 * Programa oara elevar a un potenciaq dado lps elemtos de una matriz
 */

public class PotenciaMatriz {
    public static void main(String[] args) {
        int numero[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };//dimension de la matriz 3x3
        int filas = numero.length;
        int cols = numero[0].length;
        int mat_potencia[][] = new int[filas][cols];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < filas ; fila++) {
            for (int colu = 0; colu < cols ; colu++) {
                mat_potencia[fila][colu] = (int)Math.pow(numero[fila][colu],potencia);

            }

        }
        //lectura de la ,atriz mat_potencia
        for (int fila = 0; fila < filas ; fila++) {
            for (int colu = 0; colu < cols ; colu++) {
                mat_potencia[fila][colu] = (int) Math.pow(numero[fila][colu],potencia);
                System.out.print(mat_potencia[fila][colu] + "\t");

            }
            System.out.print("\n");

        }

    }

}
