package SegundoBimestre_Semana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("PROGRAMA PARA OBTENER EL AREA DE LAS FIGURAS GEOMÉTRICAS");
        System.out.println("Digite 1 para obtener el area de una circunferencia: ");
        System.out.println("Digite 2 para obtener el area de un cuadrado: ");
        System.out.println("Digite 3 para obtener el area de un cilindro: ");
        System.out.println("Digite 4 para Salir");
        Scanner teclado = new Scanner( System.in);
        int opcion = teclado.nextInt();
        seleccionar_figura(opcion);
    }
    public static void seleccionar_figura(int opcion){
        Scanner teclado = new Scanner ( System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextInt();
                double area = obterner_area_circunferencia(radio);
                System.out.println("El área es: " + area);
                break;

        }
    }
    /**
     * M+etodo para obtener el area de una circunferencia
     * @param radio
     * @return
     */

    public static double obterner_area_circunferencia(double radio){
        double area = Math.PI * Math.pow(radio, 2);
        return  area;
    }

    /**
     * Método para otener el area de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }
}
