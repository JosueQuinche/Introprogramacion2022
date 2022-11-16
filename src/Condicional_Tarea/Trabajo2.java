package Condicional_Tarea;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Trabajo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("EJERCICIO NUMEOR DOS");
        System.out.println("Ingrese el dia");
        int dia = sc.nextInt();
        System.out.println("Ingres el mes");
        int mes = sc.nextInt();
        System.out.println("Ingrese el año ");
        int año = sc.nextInt();
        if (año >= 1990 && año <=2010){
            if (mes >= 01 && mes <= 12){
                switch (mes){
                    case 1:
                        if (dia>=01 && dia<=31){
                            System.out.println("Fecha valida");
                        }else{
                            System.out.println("Fecha invalida");
                        }
                        break;
                    case 2:
                        if (año % 4 == 0 && año%100 != 0 || año%400 ==0){
                            if(dia >= 01 && dia <= 29){
                                System.out.println("Fecha valida");
                            }else{
                                System.out.println("Fecha invalida");
                            }
                            break;
                        }
                    case 3:
                        if ( dia >= 01 && dia <= 31){
                            System.out.println("Fecha valida");
                        }else{
                            System.out.println("Fecha invalida");
                        }break;
                    case 4:
                        if (dia >= 01 && dia <= 30){
                            System.out.println("Fecha valida");
                        }else{
                            System.out.println("Fecha invalida");
                        }break;
                    case 5:
                        if (dia  >= 01 && dia <= 31){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 6:
                        if (dia>=01 && dia<=30){
                            System.out.println("Fecha valida");
                        }else{
                            System.out.println("Fecha invalida");
                        }break;
                    case 7:
                        if (dia>=01 && dia<=31){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 8:
                        if(dia >= 01 && dia<= 31){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 9 :
                        if (dia>=01 && dia<=30){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 10:
                        if (dia>=01 && dia<= 31){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 11:
                        if (dia <= 01 && dia<= 31){
                            System.out.println("Fecha valida");
                        }else {
                            System.out.println("Fecha invalida");
                        }break;
                    case 12:
                        if (dia>= 01 && dia<=31){
                            System.out.println("Fecha invalida");
                        }else {
                            System.out.println("Fecha invalida ");
                        }break;
                }
            }
        }else {
            System.out.println("Fecha invalida");
        }

        }

    }


