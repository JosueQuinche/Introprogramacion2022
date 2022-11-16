package Condicional_Tarea;

import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la tolerancia del componente critico");
        double tol= teclado.nextInt();
        if (tol < 0.1){
            System.out.println("Exploracion Especial");
        } else if ((tol >= 0.1)&&(tol < 1)) {
            System.out.println("Grado militar");            
        } else if ((tol >= 1)&&(tol < 10)) {
            System.out.println("Grado comercial");

        } else if (tol >= 10) {
            System.out.println("Grado jugete");

        }
    }
}
