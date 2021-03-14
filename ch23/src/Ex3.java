import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
public class Ex3  extends JFrame implements ActionListener
{  
	static Ex3 fr = new Ex3();
	static Container Con =  fr.getContentPane();
	static JButton B1 = new JButton("Red");
	static JButton B2 = new JButton("Green");
	static JLabel L = new JLabel("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
	static ImageIcon I1 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\red.jpg");
	static ImageIcon I1a = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\redstat.jpg");
	static ImageIcon I1b = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\thron.jpg");
	static ImageIcon I2 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\green.jpg");
	static ImageIcon I2a = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\deepgreen.png");
	static ImageIcon I2b = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\tree.jpg");
	public static void main(String args[])
	{
		fr.setBounds(100,100,1000,700);
		Con.setLayout(new FlowLayout());
		Con.add(B1);Con .add(B2); Con.add(L); L.setBackground(Color.white);
		B1.addActionListener(fr);B2.addActionListener(fr);
		
		B1.setRolloverEnabled(true);B2.setRolloverEnabled(true);
		B1.setIcon(I1);B2.setIcon(I2);
		B1.setRolloverIcon(I1a); B2.setRolloverIcon(I2a);
		B1.setPressedIcon(I1b);	B2.setPressedIcon(I2b);	
		L.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,30));
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(B1==e.getSource())
		{
			L.setForeground(Color.red);
		}else if (B2 == e.getSource())
		{
			L.setForeground(Color.GREEN);
		}
		
	}
}