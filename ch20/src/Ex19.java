import java.awt.event.*;
import java.awt.*;
public class Ex19 extends Frame implements MouseListener,MouseMotionListener
{	private int x ;
	private int y ;
	private int Lx;
	private int Ly;
	static Ex19 fr = new Ex19();
	
	public static void main(String args[])
	{
		fr.setLayout(null);
		fr.setBackground(Color.pink);
		fr.setSize(500,500);
		fr.addMouseMotionListener(fr);
		fr.addMouseListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	
	 void paint()
	{	
		 Graphics g = getGraphics();
			g.drawLine(x,y,Lx,Ly);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		Lx = e.getX();
		Ly = e.getY();
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		x = e.getX();
		y = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		Graphics g = getGraphics();
		g.drawLine(x, y, Lx, Ly);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}

	

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}