package Estrucutra_For;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactorialMultiplicacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = teclado.nextInt();
        int acumulador = 1;
        for(int contador = 1; contador <= num; contador++){
            acumulador = contador+contador;
        }
        System.out.println("El factor es: " + acumulador);
    }
}
