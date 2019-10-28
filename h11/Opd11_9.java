package h11;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd11_9 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	
	
	public void init() {
		setBackground(Color.darkGray);
	}

	public void paint(Graphics g) {
		resize(1100, 900);
		
		for(int j = 0; j < 8; j++) {
			for(int i = 0; i < 8; i++) {
				if(j % 2 == 0) {
					if(i % 2 == 0) {
						g.setColor(Color.black);
						g.fillRect(i * 50 + 100, j * 50 + 100, 50, 50);
					} else {
						g.setColor(Color.white);
						g.fillRect(i * 50 + 100, j * 50 + 100, 50, 50);
					}
				} else {
					if(i % 2 == 1) {
						g.setColor(Color.black);
						g.fillRect(i * 50 + 100, j * 50 + 100, 50, 50);
					} else {
						g.setColor(Color.white);
						g.fillRect(i * 50 + 100, j * 50 + 100, 50, 50);
					}
				}
			}
		}
	}
}
