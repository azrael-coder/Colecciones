package ejercicios.ej10;

import javax.swing.*;
import java.awt.event.*;

public class AñadirPersona extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField nombreTextField;
    private JTextField DNITextField;


    public AñadirPersona(Agenda agenda) {
        setModal(true); //Esto bloquea la ventana de la que depende el JDialog, la ventana padre
        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonOK);
        setSize(400, 180);
        setLocationRelativeTo(null);
        setVisible(true);


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText().trim();
                String DNI = DNITextField.getText().trim();

                if (nombre.isEmpty() || DNI.isEmpty()) {
                    JOptionPane.showMessageDialog(contentPane,"Rellene todos los campos", "Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Persona persona = new Persona(nombre, DNI);
                boolean ok = agenda.aniadePersona(persona);

                if (ok){
                    JOptionPane.showMessageDialog(contentPane,"Persona añadida");
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(contentPane,"DNI duplicado o invalido", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }

        });

        buttonCancel.addActionListener(e -> dispose());



        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }





}
