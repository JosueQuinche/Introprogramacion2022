import java.util.Scanner;

public class CondicionalCompuesta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("Ingrese su edad:  ");
        int edad = teclado.nextInt();
        if (edad < 18 ){
            System.out.println("Eres menor de edad");
        }else if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else if (edad <= 65){
            System.out.println("Eres de la tercera edad");
        }else if (edad <= 100){
            System.out.println("Eres una persona sabia");
        }
    }
}
