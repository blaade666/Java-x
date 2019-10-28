package h11;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * author: vinayak
 * version: 1.0
 * */

public class H11PraktijkOpdracht_1 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	private Graphics g2;
	
	private TextField txF;
	private Button ok;
	private TextFieldListener txl = new TextFieldListener();
	private OkButtonListener okl = new OkButtonListener();
	
	public void init() {
		setBackground(Color.darkGray);
		
		txF = new TextField("", 10);
		ok = new Button("ok");
		
		txF.addActionListener(txl);
		ok.addActionListener(okl);
		
		add(txF);
		add(ok);
		
		txF.setText("1");
	}

	public void paint(Graphics g) {
		g2 = g;
		resize(800, 550);
		
		g2.setColor(Color.green);
		for(int i = 1; i < 11; i++) {
			g2.drawString(i + " x " + txF.getText() + " = " + (i * Integer.parseInt(txF.getText())), 100, i * 20);
		}
	}
	
	private class TextFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			txF.setText(txF.getText());
			repaint();
		}
	}
	
	private class OkButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			txF.setText(txF.getText());
			repaint();
		}
	}
}
