
package gestaodeobra;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


public class ob extends JFrame{
    public ob() {
		// --> muda o titulo e o leiaute
            Font fo = new Font("Serif", Font.BOLD, 20); 
            setTitle("Programa Swing1");
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
            // --> instancia os componentes
            JPanel panelNome = new JPanel();
		panelNome.setLayout(new GridLayout(1, 0));
            JPanel panelEndereco = new JPanel();
		panelEndereco.setLayout(new GridLayout(1, 0));
            JPanel panelValor = new JPanel();
		panelValor.setLayout(new GridLayout(1, 0));
                JPanel panelData = new JPanel();
		panelData.setLayout(new GridLayout(1, 0));
            JLabel labelNome = new JLabel("Nome: ");
            JLabel labelEndereco = new JLabel("Endereço: ");
            JLabel labelValor = new JLabel("Valor: ");
            JLabel labelData = new JLabel("Data Entrega: ");
            
            JTextField textFieldNome = new JTextField(15);
            JTextField textFieldEndereco = new JTextField(15);
            JTextField textFieldValor = new JTextField(10);
            JTextField textFieldData = new JTextField(10);
            textFieldNome.setFont(fo);
            // --> adiciona os componentes a janela
            panelNome.add(labelNome);
            panelNome.add(textFieldNome);
            panelEndereco.add(labelEndereco);
            panelEndereco.add(textFieldEndereco);
            panelValor.add(labelValor);
            panelValor.add(textFieldValor);
            panelData.add(labelData);
            panelData.add(textFieldData);
            add(panelNome);
            add(panelEndereco);
            add(panelValor);
            add(panelData);
            // --> ajusta o tamanho, a posicao e a acao ao fechar
            pack();
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            // --> mostra a janela
            setSize( 600, 200 );
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
				new ob();
			}
		});
	}
}
