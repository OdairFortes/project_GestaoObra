/* Elementos do Grupo:
    - José Domingos Landim Cardoso;
    - Odair Paulo Fortes Piedade;
*/
package gestaodeobra;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  


public class Gestaodeobra extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField userName_text;
    JPasswordField password_text;
    JButton submit, cancel;

    Gestaodeobra() {
        
        // User Label
        user_label = new JLabel();
        user_label.setText("User Name :");
        userName_text = new JTextField();
        
        // Password

        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        // Submit

        submit = new JButton("Entrar");

        panel = new JPanel(new GridLayout(3, 1));

        panel.add(user_label);
        panel.add(userName_text);
        panel.add(password_label);
        panel.add(password_text);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Adding the listeners to components..
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Faça Login Por Favor !");
        setSize(300, 100);
        setLocation(500,280);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Gestaodeobra();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        if (userName.trim().equals("admin") && password.trim().equals("admin")) {
            message.setText(" Ola " + userName
                    + "");
        }
        else if (userName.trim().equals("j") && password.trim().equals("j")) {
            message.setText(" Ola " + userName
                    + "");
            goPrincipal gop = new goPrincipal();
            gop.setVisible(true);
            dispose();
        }
        else {
            message.setText(" Invalid user.. ");
            goPrincipal gop = new goPrincipal();
            gop.setVisible(true);
            dispose();
        }

    }
    
}
