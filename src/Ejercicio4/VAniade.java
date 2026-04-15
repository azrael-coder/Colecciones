/**
 * @author Israel Gonzalez Lopez
 */
package Ejercicio4;
import javax.swing.*;
import java.awt.event.*;

public class VAniade extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField palabraTextField;

    public VAniade(Palabras pl) {
        setContentPane(contentPane);
        setSize(400, 180);
        setTitle("Añadir Palabra");
        setLocationRelativeTo(null);
        setVisible(true);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String palabra = palabraTextField.getText().trim().toLowerCase();

                if (palabra.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane, "Debe ingresar la palabra", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (comprobarPalabra(palabra)) {
                    JOptionPane.showMessageDialog(contentPane, "No se permiten numeros", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    pl.aniadePalabra(palabra);
                    JOptionPane.showMessageDialog(contentPane,"Añadida","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                }
            }
        });


        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    /**
     * Metodo que valida que la cadena no sea numeros
     * @param p palabra a validar
     * @return true o false
     */
    private boolean comprobarPalabra(String p){
        boolean confirmar = false;
        for (int i = 0; i < p.length(); i++) {
            if (Character.isDigit(p.charAt(i))){
                confirmar = true;
            }
        }
        return confirmar;
    }


}
