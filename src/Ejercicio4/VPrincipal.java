/**
 * @author Israel Gonzalez Lopez
 * @version 1.0
 */
package Ejercicio4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VPrincipal {
    private JFrame ventana = new JFrame("Ventana Principal");
    private JPanel panel1;
    private JButton añadirButton;
    private JButton listarButton;
    private JButton eliminarButton;
    private JButton buscarButton;
    private JButton mostrarTamañoButton;
    private JButton reestablecerButton;
    public Palabras palabras = new Palabras();

    public VPrincipal() {
        ventana.setContentPane(panel1);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(600, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);


        añadirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DAniade vAniade = new DAniade(palabras);
            }
        });

        listarButton.addActionListener(evento -> {
            if (palabras.mostrarTamaño() == 0)
                JOptionPane.showMessageDialog(ventana,"La lista esta vacia","", JOptionPane.WARNING_MESSAGE);
            else
                JOptionPane.showMessageDialog(ventana, palabras.listaPalabras(),"Palabras", JOptionPane.INFORMATION_MESSAGE);

        });


        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (palabras.mostrarTamaño() == 0)
                    JOptionPane.showMessageDialog(ventana,"La lista esta vacia","",2);

                else {
                    String eliminar = JOptionPane.showInputDialog(ventana, "Escriba la palabra para eliminar:", "Eliminar Palabra", JOptionPane.INFORMATION_MESSAGE);
                    boolean confirmar = palabras.eliminarPalabra(eliminar);

                    if (confirmar)
                        JOptionPane.showMessageDialog(ventana, "Eliminada");
                    else
                        JOptionPane.showMessageDialog(ventana, "No existe la palabra", "", 2);
                }
            }
        });


        buscarButton.addActionListener(e -> {
            if (palabras.mostrarTamaño() == 0)
                JOptionPane.showMessageDialog(ventana,"La lista esta vacia","", JOptionPane.WARNING_MESSAGE);

            else {
                String buscar = JOptionPane.showInputDialog(ventana, "Escriba la palabra para buscar:", "Buscar Palabra", JOptionPane.INFORMATION_MESSAGE);
                boolean confirmar = palabras.buscarPalabra(buscar);

                if (confirmar)
                    JOptionPane.showMessageDialog(ventana, "Encontrada");
                else
                    JOptionPane.showMessageDialog(ventana, "No existe la palabra", "", JOptionPane.WARNING_MESSAGE);
            }
        });


        reestablecerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (palabras.mostrarTamaño() == 0)
                    JOptionPane.showMessageDialog(ventana,"La lista esta vacia","", JOptionPane.WARNING_MESSAGE);

                else {
                    int confirmar = JOptionPane.showConfirmDialog(ventana,"Seguro que quieres reestablecer la lista?","",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

                    if (confirmar == 0)
                        palabras.reestablecer();
                }
            }
        });
        mostrarTamañoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (palabras.mostrarTamaño() == 0)
                    JOptionPane.showMessageDialog(ventana,"La lista esta vacia","", JOptionPane.WARNING_MESSAGE);

                else {
                    int tamanio = palabras.mostrarTamaño();
                    JOptionPane.showMessageDialog(ventana,tamanio,"Tamaño de Lista",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
    }
}
