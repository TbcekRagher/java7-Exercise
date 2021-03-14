import java.awt.*;
import java.awt.AWTEvent.*;
import java.awt.event.*;
public class Ex7 extends Frame implements ActionListener
{
	static Ex7 fr = new Ex7();
	static Button B = new Button("Click me");
	static Button B1 = new Button("PINK");
	public void actionPerformed(ActionEvent e)
	{	Button Btn = (Button) e.getSource();
		//Button Btn1 = (Button) e.getModifiers();
		if(B.getLabel()=="Click me"&&B ==Btn)
		{
			B.setLabel("Click me again");
		}else if (B.getLabel()=="Click me again"&&B ==Btn)
		{
			B.setLabel("Click me");
		}else if(B1==Btn&&e.getModifiers()==520)  //SHIFT65  //CTRL 130 //ALT 520
		{	//System.out.println(e.getModifiers());
			if(fr.getBackground()==Color.white) 
			{
				fr.setBackground(Color.pink);
				B1.setLabel("white");
				B1.setBackground(Color.white);
			}else
			{
				fr.setBackground(Color.white);
				B1.setLabel("Pink");
				B1.setBackground(Color.pink);
			}
		}
	}
	public static void main(String args[])
	{	BorderLayout BL = new BorderLayout(2,5);
		B.addActionListener(fr);
		B1.addActionListener(fr);
		B1.setLabel("RED");
		B1.setBackground(Color.RED);
		fr.setBackground(Color.white);
		fr.setBounds(0,0,700,700);
		fr.setLayout(BL);
		fr.add(B,BorderLayout.WEST);  fr.add(B1,BorderLayout.EAST);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}