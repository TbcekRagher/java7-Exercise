import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class ¥Ü½d1
{
	public static void main(String args[])
	{	Label  lab =  new Label("Wht do you mean");
		Frame f1 = new Frame("Hellow");
		f1.setSize(300,400);
		f1.setBackground(Color.white);
		f1.setLocation(250,250);
		f1.add(lab);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
	}
}