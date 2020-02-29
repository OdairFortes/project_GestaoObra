
package gestaodeobra;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class goPrincipal  extends JFrame{
    public static void main(String[] args) {
        goPrincipal frameTabel = new goPrincipal();
    }

    JLabel welcome = new JLabel();
    
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JButton obra = new JButton("OBRAS");
    JButton eng = new JButton("ENGENHEIROS");
    
    JButton obra_novo = new JButton("Adicionar");
    JTable obra_table = new JTable();
    
    
    JSplitPane sl; 
    private JRadioButton builtIn;


    goPrincipal(){
        super("Sistema de Gestão de Obras");
        setSize(800,600);
        setLocation(500,280);
        
        panel.setLayout (null);
        panel.setMaximumSize(new Dimension(100, 600)); 
        panel.setBackground(Color.white);
        
        panel2.setLayout (null);
        panel2.setMaximumSize(new Dimension(100, 600)); 
        panel2.setBackground(Color.white);
        
        JPanel panel2=new JPanel();
        panel2.setOpaque(false);
       
        obra.setBounds(0, 2, 400, 50);
        eng.setBounds(400, 2, 400, 50);
        
        obra_novo.setBounds(0,2,400,50);

        panel.add(obra);
        panel.add(eng);
        panel2.add(obra_novo);
        
        
        sl = new JSplitPane(SwingConstants.HORIZONTAL); 
        getContentPane().add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel=new JPanel();
        panel.setOpaque(false);
        panel.add(obra);
        
        JTabbedPane tabs=new JTabbedPane();
        tabs.addTab("Obras", panel);
        tabs.addTab("Engenheiros", panel2);
        setContentPane(tabs);
        
        setVisible(true);
        obra_novo.addActionListener(actionEvent -> {
           ob odw = new ob();
           odw.setVisible(true);       
        });
    
        eng.addActionListener(actionEvent -> {
           eg neg = new eg();
           neg.setVisible(true);       
        });
  
    }
}
