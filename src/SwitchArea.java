import java.util.Scanner;

/**
 * Programa para determinar el area de un traingulo
 * Programa para determinar el area de una cicunferencia
 * Programa para determinar el area de un cuadrado
 */
public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del area");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Dtemerinar el area del triangulo");
                System.out.println("Ingrese el valor de la base");
                int base = teclado.nextInt();
                System.out.println("Ingrese el valor de la altura");
                int altura = teclado.nextInt();
                int area = ((base * altura)/2);
                System.out.println("El area de la circunferencia es: "+ area);
                break;
            case 2:
                System.out.println( "Determianr el area de la circunferencia");
                System.out.println("Ingrese el valor de PI");
                int PI = teclado.nextInt();
                System.out.println("Ingrese el valor de radio");
                int radio = teclado.nextInt();
                int warea = (PI * radio*radio);
                System.out.println("El area de la circunferencia es: " + warea);
                break;
            case 3:
                System.out.println("Determinar el area de un cuadrado");
                System.out.println("Ingrese el valor del lado");
                int lado = teclado.nextInt();
                System.out.println("Ingrese el valor de lado");
                int dato = teclado.nextInt();
                int aarea = (lado * lado);
                System.out.println("El area de un cuadrado es: "+ aarea);
                break;
            default:
                System.out.println("Marcar error");
        }
        System.out.println("FIN DE SWITCH");



    }

}
