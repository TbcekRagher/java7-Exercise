import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class �ܽd1 extends Frame implements ActionListener
{	static �ܽd1 fr = new �ܽd1();
	static Button Bu = new Button("PUsh me");
	public static void main(String args[])
	{	
		fr.setBounds(100,100,500,500);
		fr.setBackground(Color.BLACK);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e){System.exit(0);}});
		fr.setLayout(new FlowLayout());
		fr.setVisible(true);
		fr.add(Bu);
		Bu.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		Bu.setBounds(400,400,200,200);
		Bu.setBackground(Color.white);
		Bu.setForeground(Color.BLACK);
		
		Bu.addActionListener(fr);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
	/*	if(fr.getBackground()==Color.pink)
		{
			fr.setBackground(Color.BLACK);
		}*/
		fr.setBackground(Color.pink);
	}
	
	
}