package Trabajo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cedula;
        int numero = 0, suma =0, resultado = 0 ;

        System.out.println("Ingrese su cedula: ");
        cedula = leer.nextLine();

        for (int indice = 0; indice < cedula.length(); indice++) {
            numero = Integer.parseInt(String.valueOf(cedula.charAt(indice)));
            if (indice%2 == 0){
                numero = numero * 2 ;
                if (numero > 9){
                    numero = numero - 9;
                }
            }
            suma = suma + numero;
        }
        if (suma% 10 != 0){
            resultado = 10 - (suma%10);
            if (resultado == numero){
                System.out.println("SU CEDULA "+cedula+" ES ECUATORIANA");
            }else {
                System.out.println("SU CEDULA "+cedula+" NO ES ECUATORIANA");
            }
        }else {
            System.out.println("SU CEDULA "+cedula+" ES ECUATORIANA");
        }

    }

    public void respuesta() {
    }
}
