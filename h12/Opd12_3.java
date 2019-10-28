package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;



public class Opd12_3 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;

	private TextField[] txF = new TextField[5];
	private Button butOk = new Button("ok");
	private ButtonOkListener bol = new ButtonOkListener();
	private int[] inputsTxF = new int[5];

	public void init() {
		resize(800, 600);
		setBackground(Color.DARK_GRAY);

		int i = 0;
		while (i < txF.length) {
			txF[i] = new TextField("", 10);
			add(txF[i]);
			txF[i].setText(Integer.toString((int) (Math.random() * 20)));
			i++;
		}
		butOk.addActionListener(bol);
		add(butOk);
	}

	public void paint(Graphics g) {
		resize(800, 700);

	}

	private class ButtonOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < txF.length; i++) {
				inputsTxF[i] = Integer.parseInt(txF[i].getText());
			}
			Arrays.sort(inputsTxF);
			for(int i = 0; i < txF.length; i++) {
				txF[i].setText(Integer.toString(inputsTxF[i]));
			}
			repaint();
		}
	}
}
