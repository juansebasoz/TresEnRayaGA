import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private Graficos panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Ventana().setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setTitle("Tres en Raya");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		panel = new Graficos();
		contentPane.add(panel, "Graficos");
	}

}
