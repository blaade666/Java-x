package h11;

import java.applet.Applet;
import java.awt.Graphics;

/*
 * author: vinayak
 * version: 1.0
 * */

public class Opd11_3 extends Applet {
	private static final long serialVersionUID = -4516717612428023562L;
	
	int num1, num2, num3;
	
	public void init() {
		num1 = 1;
		num2 = 1;
		
		System.out.println("1, 1, ");
	}

	public void paint(Graphics g) {
		resize(800, 700);
		
		for(int i = 1; i < 10;) {
			i++;
			num1 += num2;
			num2 += num1;
			
			System.out.println(num1 + ", " + num2 + ", ");
		}
	}
}
