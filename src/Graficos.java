import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class Graficos extends JPanel implements FichaInterface {

	public Graficos() {
		setBackground(Color.BLACK);
	}

	public void paint(Graphics g) {
		super.paint(g);
		int x = getWidth();
		int y = getHeight();

		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.WHITE);

		// Lineas Verticales///////////////////////
		g2d.drawLine(x / 3, 0, x / 3, y);
		g2d.drawLine(2 * x / 3, 0, 2 * x / 3, y);
		////////////////////////////////////////

		// Lineas Horizontales////////////////////
		g2d.drawLine(0, y / 3, x, y / 3);
		g2d.drawLine(0, 2 * y / 3, x, 2 * y / 3);
		////////////////////////////////////////

		// funcion que calcula diametro en funcion del eje X y del eje Y
		int diametro = (x * ((x / 2 - x / 3) + (2 * (y / 2 - y / 3))) / 2) / x;
		// funcion para calcular el radio
		int radio = diametro / 2;
		g2d.setColor(Color.RED);
		g2d.drawOval((x / 2) - radio, (y / 2) - radio, diametro, diametro);

	}

	@Override
	public void setFicha(int x, int y) {
		// TODO Auto-generated method stub

	}

}
