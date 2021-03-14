import java.awt.*;
import java.awt.event.*;
//簡單的實作 mouselistener 滑鼠在區域內與否的提示
public class Ex8功能表MenuBar extends Frame implements ActionListener
{
	public void actionPerformed(ActionEvent e)  //都是e.getScourse()
	{	MenuItem MI = (MenuItem) e.getSource();
		if(MI1==MI)
		{
			fr.setBackground(Color.red);
		}else if (MI2==MI)
		{
			fr.setBackground(Color.ORANGE);
		}else if(MI3==MI)
		{
			fr.setBackground(Color.YELLOW);
		}else if(MI4==MI)
		{
			fr.setBackground(Color.GREEN);
		}else if(MI5==MI)
		{
			fr.setBackground(Color.BLUE);
		}else if(MI6==MI)
		{
			fr.setBackground(new Color(235,0,255));
		}else if(MI7==MI)
		{
			fr.dispose();
		}
		
	}
	static Ex8功能表MenuBar fr = new Ex8功能表MenuBar();
	static MenuBar MB = new MenuBar(); 
	static Menu M1 = new Menu("Color");
	static Menu M2 = new Menu("EXIT");
	static MenuItem MI1= new MenuItem("Red");
	static MenuItem MI2= new MenuItem("Orange");
	static MenuItem MI3= new MenuItem("Yellow");
	static MenuItem MI4= new MenuItem("Green");
	static MenuItem MI5= new MenuItem("Blue");
	static MenuItem MI6= new MenuItem("pupple");
	static MenuItem MI7= new MenuItem("Close Window");
	public static  void main(String args[])
	{	fr.setMenuBar(MB);//這個很特別
		MB.add(M1); 
		MB.add(M2);
		M1.add(MI1);MI1.addActionListener(fr);
		M1.add(MI2);MI2.addActionListener(fr);
		M1.add(MI3);MI3.addActionListener(fr);
		M1.add(MI4);MI4.addActionListener(fr);
		M1.add(MI5);MI5.addActionListener(fr);
		M1.add(MI6);MI6.addActionListener(fr);
		M2.add(MI7);MI7.addActionListener(fr);
		fr.setBounds(300,300,700,700);
		fr.setBackground(Color.white);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	
}