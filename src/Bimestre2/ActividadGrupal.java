package Bimestre2;

import java.util.Scanner;

public class ActividadGrupal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int interruptor_opcion = 1;
        while (interruptor_opcion == 1){
            System.out.println("Ingrese 1 para convertir un valor de mb a kb");
            System.out.println("Ingrese 2 para convertir un valor de kb a mb");
            System.out.println("Ingrese 3 para convertir un valor de mb a bits");
            System.out.println("Ingrese 4 para salir");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("OPCION 1");
                    System.out.println("Ingrese un numero en mb para transformar a kb");
                    int mb = teclado.nextInt();
                    if (mb > 0 ){
                        mb = mb * 1024;
                        System.out.println("La conversion es: "+ mb +"kb");
                    }else {
                        System.out.println("Ingrese el valor correcto en positivo");
                    }
                    break;
                case 2:
                    System.out.println("OPCION 2");
                    System.out.println("Ingrese un numero en kb para transformar a mb");
                    double kb = teclado.nextDouble();
                    if (kb >0){
                        kb=kb/1024;
                        System.out.println("La conversion es: "+ kb +" mb");
                    }else{
                        System.out.println("Ingrese el valor correcto en positivo");
                    }
                    break;
                case 3:
                    System.out.println("OPCION 3");
                    System.out.println("Ingrese un numero en mb para tranformar a bits");
                    int mb1= teclado.nextInt();
                    if (mb1 >0){
                        mb1 = mb1*1024*1024*8;
                        System.out.println("La conversion es: "+ mb1 +" bits");
                    }else{
                        System.out.println("Ingrese el valor correcto en positivo");
                    }
                    break;
                case 4:
                    System.out.println("Salida");
                    interruptor_opcion = 0;
            }
        }
        System.out.println("Gracias por su visita");
        System.out.println("Que tenga un buen dia");
    }
}
