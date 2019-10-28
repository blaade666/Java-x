package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Opd14_2 extends Applet {
	private static final long serialVersionUID = -2960260665564437164L;

	private String[] SHKR = { "schoppen aas", "schoppen heer", "schoppen vrouw", "schoppen boer", "schoppen twee",
			"schopppen drie", "schoppen vier", "schoppen vijf", "schoppen zes", "schoppen zeven", "schoppen acht",
			"schoppen negen", "schoppen tien", "harten aas", "harten heer", "harten vrouw", "harten boer",
			"harten twee", "harten drie", "harten vier", "harten vijf", "harten zes", "harten zeven", "harten acht",
			"harten negen", "harten tien", "klaveren aas", "klaveren heer", "klaveren vrouw", "klaveren boer",
			"klaveren twee", "klaveren drie", "klaveren vier", "klaveren vijf", "klaveren zes", "klaveren zeven",
			"klaveren acht", "klaveren negen", "klaveren tien", "ruiten aas", "ruiten heer", "ruiten vrouw",
			"ruiten boer", "ruiten twee", "ruiten drie", "ruiten vier", "ruiten vijf", "ruiten zes", "ruiten zeven",
			"ruiten acht", "ruiten negen", "ruiten tien" };

	private Button newKaart = new Button("opnieuw kaarten uitdelen");
	private URL pad = Opd14_2.class.getResource("../src/");
	private AudioClip sound = getAudioClip(pad, "applaus.wav");
	
	
	public void init() {
		setBackground(new Color(21, 121, 10));
		newKaart.addActionListener(new NieuwKaart());
		add(newKaart);
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				g.drawString(deelKaart(), 100 + (j * 100), 100 + (i * 20));
			}
		}
	
		sound.play();
	}

	private String deelKaart() {
		int random = (int) (Math.random() * SHKR.length);
		String kaart = SHKR[random];
		
		String[] hulpLijst = new String[SHKR.length - 1];
		
		int hulpindex = 0;
		
		for(int i = 0; i < SHKR.length; i++) {
			if(i != random) {
				hulpLijst[hulpindex] = SHKR[i];
				hulpindex++;
			}
		}
		return kaart;
	}
	
	private class NieuwKaart implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
