package segundo_bimestre.semana4;

import java.util.Scanner;

public class MultiplicacionMatriz {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas para la Primera Matriz");
        int fila1 = tecaldo.nextInt();
        System.out.println("Ingrese la cantidad de columnas para la Primera Matriz");
        int columna1= tecaldo.nextInt();
        System.out.println("Ingrese la cantidad de filas para la Segunda Matriz");
        int fila2 = tecaldo.nextInt();
        System.out.println("Ingrese la cantidad de columnas para la Segunda Matriz");
        int columna2= tecaldo.nextInt();
        int numero1 [][]= new int[fila1][columna1];
        int numero2[][]= new int[fila2][columna2];
        int numero3[][]=new int[numero1.length][numero2[0].length];
        if (fila1==columna2 && columna1==fila2){
            System.out.println("Ingrese los valores de la Primera Matriz");
            for (int indice1 = 0; indice1 < numero1.length; indice1++) {
                for (int indice2 = 0; indice2 < numero1[0].length; indice2++) {
                    numero1[indice1][indice2]= tecaldo.nextInt();
                }
            }
            System.out.println("Ingrese los valores de la Segunda Matriz");
            for (int indice1 = 0; indice1 < numero2.length; indice1++) {
                for (int indice2 = 0; indice2 < numero2[0].length; indice2++) {
                    numero2[indice1][indice2]= tecaldo.nextInt();
                }
            }
            System.out.println("PRIMERA MATRIZ");
            for (int indice = 0; indice < numero1.length; indice++) {
                for (int indice2 = 0; indice2 < numero1[0].length; indice2++) {
                    System.out.print(numero1[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("SEGUNDA MATRIZ");
            System.out.println("\t");
            for (int indice1 = 0; indice1 < numero2.length; indice1++) {
                for (int indice2 = 0; indice2 < numero2[0].length; indice2++) {
                    System.out.print(numero2[indice1][indice2]+"\t");
                }
                System.out.println("\n");
            }
            for (int fila = 0; fila < numero1.length; fila++) {
                for (int col = 0; col < numero2[0].length; col++) {
                    for (int movim = 0; movim < numero1[0].length; movim++) {
                        numero3[fila][col] =numero3[fila][col]+(numero1[fila][movim] * numero2[movim][col]);
                    }
                }
            }
            System.out.println("\t");
            System.out.println("TERCERA MATRIZ");
            for (int indice = 0; indice < numero3.length; indice++) {
                for (int indice2 = 0; indice2 < numero3[0].length; indice2++) {
                    System.out.print(numero3[indice][indice2]+"\t");
                }
                System.out.println("\n");
            }
        }else{
            System.out.println("LOS VALORES ESTÁN MAL INGRESADOS");
            System.out.println("INGRESE NUEVAMENTE LOS VALORES");
            System.out.println("DEBE INGRESAR LA MATRIZ (2X2 O 5X5), ETC");

        }
    }
}
