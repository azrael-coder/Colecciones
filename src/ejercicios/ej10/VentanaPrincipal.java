package ejercicios.ej10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private final JFrame ventana;
    protected JPanel panel1;
    private JButton añadir, borrar, Buscar, mostrar;
    private JPanel panel2;
    private JLabel Titulo;
    private final Agenda agenda = new Agenda();

    public VentanaPrincipal() {
        ventana = new JFrame("AGENDA");
        ventana.setContentPane(panel1);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600,500);
        ventana.setVisible(true);


        añadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AñadirPersona(agenda);

            }
        });


        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VMostrar(agenda.muestraListaPersona());
            }
        });
    }


        public static void main(String[] args) {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        }

}
