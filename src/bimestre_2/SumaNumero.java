package bimestre_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton btn_resta;
    private JButton MULTIPLICACIÓNButton;
    private JButton DIVISIONButton;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt( txt_n1.getText() ) + Integer.parseInt( txt_n2.getText() );

                lbl_resultado.setText(String.valueOf(suma));

            }
        });
        btn_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt( txt_n1.getText() ) - Integer.parseInt( txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        MULTIPLICACIÓNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mult = Integer.parseInt( txt_n1.getText() ) * Integer.parseInt( txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(mult));

            }
        });
        DIVISIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double divi = Integer.parseInt( txt_n1.getText() ) / Integer.parseInt( txt_n2.getText() );
                lbl_resultado.setText(String.valueOf(divi));

            }
        });
    }


    public static void main(String[] args) {
        JFrame incio = new JFrame("SumaNumero");
        incio.setContentPane(new SumaNumero().panelPrincipal);
        incio.pack();
        incio.setVisible(true);
    }
}
