package h13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

public class H13PraktijkOpdracht extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;
	
	public void init() {
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		tree(g, 100, 200, 50, 100, 50, 125, 200, 200, 150, 200);
	}
	
	public void tree(Graphics g, int x, int y, int w, int h, int x1, int x2, int x3, int y1, int y2, int y3) {
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < 5; i++) {
				g.setColor(new Color(71, 41, 18));
				g.drawRect(x + (i * 200), y + (j * 200), w, h);
				g.setColor(new Color(29, 71, 18));
				g.drawLine(x1 + (i * 200), y1+ (j * 200), x2 + (i * 200), y2 + (j * 200));
				g.drawLine(x1 + (i * 200), y1+ (j * 200), x3 + (i * 200), y3 + (j * 200));
				g.drawLine(x2 + (i * 200), y2+ (j * 200), x3 + (i * 200), y3 + (j * 200));
			}
		}
	}
}
