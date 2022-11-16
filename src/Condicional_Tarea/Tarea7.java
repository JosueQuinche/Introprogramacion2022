package Condicional_Tarea;

import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese  el segundo numero");
        int num2 = teclado.nextInt();
        if (num1>num2){
            System.out.println("El primer numero es mayor "+num1);
        }else if (num2>num1){
            System.out.println("El primer numero es menor"+num1);
        }else {
            System.out.println("los numeros son iguales");
        }

    }
}
