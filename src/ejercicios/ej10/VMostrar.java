package ejercicios.ej10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class VMostrar {
    private final JDialog ventana;
    private JPanel panel1;
    private JTextField info;
    private JButton Aceptar;


    public VMostrar(String contenido) {
        ventana = new JDialog();
        ventana.setVisible(true);
        ventana.setContentPane(panel1);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        ventana.setSize(400,400);


        info.setText(contenido);

        Aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });


    }


}
