import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class �ܽd4
{
	public static void main(String args[])
	{
		Frame fr = new Frame("Nothing");
		CardLayout CL= new CardLayout(12,3);
		fr.setBackground(Color.pink);
		fr.setLocation(0,0);
		fr.setLayout(CL);
		fr.setSize(500,500);
		fr.add(new Button("ASD"),"d1");
		fr.add(new Button("BBc"),"Dx");
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e ) {System.exit(0);}});
		CL.show(fr, "c1");
		CL.show(fr, "Dx");
		//CL.first(fr);
		//CL.last(fr);
		//CL.next(fr);
		System.out.println("���ocardLayout���������Z= 12: �H"+CL.getHgap());//get�令������N�O�]�m�����Z��
		System.out.println("���oCardLayout�������Z��= 3�G�@�H�@�@"+CL.getVgap());
		System.out.println();
		fr.setVisible(true);
	}
}