import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class E3 extends JFrame implements ItemListener
{	
	static E3 fr = new E3 ();
	static Container con = fr.getContentPane();
	static JRadioButton rb = new JRadioButton();
	static JCheckBox jc1 = new JCheckBox("HWQ");
	static JCheckBox jc2 = new JCheckBox("qQ");
	static JCheckBox jc3 = new JCheckBox("szx");
	static ButtonGroup bg = new ButtonGroup();
	
	public static void main(String args[])
	{
		bg.add(rb);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}