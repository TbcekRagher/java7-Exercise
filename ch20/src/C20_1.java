import java.awt.*;
import java.awt.event.*;

public class C20_1 extends Frame implements ActionListener
{	private boolean Clicked = false;
	@Override
	public void actionPerformed(ActionEvent e) {
		Clicked =true;
		Graphics g = getGraphics();
		paint(g);
	}
	static C20_1 fr = new C20_1();
	static Button B = new Button("Draw");
	public static void main(String args[])
	{	
		BorderLayout Br = new BorderLayout();
		fr.setTitle("qweasdqwe");
		fr.setLayout(Br);
		fr.setSize(200,150);
		fr.setVisible(true);
		fr.add(B,Br.SOUTH);
		B.addActionListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	public void paint (Graphics g)
	{	if(Clicked==true)
		{g.drawRect(100, 50, 70, 55);}
	}
}
