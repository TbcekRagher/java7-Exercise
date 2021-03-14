import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
public class Ex4  extends JFrame implements ListSelectionListener
{  
	static Ex4 fr = new Ex4();
	static	Container Con = fr.getContentPane();
	static  JList lst = new JList();
	static  ImageIcon I1 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\thron.jpg");
	static	ImageIcon I2 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\redstar.jpg");
	static	ImageIcon I3 = new ImageIcon("C:\\Users\\YQQ\\Desktop\\楓之谷裝備圖\\tree.jpg");
	static 	JLabel L = new JLabel();
	static Vector<String> v = new Vector<String>();
	//static 	JLabel L2 = new JLabel();
	//static 	JLabel L3 = new JLabel();
	public static void main(String args[])
	{	v.add ( "thron");	v.add("star");	v.add("tree");	
		fr.setBounds(100,100,500,500);
		Con.setLayout(new GridLayout(2,1));
		
		lst.setListData(v);
		Con.add(new JScrollPane(lst));Con.add(L); 
		lst.addListSelectionListener(fr); L.setBounds(100, 100, 150, 50);
		// setListData!!!!
		
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(lst.getSelectedIndex()==0)  //lst.getSelectedIndex()!!!
		{
			L.setIcon(I1);
		}else if (lst.getSelectedIndex()==1)
		{
			L.setIcon(I2);
		}else if(lst.getSelectedIndex()==2)
		{
			L.setIcon(I3);
		}
	}
}