import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//顯示當前表格內被選取的項目
public class Ex1  extends Frame implements ItemListener
{

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str = L.getSelectedItem();
		
		if(L.getSelectedItem()=="Dialog")
		{
			La.setText(str);
			La.setFont(new Font("DIALOG",Font.BOLD+Font.ITALIC,16));
		}else if (L.getSelectedItem()=="Monspaced")
		{
			La.setText(str);
			La.setFont(new Font("Monspaced",Font.BOLD+Font.ITALIC,16));
		}else if (L.getSelectedItem()=="ScanfSerif")
		{
			La.setText(str);
			La.setFont(new Font("ScanfSerif",Font.BOLD+Font.ITALIC,16));
		}else if (L.getSelectedItem()=="serif")
		{
			La.setText(str);
			La.setFont(new Font("serif",Font.BOLD+Font.ITALIC,16));
		}	
		
	}
	static Ex1 fr = new Ex1();
	static List L = new List(5,false);
	static Label La = new Label("                                   ");
	public static void main(String args[])
	{
		L.add("Dialog");
		L.add("Monspaced");
		L.add("ScanfSerif");
		L.add("serif");
		L.addItemListener(fr);
		fr.add(L);			fr.add(La);//La.setBounds(20,50,100,30);
		fr.setBounds(100,100,150,200);
		fr.setLayout(new FlowLayout(FlowLayout.LEFT));//new FlowLayout(FlowLayout.CENTER)
		fr.add(L);fr.add(La);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}