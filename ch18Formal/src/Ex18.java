import java.awt.*;
import java.awt.event.*;

public class Ex18 extends Frame implements  MouseMotionListener
{
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		B.setLocation(e.getX(),e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		//B.setLocation(e.getX(),e.getY());
	}
	static Ex18 fr = new Ex18();
	static Button B = new Button("Drag me");
	static FlowLayout Flow = new FlowLayout();
	public static  void main(String args[])
	{
		fr.setBounds(100,100,500,500);
		//fr.setLayout(Flow);
		B.setBackground(Color.BLACK);
		B.setForeground(Color.white);
		B.setSize(100,100);
		B.addMouseMotionListener(fr);
		fr.add(B);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		
	}

	
}