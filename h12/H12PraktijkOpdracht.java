package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class H12PraktijkOpdracht extends Applet {
	private static final long serialVersionUID = -3230968443047219157L;

	private Graphics g;
	private Label nameLabel;
	private Label phoneNumLabel;
	private TextField name_txF;
	private TextField phoneNum_txF;
	private Button butOk;
	private String[] names = new String[10];
	private int[] phonenumbers = new int[10];
	private int j;

	public void init() {
		setBackground(new Color(35, 77, 21));

		nameLabel = new Label("name");
		phoneNumLabel = new Label("phone number");
		
		name_txF = new TextField("", 30);
		phoneNum_txF = new TextField("", 30);
		
		butOk = new Button("Ok");
		butOk.addActionListener(new ButtonOkListener());
		
		j = 0;
		
		add(nameLabel);
		add(name_txF);
		add(phoneNumLabel);
		add(phoneNum_txF);
		add(butOk);
	}

	public void paint(Graphics gtemp) {
		resize(1000, 800);
		g = gtemp;
		g.setColor(Color.yellow);
		if(j >= 10) {
			for(int i = 0; i < 10; i++) {
				g.drawString("naam" + (i + 1) + ": " + names[i], 200, i * 20 + 100);
				g.drawString("telefoonnummer" + (i + 1) + ": " + phonenumbers[i], 500, i * 20 + 100);
			}
		}
	}

	private class ButtonOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			j++;
			System.out.println(j);
			
			for(int i = 0; i < 10; i++) {
				if(j == (i + 1)) {
					names[i] = name_txF.getText();
					phonenumbers[i] = Integer.parseInt(phoneNum_txF.getText());
				}
			}
			
			repaint();
			name_txF.setText("");
			phoneNum_txF.setText("");
		}
	}
}
