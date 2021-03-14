import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
public class Ex2 extends JFrame implements ItemListener
{
	static Ex2 fr = new Ex2();
	static Container Con = fr.getContentPane();
	static JCheckBox C1 = new JCheckBox();
	static JCheckBox C2 = new JCheckBox();
	static JCheckBox C3 = new JCheckBox();
	static JLabel L = new JLabel();
	@SuppressWarnings("deprecation")
	public static void main(String args [])
	{
		fr.setBounds(100, 100, 500, 500);
		Con.setLayout(new FlowLayout());
		Con.add(C1);Con.add(C2);Con.add(C3); Con.add(L);
		C1.setLabel("apple"); C2.setLabel("banana"); C3.setLabel("guava");
		C1.addItemListener(fr);C2.addItemListener(fr);C3.addItemListener(fr);
		L.setText("count: ");
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	int count=0;
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==e.SELECTED)
			{
				L.setText("count: "+Integer.toString(++count));
			}
			
		else if (e.getStateChange()==e.DESELECTED)
		{
			L.setText("count: "+Integer.toString(--count));
		}
		
	}
}