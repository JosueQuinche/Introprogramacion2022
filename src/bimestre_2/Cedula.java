package bimestre_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cedula {
    private JTextField txt_n1;
    private JButton btn_verificacion;
    private JPanel PanelPrincipal;
    private JLabel lbl_resultado;

    public Cedula() {
        btn_verificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_n1.getText().length() == 10){
                    int cedula[] = new int [10];
                    String ced = txt_n1.getText();
                    System.out.println(ced);
                    for (int indice = 0; indice < cedula.length ; indice++) {
                        cedula[indice] = Character.getNumericValue(ced.charAt(indice));
                        System.out.println(cedula[indice] + "");
                    }
                    Cedula verificacion = new Cedula();
                    for (int indice = 0; indice < 9; indice = indice + 2) {
                        cedula[indice] = cedula[indice] * 2 ;
                    }
                    for (int indice  = 0; indice  < 9 ; indice ++) {
                        if ( cedula[indice] >= 10){
                            cedula[indice] = cedula[indice] - 9;

                        }

                    }
                    int acumulador = 0;
                    for (int indice = 0; indice < 9 ; indice++) {
                        acumulador = cedula[indice] + acumulador;


                    }
                    int decena = 0;
                    while (acumulador < 99 || acumulador < 1000  ){
                        decena =  acumulador / 10;
                        break;
                    }
                    System.out.println(decena);
                    decena = (decena *10 ) +10 ;
                    System.out.println(decena);
                    int resultado_resta = 0;
                    resultado_resta = decena - acumulador;

                    if ( resultado_resta ==cedula[9]){
                        String mensaje1 = "CÉDULA VÁLIDA";
                        lbl_resultado.setText(mensaje1);

                    }else{
                        String mensaje2 = "CÉDULA INVÁLIDA";
                        lbl_resultado.setText(mensaje2);

                    }



                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame incio = new JFrame("Validadcion");
        incio.setContentPane(new Cedula().PanelPrincipal);
        incio.pack();
        incio.setVisible(true);

    }
}
