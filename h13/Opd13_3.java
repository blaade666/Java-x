package h13;

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

public class Opd13_3 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;
	
	private Button rbs_Knop;
	private Button gbs_Knop;
	private int i = 0;
	
	
	public void init() {
		setBackground(new Color(21, 121, 10));
		rbs_Knop = new Button("Rode Baksteen Knop");
		gbs_Knop = new Button("Grijs Baksteen Knop");
		
		RBS_ButtonListener rbs = new RBS_ButtonListener();
		GBS_ButtonListener gbs = new GBS_ButtonListener();
		rbs_Knop.addActionListener(rbs);
		gbs_Knop.addActionListener(gbs);
		
		add(rbs_Knop);
		add(gbs_Knop);
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		if(i == 0) {
			rodebaksteen(g, 0, 0, 100, 70);
		} else {
			grijsbaksteen(g, 0, 0, 150, 80);
		}
	}
	
	private void rodebaksteen(Graphics g, int x, int y, int w, int h) {
		setBackground(Color.DARK_GRAY);
		g.setColor(new Color(153, 0, 0));
		for(int j = 0; j < 20; j++) {
			for(int i = 0; i < 20; i++) {
				g.fillRect((x + 110) * i + (j * -50), (y + 80) * j, 100, 70);
			}
		}
	}
	
	private void grijsbaksteen(Graphics g, int x, int y, int w, int h) {
		setBackground(Color.lightGray);
		g.setColor(Color.darkGray);
		for(int j = 0; j < 20; j++) {
			for(int i = 0; i < 20; i++) {
				g.fillRect((x + 160) * i + (j * -50), (y + 90) * j, 150, 80);
			}
		}
	}
	
	private class RBS_ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			i = 0;
			repaint();
		}
	}
	
	private class GBS_ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			i = 1;
			repaint();
		}
	}
}
