package Segundo_Bimestre_semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE LA PALABRA: ");
        String palabra = teclado.nextLine().toLowerCase();
        int tam_palabra= palabra.length();
        System.out.println("tam_palabra = " +tam_palabra);
        char palabra_arr[] = new char [tam_palabra];
        //pasamos los cacarcteres de palabra del areglo palabra_arr
        for (int indice = 0; indice < tam_palabra ; indice++) {
            palabra_arr[indice]=palabra.charAt(indice);

        }
        for (int indice = 0; indice < tam_palabra ; indice++) {
            System.out.println(palabra_arr[indice]);

        }
        //lectura del arreglo de derecha a izquierda
        String palabra_invertida= " ";
        for (int indice = tam_palabra-1; indice >= 0 ; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        System.out.println("palabra_invertida" + palabra_invertida);
        //determinar si es palindromo o no
        if (palabra.equals(palabra_invertida) ){
            System.out.println("Si es palabra palindromo");
        }else{
            System.out.println("No es palabra palindromo ");
        }



    }
}
