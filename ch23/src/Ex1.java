import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
public class Ex1  extends JFrame 
{
	static Ex1 fr = new Ex1();
	static Container Con= fr.getContentPane();
	static JButton B1 = new JButton("asdsadqwewscascwqeeeeeeeedog");
	static JButton B2 = new JButton("cat");
	static ImageIcon I1 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\�������˳ƹ�\\�ڤj���F�C�L.jpg");
	static ImageIcon I = new ImageIcon("C:\\Users\\YQQ\\Desktop\\�������˳ƹ�\\�p�].jpg");
	static ImageIcon I2 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\�������˳ƹ�\\���F.jpg");
	public static void main(String args[])
	{
		fr.setBounds(100,100,600,700);
		Con.setLayout(new FlowLayout());Con.add(B2);Con.add(B1);
		B1.setVerticalTextPosition(JButton.TOP);
		//B1.setBounds(100,100,600,600);B2.setBounds(400,300,200,200);
		B2.setRolloverIcon(I1);
		B1.setIcon(I); B2.setIcon(I); ///�����]�m B1.setIcon(����)"�]�mnull�]�]���X��"  B1.setPressedIcon()�������N�]���X��"" 
		B1.setRolloverEnabled(true);B2.setRolloverEnabled(true);
		B1.setPressedIcon(I1);B2.setPressedIcon(I2);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}