package bimestre3._semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String socio [] = {"Pablo","Ivan","Richar","Andy","David"};
        int cuenta[] = {1234,4567,8910,1112,1314};
        int saldo [] = {1200,5000,3000,2500,10000};
        boolean interruptor = true;
        int salida = 2;
        while (interruptor){
            System.out.println("Ingreser el numero de cuenta: ");
            for (int indice = 0; indice < cuenta.length ; indice++) {
                int cuenum = teclado.nextInt();
                if (cuenum == cuenta[indice]){
                    while (salida == 2){
                        System.out.println("OPCION 1 PARA REALIZAR DEPOSITO");
                        System.out.println("OPCION 2 PARA REALIZAR RETIRO");
                        System.out.println("OPCION 3 PARA CONSULTA DE SALDO");
                        System.out.println("OPCION  4 PARA SALIR ");
                        int opcion = teclado.nextInt();
                        switch (opcion){
                            case 1:
                                System.out.println("Ingrese la cantidad del deposito: ");
                                int dep = teclado.nextInt();
                                if (dep >= 0){
                                    saldo[indice]= saldo[indice]+dep;
                                }else{
                                    System.out.println("cantidad invalida");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese la cantidad del retiro: ");
                                int ret = teclado.nextInt();
                                if (ret <= saldo[indice]){
                                    saldo[indice] = saldo[indice];
                                }else{
                                    System.out.println("Cantidad invalida");
                                }
                                break;
                            case 3:
                                System.out.println("Nombre: " + socio[indice]);
                                System.out.println("Cuenta: " + cuenta[indice]);
                                System.out.println("Saldo de Cuenta " + saldo[indice]);
                            case 4:
                                salida = 4;
                                interruptor = false;
                                break;

                        }
                        System.out.println("Gracias por su visita");
                    }
                }else {
                    System.out.println("Numero de cuenta invalida");
                    System.out.println("Ingrese correctamente lo solicitado:");
                }

            }




        }
    }
}
