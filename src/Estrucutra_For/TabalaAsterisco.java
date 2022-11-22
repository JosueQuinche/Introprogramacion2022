package Estrucutra_For;

import java.util.Scanner;

public class TabalaAsterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas = teclado.nextInt();
        String fila_asterisco = "";
        for ( int col = 1 ; col<=columnas; col++){//controlamos numero de columnas
            fila_asterisco = fila_asterisco + " * ";
        }
        for(int fila = 1; fila<=filas; filas++){// controlamos numero de filas

            System.out.println(fila_asterisco);

        }
    }
}
