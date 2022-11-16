package Condicional_Tarea;

import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int  num1= tecaldo.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2= tecaldo.nextInt();
        if (num1 % num2 == 0){
            System.out.println("El primer numero es divisible para el segundo numero");

        }else
            System.out.println("El primer numero no es divisible para le segundo numero");
    }
}
