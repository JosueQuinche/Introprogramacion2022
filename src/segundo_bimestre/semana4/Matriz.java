package segundo_bimestre.semana4;

public class Matriz {
    public static void main(String[] args) {
        //int matriz[][] = new int [2][3];
        //System.out.println(matriz[1][2]);
        //creación de una matriz con valores predefinidos
        String univ[][] = {
                {"utpl","ucuenca","espol"},
                {"unl","uzuay","uide"},
                {"unach","usfq","salesiana"}
        };
        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila < filas ; fila++) {
            for (int col = 0; col < columnas ; col++) {
                System.out.print(univ[fila][col] + "\t");
            }
            System.out.print("\n");


        }

    }
}
