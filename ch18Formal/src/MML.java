import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//顯示滑鼠所處的座標位置
public class MML extends Frame implements MouseMotionListener
{		
	public void mouseMoved(MouseEvent e)
	{
		L1.setText("x= "+e.getX());
		L2.setText("y= "+e.getY());
		L3.setText("Mouse DRagged");
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	static MML fr = new MML();
	static Label L1 = new Label();
	static Label L2 = new Label();
	static Label L3 = new Label();
	 public static void main(String args[])
	  {
		 fr.setLayout(null);
		 fr.addMouseMotionListener(fr);//這次是在介面上直接用滑鼠來產生事件 所以是fr.  接受的傾聽者當然也是fr
		 L1.setBounds(40,40,40,20);
		 L2.setBounds(100,40,40,20);
		 L3.setBounds(40,80,100,40);
		 fr.setBounds(0,0,700,700);
		 fr.setTitle("HH");
		 fr.add(L1);  fr.add(L2);  fr.add(L3);
		 fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		 fr.setVisible(true);
	  }
	
		
}
	 
