package h14;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Opd14_1 extends Applet {
	private static final long serialVersionUID = -2960260665564437164L;

	private Button newKaart = new Button("nieuwe kaart");

	private String[] kleur = {"binnen rood", "binnen zwart", "buiten rood", "buiten zwart"};
	private int gekozenKleur = 0;
	
	private String[] schoppen = { "schoppen aas", "schoppen heer", "schoppen vrouw", "schoppen boer", "schoppen twee",
			"schopppen drie", "schoppen vier", "schoppen vijf", "schoppen zes", "schoppen zeven", "schoppen acht",
			"schoppen negen", "schoppen tien" };
	private String[] harten = { "harten aas", "harten heer", "harten vrouw", "harten boer", "harten twee",
			"harten drie", "harten vier", "harten vijf", "harten zes", "harten zeven", "harten acht", "harten negen",
			"harten tien" };
	private String[] klaveren = { "klaveren aas", "klaveren heer", "klaveren vrouw", "klaveren boer", "klaveren twee",
			"klaveren drie", "klaveren vier", "klaveren vijf", "klaveren zes", "klaveren zeven", "klaveren acht",
			"klaveren negen", "klaveren tien" };
	private String[] ruiten = { "ruiten aas", "ruiten heer", "ruiten vrouw", "ruiten boer", "ruiten twee",
			"ruiten drie", "ruiten vier", "ruiten vijf", "ruiten zes", "ruiten zeven", "ruiten acht", "ruiten negen",
			"ruiten tien" };
	
	private int oneToTen = 0;

	public void init() {
		setBackground(new Color(21, 121, 10));
		
		newKaart.addActionListener(new NieuwKaart());
		add(newKaart);
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		
		gekozenKleur = (int) (Math.random() * 4);
		
		if(oneToTen == 0) {
			oneToTen = (int) (Math.random() * 11);
		}
		
		if(gekozenKleur == 0) {
			//System.out.println(kleur[0] + " 0");
			g.drawString(kleur[0], 100, 100);
			//ik neem aan dat schoppen een binnen rood kleur heeft.
			g.drawString(schoppen[oneToTen], 100, 120);
			
		}
		if(gekozenKleur == 1) {
			//System.out.println(kleur[1] + " 1");
			g.drawString(kleur[1], 100, 100);
			//ik neem aan dat harten een binnen zwart kleur heeft.
			g.drawString(harten[oneToTen], 100, 120);
		}
		if(gekozenKleur == 2) {
			//System.out.println(kleur[2] + " 2");
			g.drawString(kleur[2], 100, 100);
			//ik neem aan dat klaveren een buiten rood kleur heeft.
			g.drawString(klaveren[oneToTen], 100, 120);
			
		}
		if(gekozenKleur == 3) {
			//System.out.println(kleur[3] + " 3");
			g.drawString(kleur[3], 100, 100);
			//ik neem aan dat ruiten een buiten zwart kleur heeft.
			g.drawString(ruiten[oneToTen], 100, 120);
		}
	}
	
	private class NieuwKaart implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
