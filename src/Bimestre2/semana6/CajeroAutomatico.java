package Bimestre2.semana6;

import java.util.Scanner;

public class CajeroAutomatico {
    static double saldoCuenta;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESA EL SALDO INCIAL DE LA CUENTA: ");
        saldoCuenta = teclado.nextInt();
        boolean interruptor = true;
        while (interruptor){
            System.out.println("DIGITE 1 PARA REALIZAR CONSULTAR SU SALDO: ");
            System.out.println("DIGITE 2 PARA REALIZAR RETIRO: ");
            System.out.println("DIGITE 3 PARA REALIZAR DEPÓSITO: ");
            System.out.println("DIGITE 4 PARA SALIR DEL CAJERO: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.println("INGRESE LA CANTIDAD A RETIRAR: ");
                    double retiro = teclado.nextDouble();
                    if (RetirarEfectivo(retiro)){
                        System.out.print("RETIRO EXITOSO");
                        System.out.print("\t");
                        System.out.println("SU SALDO ACTUAL ES: " + saldoCuenta);
                    }else{
                        System.out.println("SALDO INSUFICIENTE");
                        System.out.print("\t");
                        System.out.println("SU SALDO ACTUAL ES: " + saldoCuenta);

                    }
                    break;
                case 3:
                    System.out.println("INGRESE LA CANTIDAD A DEPOSITAR: ");
                    double deposito = teclado.nextDouble();
                    depositoEfectivo(deposito);
                    System.out.println("DEPOSITO EXITOSO");
                    System.out.print("\t");
                    System.out.println("SU SALDO ACTUAL ES: " + saldoCuenta);
                    break;
                case 4:
                    interruptor = false;
                    System.out.println("SALIDA DEL CAJERO");
                    System.out.println("GRACIAS POR SU VISITA");
                    System.out.println("QUE TENGA UN BUEN DIA");

                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    System.out.println("POR FAVOR SELECCIONE LA OPCION CORRECTA ");
                    break;


            }
        }


    }

    public static void consultarSaldo() {
        System.out.println("SU SALDO ACTUAL ES: " + saldoCuenta);
    }
    public static boolean RetirarEfectivo(double retiro){
        if (retiro <= saldoCuenta){
            saldoCuenta -= retiro;
            return true;
        }else{
            return  false;
        }

    }
    public static void depositoEfectivo (double deposito){
        saldoCuenta += deposito;

    }

}
