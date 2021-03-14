import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
public class E4
{	
	static JFrame fr = new JFrame("SWE");
	static Container Con = fr.getContentPane();
	static JButton B = new JButton("Color");
	static JList<String> lst = new JList<String>();
	
	public static void main(String args[])
	{	
	  
		fr.setBounds(100,100,300,300);
		B.addActionListener(new AA()); lst.addListSelectionListener(new AL());
		Con.setLayout(new BorderLayout());Con.add(new JScrollPane(lst));	Con.add(B,BorderLayout.SOUTH);
		//lst.setBounds(200, 200, 220,50); //Con.add(new JScrollPane(lst));
		//B.setBounds(400,700,100,30);//Con.setSize(900, 900);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	static  class AL implements ListSelectionListener 
	{
		@Override
		public void valueChanged(ListSelectionEvent e) {
			int color = lst.getSelectedIndex();
			 
			switch(color)
			{
				case 0:lst.setBackground(Color.red);  break;
				case 1:lst.setBackground(Color.YELLOW);  break;
				case 2:lst.setBackground(Color.ORANGE);  break;
				case 3:lst.setBackground(Color.GREEN);  break;
				case 4:lst.setBackground(Color.CYAN);  break;
				case 5:lst.setBackground(Color.BLUE);  break;
				case 6:lst.setBackground(new Color(255,0,255));  break;
			}
		}
		
	}
	static   class AA implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s[] = {"red","yellow","orange","green","cyan","blue","pupple"};
			lst.setListData(s);
		}
		
	}
}