package Segundo_Bimestre_semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1[] = {"hp","dell","asus","lenovo","toshiba"};
        String marcas2[] = {"samsung","huawei","dere"};
        int tam_arreglo_resultado = marcas1.length + marcas2.length;//8
        String res[] = new String[tam_arreglo_resultado];
        for (int indice = 0; indice < marcas1.length ; indice++) {
            res[indice] = marcas1[indice];

        }
        // copiamos los valores del arreglo marca2 en el arreglo total
        int indice2 =0;
        for (int indice = marcas1.length; indice < tam_arreglo_resultado ; indice++) {
            res[indice]=marcas2[indice2];
            indice2++;


        }
        //MOSTRAMOS TODOS LOS ELEMTOS DEL ARREGLO TOTAL
        for (int indice = 0; indice < res.length ; indice++) {
            System.out.println(res[indice]);

        }

    }
}
