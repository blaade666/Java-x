package h11;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * author: vinayak
 * version: 1.0
 * */

public class H11PraktijkOpdracht_2 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	private int table = 1;
	private Button ok;
	private OkButtonListener okl = new OkButtonListener();
	
	public void init() {
		setBackground(Color.darkGray);
		
		ok = new Button("ok");
		ok.addActionListener(okl);
		add(ok);
	}

	public void paint(Graphics g) {
		resize(800, 550);
		g.setColor(Color.yellow);
		for(int i = 1; i < 11; i ++) {
			g.drawString(i + " x " + table + " = " + (i * table), 100, i * 20);
		}
	}
	
	private class OkButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			table++;
			repaint();
		}
	}
}
