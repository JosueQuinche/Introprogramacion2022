package bimestre3._semana3;

import java.util.Scanner;

public class FichaDatos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[] = new String[100];
        int edad[] = new int[100];
        String universidad[] = new String[100];
        int indice = 0;
        boolean interruptor = true;
        while (interruptor == true) {
            System.out.println("INGRESE DATOS DEL ESTUDIANTE");
            System.out.println("Ingrese el nombre: ");
            nombres[indice] = teclado.nextLine();
            System.out.println("Ingrese la edad: ");
            edad[indice] = teclado.nextInt();
            teclado.nextLine();//para leer el enter depues de la ing. edad
            System.out.println("Ingrese la universidad: ");
            universidad[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar otro estudiante SI / NO ? ");
            String respuesta = teclado.nextLine().toLowerCase();//cpnvertido en minusculas
            if (respuesta.equals("no")) {
                interruptor = false; //finazlizar el ciclo while
            }
        }
        //proceso de ordenar arereglo por edades
        System.out.println("ORDENAR ARREGLO POR EDAD");
        for (int indice2 = 1; indice <= edad.length - 1; indice++) {
            for (int elemento = 0; elemento <= edad.length - 2; elemento++) {
                //verificar si reaalizamos un intercambio
                if (edad[elemento] > edad[elemento + 1]) {
                    int aux = edad[elemento];
                    edad[elemento] = edad[elemento + 1];
                    edad[elemento + 1] = aux;
                    //proceso de intercambio en arreglo de nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento] = nombres[elemento + 1];
                    nombres[elemento + 1] = aux_n;
                    //proceso de intercambio en arreglo de universidad
                    String aux_u = universidad[elemento];
                    universidad[elemento] = universidad[elemento + 1];
                    universidad[elemento + 1] = aux_u;

                }

            }
        }
        //presentar los datos de los estudiantes
        for (int posicion = 0; posicion < nombres.length; posicion++) {
            if (nombres[posicion] != null) {
                System.out.println("Nombres: " + nombres[posicion]);
                System.out.println("Edad: " + edad[posicion]);
                System.out.println("Universidad: " + universidad[posicion]);
            }


        }

    }


}

