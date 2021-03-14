import java.awt.*;
import java.awt.event.*;
public class Ex12 extends Frame implements TextListener,ActionListener
{	
	public void textValueChanged(TextEvent e)//只要Ｔ１的內容受到編輯就會引發事件
	{
		T2.setText(T1.getText());
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Button Bu = (Button)e.getSource();
		if(B==Bu)
		{
			T1.setText("");
			T2.setText("");
		}
	}
	
	static Ex12 fr = new Ex12();
	static Button B = new Button("Clear");
	static TextArea T1 = new TextArea("",15,15,TextArea.SCROLLBARS_NONE);
	static TextArea T2 = new TextArea("",15,15,TextArea.SCROLLBARS_NONE);
	public static void main(String args[])
	{
		fr.setBounds(100,200,300,350 );
		fr.setLayout(new FlowLayout());
		T1.addTextListener(fr);
		T2.setEditable(false);
		
		B.addActionListener(fr);
		fr.add(T1); fr.add(T2); fr.add(B);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		
	}
	
		
	

	
}