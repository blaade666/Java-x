package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Opd12_4 extends Applet {
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
		if(Integer.parseInt(txF.getText()) == numberInSys[0]) {
			g.drawString("Waarde gevonde: 12. Index: 0", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[1]) {
			g.drawString("Waarde gevonde: 13. Index: 1", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[2]) {
			g.drawString("Waarde gevonde: 15. Index: 2", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[3]) {
			g.drawString("Waarde gevonde: 16. Index: 3", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[4]) {
			g.drawString("Waarde gevonde: 18. Index: 4", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[5]) {
			g.drawString("Waarde gevonde: 19. Index: 5", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[6]) {
			g.drawString("Waarde gevonde: 21. Index: 6", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[7]) {
			g.drawString("Waarde gevonde: 22. Index: 7", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[8]) {
			g.drawString("Waarde gevonde: 24. Index: 8", 100, 100);
		}
		if(Integer.parseInt(txF.getText()) == numberInSys[9]) {
			g.drawString("Waarde gevonde: 25. Index: 9", 100, 100);
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

