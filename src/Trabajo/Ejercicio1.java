package Trabajo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n, cifra, resultado =0, exp =0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero binario a convertir: ");
        n = teclado.nextInt();
        do {
            cifra = n % 10;
            resultado = resultado + cifra*(int)Math.pow(2, exp);
            exp ++;
            n = n /10;
        }while (n > 0);
        System.out.println("El numero decimal es= "+ resultado);

    }

}
