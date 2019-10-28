
package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1  extends Applet
{
    Label labelTextField;
    TextField TextField1;
    String NumberString;
    int number1, number2, number3;

    public void init()
    {
        setSize(350, 400);

        labelTextField = new Label("Add a number and click on enter.");
        TextField1 = new TextField("", 5);
        TextField1.addActionListener(new TekstVakListener());

        add(labelTextField);
        add(TextField1);
    }

    class TekstVakListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            NumberString = TextField1.getText();
            number1 = Integer.parseInt(NumberString);
            number2 = number3;
            if (number1 >= number2)
            {
                number3 = number1;
            }
            else
            {
                number2 = number3;
            }
            repaint();
        }
    }
    public void paint(Graphics g)
    {
        g.drawString( "Highest number = " + number3, 10, 50);
    }
}