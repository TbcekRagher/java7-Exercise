import java.awt.*;
import java.awt.event.*;
public class Ex14 extends Frame implements TextListener,ActionListener
{
	static Ex14 fr = new Ex14();
	static Button B1 = new Button("Show");
	static Button B2 = new Button("Hide");//("",高,長,)
	static TextArea T = new TextArea("",20,30,TextArea.SCROLLBARS_NONE);
	public static void main(String args[])
	{	fr.setBounds(100,100,250,450);
		fr.setLayout(new FlowLayout());
		B1.addActionListener(fr);
		B2.addActionListener(fr);
		fr.add(T); fr.add(B1); fr.add(B2); //fr.add(T);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO 自動產生的方法 Stub
		Button btn = (Button)e.getSource();
		if(B1==btn)
		{
				fr.add(T);
		}else if (B2==btn)
		{
			fr.remove(T);
		}
	}
}