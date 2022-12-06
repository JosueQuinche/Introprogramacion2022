package Bimestre2;

import java.util.Scanner;

public class Semana1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = teclado.nextInt();
        int contador = 1;
        int suma_divisores= 0;
        while (contador < num){
            if (num % contador == 0){
                suma_divisores = suma_divisores + contador ;

            }
            contador = contador+ 1;
        }
        if (suma_divisores > num){
            System.out.println("El numero ingresado es abundante");
        }else {
            System.out.println("El numero ingresado no es abundante");
        }



    }
}
