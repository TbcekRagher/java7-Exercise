import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.*;
import java.awt.Container;//
import java.awt.event.*;
public class E2 extends JFrame implements ActionListener
{	
	static E2 fr  = new E2();
	static ImageIcon I = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\我大精靈遊俠.jpg");
	static ImageIcon I1 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\精靈.jpg");
	static ImageIcon I2 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\割捨的愛 航海師套福.jpg");
	static JButton jb = new JButton("SUPER");
	static Container C = fr.getContentPane();
	public static void main(String args[])
	{	
		fr.setTitle("ac");
		fr.setSize(1000,1000);
		jb.setRolloverEnabled(true);
		jb.setIcon(I);
		jb.setRolloverIcon(I1);
		jb.setPressedIcon(I2);
		C.setLayout(new BorderLayout());C.add(jb,BorderLayout.CENTER);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}
