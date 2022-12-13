package Segundo_Bimestre_semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de m marcas de vehículos y las
 * almacene en un arreglo.Finalmente el prgrama debe mostrar el
 * nombre de las marcas almacenadas en el arerglo.
 */
public class ArregloMarcas {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("¿Cuantas marcas de vehiculos quiere ingresar:  ?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();//para esperar un enter
        marcas= new String[n];//creamos el arreglo con n elemtos
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println("Ingrese el nombre de la marca" + (indice+1)+": ");
            String marca = teclado.nextLine();
            marcas[indice]=marca;

        }
        System.out.println("Lista de las marcas ingresadas: ");
        //operacion lectura de un arreglo
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.print(marcas[indice]+"\t");
        }
        //OPREACION DE BUSQUEDA
        System.out.println("¿Que nombre de marca desea buscar: ?");
        //toUpperCase() es una funcion q convierte todo en  mayusculas
        //toLowerCase() fncion de minusculas
        String marca_buscada = teclado.nextLine().toUpperCase();
        System.out.println("marca_busqueda: " + marca_buscada);
        for (int indice = 0; indice < n ; indice++) {
            if (marca_buscada.equals (marcas[indice] . toUpperCase())){
                System.out.println("Marca encontrada");
                System.out.println("Se encuantra en el indice: "+indice);
                break;
            }





        }

    }
}
