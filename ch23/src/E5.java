import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class E5
{
	static JFrame fr = new JFrame("Color");
	static Container Con = fr.getContentPane();
	static JColorChooser jcolor = new JColorChooser();
	static Color color;
	static JButton B = new JButton("COLOR");
	public static void main(String args[])
	{
		fr.setBounds(100,150,500,500);
		Con.setLayout(new BorderLayout());
		Con.add(B,BorderLayout.SOUTH);B.addActionListener(new AA());
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	static class AA implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			color =  jcolor.showDialog(fr,"CCCC",Color.white);
			Con.setBackground(color);
		}
		
	}
}