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
	private JLabel lblTexto;
	private static VentanaModel  model;
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
		//////////////Llamamos al controlador
		model=new VentanaModel(this);
		//////////////
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			model.calculateAnything(txtTexto.getText());
			}
		});
		btnOk.setBounds(164, 107, 89, 23);
		contentPane.add(btnOk);

		lblTexto = new JLabel("El resultado del cubo de un numero se vera aqui");
		lblTexto.setBounds(10, 50, 216, 14);
		contentPane.add(lblTexto);

		txtTexto = new JTextField();
		txtTexto.setBounds(66, 8, 86, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
	}

	@Override
	public void showResult(String result) {
		lblTexto.setText(result);
		
	}
}
