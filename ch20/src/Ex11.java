import java.awt.*;
import java.awt.event.*;
public class Ex11 extends Frame implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	static Ex11 fr = new Ex11();
	static int x1, x2,y1,y2;
	public static void main(String args[])
	{	
		fr.setSize(200,150);
		fr.addMouseListener(new EXCEA());
		fr.addMouseMotionListener(new EXCEA());

		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	Graphics g = getGraphics(); //���F�ѨM��bstatic class EXCEA �|��static class����ѷ�  Component����"�Dstatic"�ɭP���~�n�ŧi�b�~��
	static class EXCEA extends MouseAdapter
	{
		public void mousePressed(MouseEvent e)
		{
			x1 = e.getX();
			y1 = e.getY();
		}
	public void mouseDragged(MouseEvent e)
		{
			 x2=e.getX();
			 y2=e.getY();
			//static g.drawLine(x1,y1,x2,y2);
			 x2 = x1;
			 y2 = y1;
		}
	
	}	
}