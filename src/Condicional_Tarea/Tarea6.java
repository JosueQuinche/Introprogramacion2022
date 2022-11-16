package Condicional_Tarea;

import java.util.Scanner;

public class Tarea6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int tiempo = teclado.nextInt();
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        while (tiempo>0){
            if (tiempo>=1140){
                dias = dias +1;
                tiempo = tiempo-1140;
            } else if (tiempo>= 60) {
                horas = horas+1;
                tiempo = tiempo -60;

            }else {
                minutos = minutos+1;
                tiempo = tiempo -1;
            }
        }
        System.out.println("Dias: " + dias);
        System.out.println("Horas " + horas);
        System.out.println("Minutos " + minutos);

    }
}
