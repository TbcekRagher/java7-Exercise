import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//��ܷƹ��ҳB���y�Ц�m
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
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	static MML fr = new MML();
	static Label L1 = new Label();
	static Label L2 = new Label();
	static Label L3 = new Label();
	 public static void main(String args[])
	  {
		 fr.setLayout(null);
		 fr.addMouseMotionListener(fr);//�o���O�b�����W�����ηƹ��Ӳ��ͨƥ� �ҥH�Ofr.  ��������ť�̷�M�]�Ofr
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
	 
