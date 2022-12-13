package Segundo_Bimestre_semana2;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglos con valores predeterminados
        String universidades [] = {"utpl", "unl", "ucuenca", "usfq", "espol", "upn","uide"};
        int tam = universidades.length;//obtener el tamaño del arreglo
        System.out.println("tamaño del arreglo es: " + tam);
        for (int indice = 0; indice < tam ; indice++) {
            System.out.print( universidades[indice] +"\t");

        }

        //creacion de un arreglo de tipo entero
        System.out.print("\n");
        int notas [] = {8,9,7,8,10,9,7};
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.println(notas[indice]);

        }
        //creacion de arreeglo de tipo char
        char vocales[] = {'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length ; indice++) {
            System.out.println(vocales[indice]);

        }
        //creacion de un arreglo de tipo boolean
        boolean valores[] = {true,false,false,true};
        for (int indice = 0; indice < valores.length ; indice++) {
            System.out.println(valores[indice]);

        }



    }
}
