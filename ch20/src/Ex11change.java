import java.awt.*;
import java.awt.event.*;
public class Ex11change extends  MouseAdapter
{
	static Frame fr = new Frame();
	static int x1, x2,y1,y2;
	public static void main(String args[])
	{	
		fr.setSize(200,150);
		fr.addMouseListener(new Ex11change());
		fr.addMouseMotionListener(new Ex11change());

		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	 //���F�ѨM��bstatic class EXCEA �|��static class����ѷ�  Component����"�Dstatic"�ɭP���~�n�ŧi�b�~��
	
		public void mousePressed(MouseEvent e)
		{
			x1 = e.getX();
			y1 = e.getY();
		}
	public void mouseDragged(MouseEvent e)
		{	Graphics g = getGraphics();
			 x2=e.getX();
			 y2=e.getY();
		 g.drawLine(x1,y1,x2,y2);
			 x2 = x1;
			 y2 = y1;
		}
	private Graphics getGraphics() {
		// TODO �۰ʲ��ͪ���k Stub
		return null;
	}
	
}