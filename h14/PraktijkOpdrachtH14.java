package h14;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PraktijkOpdrachtH14 extends Applet {
	private Label label = new Label("Hoeveel vierkanten neem je (��n, twee, drie)?");
	private TextField txF = new TextField("", 20);
	private String fout = "";
	private int totalRemoved = 0;
	private int typedIn;
	private int random = (int) (Math.random() * 4);
	private boolean checkwin;

	public void init() {
		setBackground(new Color(21, 121, 10));

		txF.addActionListener(new TextFieldListener());

		add(label);
		add(txF);

		random = 0;
	}

	public void paint(Graphics g) {
		resize(1200, 900);
		g.drawString(fout, 660, 50);

		for (int i = 0; i < 23; i++) {
			g.fillRect(10 + (i * 30), 100, 20, 20);
		}
		removeRects(g);
	}

	private void removeRects(Graphics g) {
		g.setColor(Color.white);

		g.drawString("bot heeft deze getal ingevoerd: " + Integer.toString(random), 750, 100);

		for (int j = 1, k = 21; j < 24 || k > 0; j++, k--) {
			if (totalRemoved == j) {
				for (int i = 22; i > k; i--) {
					g.fillRect((i * 30 + 10), 100, 20, 20);
				}
			}
			if (totalRemoved > 22) {
				g.setColor(Color.white);
				for (int i = 0; i < 23; i++) {
					g.fillRect(10 + (i * 30), 100, 20, 20);
				}
				if(checkwin == true) {
					g.setColor(Color.black);
					g.drawString("you won", 660, 80);
				} else {
					g.setColor(Color.black);
					g.drawString("you lost", 660, 80);
				}
			}
		}
	}

	private class TextFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (Integer.parseInt(txF.getText()) >= 0 && Integer.parseInt(txF.getText()) >= 1
					&& Integer.parseInt(txF.getText()) <= 3) {

				typedIn = Integer.parseInt(txF.getText());
				totalRemoved += Integer.parseInt(txF.getText());
				fout = "";
				random = (int) (Math.random() * 4);
				
				if(random == 0) {
					random++;
				}
				
				//deze word in het begin gechecked of de speler 1, 2 of 3 heeft ingetypd.
				//als de speler 2 heeft ingetypd in het begin, dan gaat de speler winnen.
				//als de speler 1 of 3 heeft ingetypd in het begin, dan gaat de speler verliezen.
				
				if(typedIn == 1 && totalRemoved == 1) {
					checkwin = false;
				}
				
				if(typedIn == 2 && totalRemoved == 2) {
					checkwin = true;
				}
				
				if(typedIn == 3 && totalRemoved == 3) {
					checkwin = false;
				}
				
				//check between 1 to 19
				if(totalRemoved >= 1 && totalRemoved <= 19) {
					random = (int) (Math.random() * 4);
					if(random == 0) {
						random++;
					}
				}
				//check if its 20, 21 or 22. En check of die gaat winnen.
				if(checkwin == true && totalRemoved == 20) {
					random = 3;
				}
				if(checkwin == true && totalRemoved == 21) {
					random = 2;
				}
				if(checkwin == true && totalRemoved == 22) {
					random = 1;
				}
				//check if its 19, 20 or 21. En check of die gaat verliezen.
				if(checkwin == false && totalRemoved == 19) {
					random = 3;
				}
				if(checkwin == false && totalRemoved == 20) {
					random = 2;
				}
				if(checkwin == false && totalRemoved == 21) {
					random = 1;
				}
				
				totalRemoved += random;
				
				System.out.println("bot:" + random + ".totalRemoved: " + totalRemoved + ".typedIn: " + typedIn + ".checkwin: " + checkwin);

			} else {
				fout = "verkeerde getal!";
			}

			repaint();

		}
	}
}
