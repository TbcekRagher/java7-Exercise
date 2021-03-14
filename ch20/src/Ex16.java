import java.awt.event.*;
import java.awt.*;
public class Ex16 extends Frame implements ActionListener,MouseListener
{	private int x ;
	private int y ;
	private int Lx;
	private int Ly;
	static boolean BOO=false;
	@Override
	public void actionPerformed(ActionEvent e) {
		Button BB = (Button)e.getSource();
		if(B==BB)
		{	
			if(BOO==false) {paint2();}
			x =(int)( Math.random()*400+1);
			y =(int)( Math.random()*400+1);
			Lx = (int)( Math.random()*250+1);
			Ly = (int)( Math.random()*250+1);
			paint();
			
		}else if (BB==B1)
		{	
			Graphics g=  getGraphics();
			g.setColor(fr.getBackground());
			g.fillOval(Lx,Ly,x, y);
			BOO=false;
		}
	}
	static Ex16 fr = new Ex16();
	static Button B=  new Button("Circle");
	static Button B1=  new Button("Clear");
	public static void main(String args[])
	{
		fr.setLayout(null);
		fr.setBackground(Color.pink);
		fr.setSize(500,500);
		fr.add(B); B.addActionListener(fr); B.setBounds(100,100,100,30); 
		
		fr.add(B1);B1.addActionListener(fr);B1.setBounds(230,100,100,30);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	void paint2()
	{
		Graphics g = getGraphics();
		g.setColor(fr.getBackground());
		g.fillOval(Lx,Ly,x, y);
	}
	 void paint()
	{	Graphics g = getGraphics();
		
			g.setColor(fr.getBackground());
			g.drawOval(Lx,Ly,x, y);
			g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
			g.fillOval(Lx,Ly,x, y);
			BOO=false;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		paint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}