//修改範例
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class Ex5 extends JFrame implements MouseListener//ListSelectionListener
{  
	static 	Ex5 fr = new Ex5();
	static	Container Con = fr.getContentPane();
	static 	JList lst1 = new JList();
	static	JList lst2 = new JList();
	static	String s[]= {"red","yellow","orange","green","cyan","blue","pupple"};
	static Vector<String> v = new Vector<String>();
	public static void main(String args[])
	{	
		fr.setBounds(100,100,500,500);
		Con.setLayout(new GridLayout(1,2));
		lst1.setListData(s);
		Con.add(new JScrollPane(lst1)); Con.add(lst2);
		lst1.addMouseListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==lst1)
		{
			if(e.getClickCount()==2)
			{	int index = lst1.getSelectedIndex();
				String  str = s[index];
				v.add(str);
				lst2.setListData(v);
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}