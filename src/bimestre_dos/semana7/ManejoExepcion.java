package bimestre_dos.semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAMAS PARA REALIZAR LA DIVISON DE DOS NUMEROS
 */
public class ManejoExepcion {
    //creaicon de variables globales
    double n1;
    double n2;



    public static void main(String[] args) {
        ManejoExepcion mivar = new ManejoExepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        System.out.println("RESULTADO: " + dividir());
    }

    public void ingresar_datos() {
        //el bloque try nos ayuda a captar o detectar si ocurre la excepcion
        try {//este código tinen la psobilidad de presentar excepción
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el numerador  : ");
            n1 = teclado.nextDouble();
            System.out.println("Ingrese el  denominador");
            n2 = teclado.nextDouble();
        }catch (ArithmeticException error_de_teclado){
            System.out.println("MANEJO DE ECPECIÓN  DE TIPO ARITMETICO");
            System.out.println(error_de_teclado.getMessage());

        }catch (InputMismatchException error){
            System.out.println("MANEJO DE EXPECIÓN DE CATCH");
            System.out.println(error.getMessage());

        }
    }


    public double dividir(){
        double resultado = 0;
        try{
            //código con el psiblemete pueda ocurrir una excepción
            resultado = n1 /n2  ;
            return resultado;
        }catch (ArithmeticException error){
            //este código se ejecuta solo su ocurre una excepsción
            System.out.println("ERROR DE TIPO ARITMÉTICO");
            System.out.println(error.getMessage());

        }finally {
            //este código se ejecuta ocurra o no la excepción
            System.out.println("INGRESÓ A FINALLY");
        }
        System.out.println("RESULTADO= "+ resultado );
        return resultado;
    }
}
