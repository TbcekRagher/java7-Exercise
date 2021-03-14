import java.awt.*;
import java.awt.event.*;

public class Ex3 extends Frame implements ActionListener
{	private Color color;
	private boolean C=false;
	//static Graphics g=getGraphics();  這樣不對
	//Graphics g=getGraphics();  這樣也不對
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
		Graphics g=getGraphics();
		Button BTN = (Button)e.getSource();
		if(B1==BTN)
		{	color = Color.red;
			C =true;
			paint(g);
		}else if (B==BTN)
		{	color = Color.GREEN;
			C =true;
			paint(g);
		}
	}
	static Ex3 fr = new Ex3 ();
	static Button B = new Button("GREEN");
	static Button B1 = new Button ("RED");
	public static void main(String args[])
	{
		BorderLayout Br = new BorderLayout();
		fr.setSize(400,400);
		fr.setBackground(Color.white);
		fr.add(B1,Br.NORTH);
		fr.add(B,Br.SOUTH);
		B.addActionListener(fr);
		B1.addActionListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		
	}
	
	public void paint(Graphics g)
	{	//g.setColor(Color.BLUE);
		g.setFont(new Font("Courier",Font.ITALIC,18));
		g.drawString("Time files",90,120);
		g.setColor(Color.BLACK);
		g.drawRect(50,100, 150, 30);
		if(C==true)
		{	
			g.setColor(color);
			g.drawString("Time files",90,120);
		}
	}
}