package h12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class Opd12_1 extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;

	private int[] num = {10, 40, 900, -80, 200, 
						-400, 700, -1100, 190, -1990};
	private int average;
	
	public void init() {
		setBackground(Color.DARK_GRAY);
		int i = 0;
		while(i < num.length) {
			average += num[i];
			i++;
		}
		average /= 10;
	}

	public void paint(Graphics g) {
		resize(800, 700);
		g.setColor(Color.yellow);
		
		int i = 0;
		while(i < num.length) {
			g.drawString(Integer.toString(num[i]), 100, i * 20 + 20);
			i++;
		}
		
		g.drawString("gemiddelde is: " + average, 300, 300);
		
	}
}
