import java.awt.event.*;
import java.awt.*;
//實作顯示使用者輸入的最後一個字母
public class keyadapter extends Frame implements ActionListener
{
	static class keyada extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{	//T1.setText("");/
			T2.setText("");
			if(e.isActionKey())
			{
				T2.append("Action key is pressed\n");
			}else
			{
				T2.append(e.getKeyChar()+" is pressed\n");
				
			}
			//T1.setText("");
		}
	}
	
	static keyadapter fr = new keyadapter();
	static TextArea T1 = new TextArea("",30,30,TextArea.SCROLLBARS_NONE);
	static TextArea T2 = new TextArea("",30,30,TextArea.SCROLLBARS_NONE);
	public static void main(String args[])
	{		fr.setTitle("keyadapter extneds Frame");
			fr.setBounds(0,0,1000,1000);
			fr.setBackground(Color.BLACK);
			fr.setLayout(new FlowLayout(FlowLayout.CENTER));
	
			T1.addKeyListener(new keyada());
			T1.setBackground(Color.white);
			T2.setBackground(Color.white);
			fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
			fr.add(T1); fr.add(T2);
			fr.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}