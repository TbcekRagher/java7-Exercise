import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
public class Ex2
{
	public static void main(String args[])
	{
		Frame fr = new Frame("HOT");
		fr.setBounds(0,0,1000,1000);
		
		BorderLayout BL1 = new BorderLayout(1,2);
		fr.setLayout(BL1);
		fr.add(new Button("EAST"),BL1.EAST);
		fr.add(new Button("WESt"),BL1.WEST);
		fr.add(new Button("NORTH"),BL1.NORTH);
		fr.add(new Button("SOUTH"),BL1.SOUTH);
		fr.add(new Button("CENTER"),BL1.CENTER);
		//BL1.removeLayoutComponent();
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e ) {System.exit(0);}});
		fr.setVisible(true);
	}
}