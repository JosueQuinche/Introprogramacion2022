package Bimestre2.semana6;

import java.util.Scanner;

/**
 * Programa para crear métodos para realizar operaciónes aritmnéticas
 */
public class OperacionAritmetica {
    //Creacion de varaiables globales
    int n1;
    int n2;

    /**
     * Método para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int sumar(int n1,int n2){
        return (n1 + n2);

    }

    /**
     * Método para realizar la resta de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int restar (int n1, int n2){
        return (n1 - n2);
    }

    /**
     * Método para multiplicar dos numeros enteros
     * @param n1
     * @param n2
     */
    public void multiplicacion (int n1, int n2){
        System.out.println("La multiplicaion es: " + (n1*n2));
    }

    /**
     * Método para dividir dos numeros enteros
     * @param
     * @param
     */
    public void dividir (){
        if (n2 > 0 ){
            System.out.println("La disivison es: " + ((double)n1 / (double)n2));
        }else {
            System.out.println("La division es: " + (n1 / n2));
        }
    }

    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor){
            System.out.println("Digite 0 para Salir: ");
            System.out.println("Dgite 1 para sumar los numeros: ");
            System.out.println("Digite 2 para restar los numeros: ");
            System.out.println("Digite 3 para multiplicar los numeros: ");
            System.out.println("Digite 4 para dividir los numeros: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 0:
                    System.out.println("SALIR");
                    interruptor = false;
                    break;
                case 1:
                    ingresar_numero();
                    System.out.println("La suma es = " + sumar( n1, n2));
                    break;
                case 2:
                    ingresar_numero();
                    System.out.println("La resta es = " + restar(n1 , n2));
                    break;
                case 3:
                    ingresar_numero();
                    multiplicacion(n1, n2);
                    break;
                case 4:
                    ingresar_numero();
                    dividir();
                    break;
                default:
                    System.out.println("OPCION INVÁLIDA");
            }
        }
    }
    public void ingresar_numero(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        n2 = teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }

}
