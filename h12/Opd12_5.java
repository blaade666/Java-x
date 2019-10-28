package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opd12_5 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;

	private Graphics g;
	private int[] numberInSys = {12, 13, 15, 16, 18, 19, 21, 22, 24, 25};
	private TextField txF;
	private Button butOk;

	public void init() {
		setBackground(new Color(35, 77, 21));
		
		txF = new TextField("21", 20);
		butOk = new Button("Ok");
		butOk.addActionListener(new ButtonOkListener());
		add(txF);
		add(butOk);
	}

	public void paint(Graphics gtemp) {
		resize(800, 600);
		g = gtemp;
		g.setColor(Color.yellow);
		paint2();
	}
	
	private void paint2() {
		
		for(int i = 0; i < numberInSys.length; i++) {
			if(Integer.parseInt(txF.getText()) == numberInSys[i]) {
				g.drawString("Waarde gevonde: " + numberInSys[i] + ". Index: " + i, 100, 100);
			}
		}
		
		if((Integer.parseInt(txF.getText()) != 12) && (Integer.parseInt(txF.getText()) != 13) && 
		(Integer.parseInt(txF.getText()) != 15) && (Integer.parseInt(txF.getText()) != 16) && 
		(Integer.parseInt(txF.getText()) != 18) && (Integer.parseInt(txF.getText()) != 19) && 
		(Integer.parseInt(txF.getText()) != 21) && (Integer.parseInt(txF.getText()) != 22) && 
		(Integer.parseInt(txF.getText()) != 24) && (Integer.parseInt(txF.getText()) != 25)) {
			g.drawString("Waarde niet gevonden.", 100, 200);
		}
	}

	private class ButtonOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			paint2();
			repaint();
		}
	}
}

