import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame implements VentanaInterface {

	private JPanel contentPane;
	private JTextField txtTexto;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText("Hola Mundo!!");
			}
		});
		btnOk.setBounds(164, 107, 89, 23);
		contentPane.add(btnOk);

		JLabel lblTexto = new JLabel("Texto");
		lblTexto.setBounds(10, 11, 46, 14);
		contentPane.add(lblTexto);

		txtTexto = new JTextField();
		txtTexto.setBounds(66, 8, 86, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
	}
}
