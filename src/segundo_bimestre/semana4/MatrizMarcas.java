package segundo_bimestre.semana4;

import java.util.Scanner;

/**
 * Programa para crear una matriz con valores recibidos del teclado, y
 * luego poder realizar repetitivamente operaciones de>
 * 1.- Busqueda
 * 2.- Modificación
 * 3.- Eliminación
 * 4.- Visualización
 * 5.- Salida
 */
public class MatrizMarcas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int filas = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int cols = teclado.nextInt();
        teclado.nextLine();
        String marcas[][] = new String[filas][cols];//establecemos dimension de la matriz
        //llenado de la matriz : OPERACION ESCRITURA
        for (int fila = 0; fila < filas ; fila++) {
            for (int colum = 0; colum < cols ; colum++) {
                System.out.println("Ingrese valor para la posición ["+fila+"]["+colum+"]");
                marcas[fila][colum] = teclado.nextLine().toLowerCase();

            }

        }
        boolean salir = false;
        while(!salir){//salir == false
            System.out.println("Digite 1 para realizar una busqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar valor: ");
            System.out.println("Digite 4 para mostarr matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("HAZ SELECCIONADO LA OPERACIÓN BUSQUEDA");
                    System.out.println("¿Qué marca desea buscar: ?");
                    String marca_buscar = teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; filas < filas ; filas++) {
                        for (int col = 0; col < cols ; col++) {
                            if (marcas[fila][col].equals(marca_buscar) ){
                                System.out.println("Si se encontro la marca: "+ marca_buscar);
                                System.out.println("En la posición: ["+fila+"]["+col+"]");
                                encontrado = true;
                                break;
                            }
                        }
                    }
                    if (encontrado==false)
                        System.out.println("MARCA NO ENCONTRADA");
                    break;
                case 2:
                    System.out.println("HAZ SELECCIONADO LA OPERACIÓN MODIFICAR");
                    System.out.println("Ingrese ¿Qué fila desea modificar: ?");
                    int fila1 = teclado.nextInt();
                    System.out.println("Ingrese ¿Qué columna desea modificar: ?");
                    int col1 = teclado.nextInt();
                    System.out.println("¿Cuál es la nueva marca ingresada: ?");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila1][col1] = nueva_marca;

                    break;
                case 3:
                    System.out.println("HAZ SELEECIONADO LA OPERACIÓN DE ELIMINACIÓN");
                    System.out.println("¿Qué marca desea eliminar: ?");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas ; fila++) {
                        for (int col = 0; col < cols ; col++) {
                            if (marcas[fila][col].equals(marca_a_eliminar)){
                                marcas[fila][col] = "";
                            }

                        }

                    }
                    break;
                case 4:
                    System.out.println("NAZ SELECCIONADO LA OPERACIÓN LECTURA");
                    for (int fil = 0; fil < filas ; fil++) {
                        for (int colna = 0; colna < cols ; colna++) {
                            System.out.print(marcas[fil][colna] + "\t");
                        }
                        System.out.println();

                    }
                    break;
                case 5:
                    System.out.println("GRACIAS POR SU VISITA");
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION INVÁLIDA");



            }
        }

    }
}
