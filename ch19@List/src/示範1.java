import java.awt.event.*;
import java.awt.*;
//�z�L���C��ܨM�w�I���C��
public class �ܽd1 extends Frame implements ItemListener
{   @Override
	public void itemStateChanged(ItemEvent e) {
		String Color1 = Lst.getSelectedItem();
		if(Color1 =="yellow")
		{
			fr.setBackground(Color.YELLOW);
		}
		else if(Color1 =="Blue")
		{
			fr.setBackground(Color.BLUE);
		}
		else if(Color1=="pink")
		{
			fr.setBackground(Color.pink);
		}
		else if(Color1=="cyan")
		{
			fr.setBackground(Color.CYAN);
		}
		else if(Color1=="orange")
		{
			fr.setBackground(Color.ORANGE);
		}
	}
	static �ܽd1 fr = new �ܽd1();
	static Choice Lst = new Choice();
	
	public static void main(String args[])
	{
		fr.setBounds(100,100,200,200);
		fr.setLayout(new FlowLayout());
		fr.setBackground(Color.white);
		Lst.add("yellow");
		Lst.add("Blue");
		Lst.add("pink");
		Lst.add("cyan");
		Lst.add("orange");
		Lst.addItemListener(fr);
		fr.setBackground(Color.YELLOW);  fr.add(Lst);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	
	
}