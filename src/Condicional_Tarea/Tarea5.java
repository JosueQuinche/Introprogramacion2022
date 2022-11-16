package Condicional_Tarea;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner ( System.in);
        System.out.println("Ingrese tres numeros enteros");
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = teclado.nextInt();
        int hipotenusa=(num1*num1)+(num2*num2);
        int numm3 = (num3*num3);
        if (hipotenusa == numm3){
            System.out.println("Son lados de un triangulo rectangulo");

        }else
            System.out.println("No son lados de un triangulo rectangulo");



    }
}
