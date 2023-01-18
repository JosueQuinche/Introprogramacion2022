package Bimestre2.semana6;

import java.util.Scanner;

public class FormulaPitagora {
    double hipotenusa;
    double c_ad;
    public void hipot (double a , double b ){
        c_ad = (a*a)+(b*b);
        hipotenusa = hipotenusa*hipotenusa;
    }
    public void Identificar(){
        if (hipotenusa==c_ad){
            System.out.println("ES UN TRIÁNGULO RECTANGULO");
        } else if (hipotenusa < c_ad) {
            System.out.println("ES UN TRIÁNGULO ACUTANGULO");
        } else if (hipotenusa > c_ad) {
            System.out.println("ES UN TRIÁNGULO OBTUSANGULO");
        }

    }
    public void respuesta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NÚMERO DEL PRIMER CATETO:");
        double cateto1 = teclado.nextDouble();
        System.out.println("INGRESE EL NÚMERO DEL SEGUNDO CATETO:");
        double cateto2 = teclado.nextDouble();
        System.out.println("INGRESE EL NÚMERO DE LA HIPOTENUSA");
        hipotenusa = teclado.nextDouble();
        hipot(cateto1,cateto2);
        Identificar();
    }

    public static void main(String[] args) {
        FormulaPitagora observacion = new FormulaPitagora();
        observacion.respuesta();
    }



}
