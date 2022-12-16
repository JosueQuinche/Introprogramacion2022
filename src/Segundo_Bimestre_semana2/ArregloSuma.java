package Segundo_Bimestre_semana2;

import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese los primeros numeros deseados para calcular: ");
        int valores = teclado.nextInt();
        int arreglo1[] = new int [valores];
        int arreglo2[] = new int [valores];
        System.out.println("Ingrese el valor numero 1 : ");
        for (int indice = 0; indice < valores ; indice++) {
            int num1 = teclado.nextInt();
            arreglo1 [indice] = num1;
            
        }
        System.out.println("Ingrese los segundos numeros para calcular:");
        for (int indice = 0; indice < valores; indice++) {
            int num2 = teclado.nextInt();
            arreglo2[indice]=num2;
        }
        int sumtotal[]= new int [valores];
        for (int indice = 0; indice < valores ; indice++) {
            sumtotal[indice]= arreglo1[indice]+arreglo2[indice];

        }
        for (int indice = 0; indice < valores ; indice++) {
            System.out.println(sumtotal[indice]);
            
        }








    }
}
