//修改範例 只能按一次 
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Vector;
public class Ex5_2 extends JFrame implements MouseListener//ListSelectionListener
{   //static Vector<String> leftData = new Vector<>(Arrays.asList("北京、上海、天津、江苏、浙江、广东".split("、")));
	
	static 	Ex5_2 fr = new Ex5_2();
	static	Container Con = fr.getContentPane();
	static 	JList<String> lst1 = new JList<String>();
	static	JList<String> lst2 = new JList<String>();
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
	
	/*
	 * private void doubleClick(MouseEvent e) {
        Object source = e.getSource();!!!
        if (source == left) {
            move(left, leftData, right, rightData);
        } else if (source == right) {
            move(right, rightData, left, leftData);
        }
    }
	 */
	static Vector<String> v1 = new Vector<String>();
	void to(JList<String> from,JList<String> get ,Vector<String> fromV,Vector<String> getV)
	{
		
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