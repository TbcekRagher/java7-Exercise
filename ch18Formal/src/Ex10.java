import java.awt.*;
import java.awt.event.*;
public class Ex10 extends Frame implements ItemListener
{
	
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(X1.getState()==true)
		{
			fr.setLayout(new FlowLayout(FlowLayout.LEFT));
		}else if (X2.getState()==true)
		{
			fr.setLayout(new FlowLayout(FlowLayout.CENTER));
		}else if (X3.getState()==true)
		{
			fr.setLayout(new FlowLayout(FlowLayout.RIGHT));
		}
		///
		if(C1.getState()==true)
		{
			fr.setBackground(Color.GREEN);
		}else if (C2.getState()==true)
		{
			fr.setBackground(Color.BLUE);
		}else if (C3.getState()==true)
		{
			fr.setBackground(Color.YELLOW);
		}
		/////////
		
	}
	static Ex10 fr = new Ex10();
	static CheckboxGroup grp = new  CheckboxGroup();
	static Checkbox C1  = new Checkbox("Green",false,grp);
	static Checkbox C2  = new Checkbox("Blue",false,grp);
	static Checkbox C3  = new Checkbox("Yellow",false,grp);
	static CheckboxGroup GRP = new  CheckboxGroup();
	static Checkbox X1  = new Checkbox("Left",false,GRP);
	static Checkbox X2  = new Checkbox("Center",false,GRP);
	static Checkbox X3  = new Checkbox("Right",false,GRP);
	public static void main(String args[])
	{
		fr.setBounds(0,0,700,700);
		fr.setTitle("HELLOW");
		fr.setLayout(new FlowLayout());
		fr.setBackground(Color.pink);
		fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		//////////////////////////
		X1.addItemListener(fr); X1.setBackground(Color.BLACK); 	X1.setForeground(Color.white);
		X2.addItemListener(fr);	X2.setBackground(Color.BLACK);	X2.setForeground(Color.white);
		X3.addItemListener(fr);	X3.setBackground(Color.BLACK);	X3.setForeground(Color.white);
		fr.add(X1); fr.add(X2); fr.add(X3);
		////////////////////////////////////////////////
		C1.addItemListener(fr); C1.setBackground(Color.BLACK);  C1.setForeground(Color.white);
		C2.addItemListener(fr);	C2.setBackground(Color.BLACK);	C2.setForeground(Color.white);
		C3.addItemListener(fr);	C3.setBackground(Color.BLACK);	C3.setForeground(Color.white);
		fr.add(C1); fr.add(C2); fr.add(C3); 
		
		fr.setVisible(true);
	}
}