import java.awt.*;
import java.awt.event.*;
//success
public class Ex1and2and3 extends Frame implements ActionListener
{	static Button Btn ;
	public void actionPerformed(ActionEvent e)
	{
		Btn = (Button)e.getSource();
		if(B==Btn&&(fr.getBackground())==Color.white)
		{
			fr.setBackground(Color.yellow);
			fr.setTitle("background=yellow");
			B.setLabel("YELLOW");
			B.setBackground(Color.GREEN);
		}else if (B==Btn&& (fr.getBackground())==Color.yellow)
		{	B.setLabel("white");
			B.setBackground(Color.pink);
			fr.setBackground(Color.white);
			fr.setTitle("background=white");
			
		}
	}
	
	static Ex1and2and3 fr = new Ex1and2and3();
	static Button B = new Button("PUSH¡@ME");
	public static void main(String args[])
	{
		B.addActionListener(fr);
		fr.setBackground(Color.white);
		fr.setBounds(0,0,700,700);
		fr.setTitle("Color Changed");
		fr.setLayout(new FlowLayout());
		fr.add(B);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}