import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.*;
import java.awt.Container;//
import java.awt.event.*;
public class E1 extends JFrame implements ActionListener
{	
	static E1 fr  = new E1();
	static Container Con = fr.getContentPane();
	//static Button B = new Button("Push me");
	////////////////////////////////////
	static JButton jb = new JButton("Push");
	static JDesktopPane jdp = new JDesktopPane();
	static JButton ib = new JButton("New Frame"); 
	public static void main(String args[])
	{	
		fr.setTitle("ac");
		fr.setSize(500,500);
		Con.setLayout(new BorderLayout(5,5));Con.add(jb, BorderLayout.SOUTH);  jb.addActionListener(fr);
		Con.setBackground(Color.white);
		Con.add(jdp); 
		
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	//	JButton ib = new JButton("New Frame"); 
		JInternalFrame jif = new JInternalFrame("HEOOWW");
		Container icp = jif.getContentPane();
		ib.addActionListener(fr);
		if(jb==e.getSource()&&jif.isVisible()==false)
		{	 
		System.out.println("!!!!!!");
		icp.add(ib,BorderLayout.SOUTH);
		jdp.add(jif);
		jif.setSize(300,300);
		jif.setVisible(true);
		}
		if( ib==e.getSource())
		{	jif.setBackground(Color.pink);
			icp.setBackground(Color.pink);
			System.out.println(">?????????<");
		}
		
	}
}