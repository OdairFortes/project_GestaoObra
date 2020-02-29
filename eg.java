
package gestaodeobra;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;



public class eg extends JFrame{
    public eg() {
     
        // --> muda o titulo e o leiaute
		setTitle("Programa Swing1");
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
            // --> instancia os componentes
            JPanel panelNome = new JPanel();
		panelNome.setLayout(new GridLayout(1, 0));
            JPanel panelEndereco = new JPanel();
		panelEndereco.setLayout(new GridLayout(1, 0));
            JPanel panelTelefone = new JPanel();
		panelTelefone.setLayout(new GridLayout(1, 0));
                JPanel panelSexo = new JPanel();
		panelSexo.setLayout(new GridLayout(1, 0));
            JLabel labelNome = new JLabel("Nome: ");
            JLabel labelEndereco = new JLabel("Endereço: ");
            JLabel labelTelefone = new JLabel("Telefone: ");
            JLabel labelSexo = new JLabel("Sexo: ");
            
            JTextField textFieldNome = new JTextField(15);
            JTextField textFieldEndereco = new JTextField(15);
            JTextField textFieldTelefone = new JTextField(10);
            JTextField textFieldSexo = new JTextField(10);
		// --> adiciona os componentes a janela
		panelNome.add(labelNome);
		panelNome.add(textFieldNome);
		panelEndereco.add(labelEndereco);
		panelEndereco.add(textFieldEndereco);
                panelTelefone.add(labelTelefone);
		panelTelefone.add(textFieldTelefone);
                panelSexo.add(labelSexo);
		panelSexo.add(textFieldSexo);
		add(panelNome);
		add(panelEndereco);
                add(panelTelefone);
                add(panelSexo);
		// --> ajusta o tamanho, a posicao e a acao ao fechar
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// --> mostra a janela
		setVisible(true);

	}
    public static void main(String[] args) {
		// muda o LookAndFeel para parecer com uma aplicacao nativa
	try {
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		// --> cria um novo objeto do tipo Swing1
		// por causa da execucao multithreading da
		// API swing,isso deve ser feito dessa forma:
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new eg();
			}
		});
	}
}

        
    

