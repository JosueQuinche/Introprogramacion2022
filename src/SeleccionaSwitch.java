import java.util.Scanner;

/**
 * Porgrama para devolver el dia de la semana en palabras dadi un numero del 1 al 7
 * Programa creado por rsguayax
 */
public class SeleccionaSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingrese del numero del 1 al 7");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero incorrecto ");
                System.out.println("Ponga el numero que corresponde");
                System.out.println("Lea bine lo que pide ");
        }
        System.out.println("FIN DEL SWITCH");
    }

}
