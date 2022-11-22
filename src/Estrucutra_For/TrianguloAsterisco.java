package Estrucutra_For;

import java.util.Scanner;

public class TrianguloAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        //System.out.println("Ingrese el numero de columnas: ");
        //int columnas = teclado.nextInt();
        for(int fila = 1; fila<=filas; fila++){//controlamos el numero de filas
            String filas_asteriscos = "";
            for(int col = 1; col<=fila; col++){
                filas_asteriscos = filas_asteriscos + "*";
            }
            System.out.println(filas_asteriscos);
        }
    }
}
