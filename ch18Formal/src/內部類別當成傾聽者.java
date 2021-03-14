import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;  
public class 內部類別當成傾聽者 
{
	 static	class internal implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{	Button bu = (Button) e.getSource();
				//if(e.getSource()==Bu)
				if(bu==Bu)
				{
					fr.setBackground(Color.blue);
				}
				if(e.getSource()==Bu1)
				{
					fr.setBackground(Color.GREEN);
					
				}
				if(e.getSource()==Bu2)
				{
					System.exit(0);
				}	
			}
		}
	static  class ItemEvent implements ItemListener
	{	//checkBox //傾聽系列
		@Override
		public void itemStateChanged(java.awt.event.ItemEvent e) {
			// TODO 自動產生的方法 Stub
			if(C.getState()==true)
			{
				L.setText("EPS");
			}
			if(C1.getState()==true)
			{
				L.setText("@#");
			}
			if(C2.getState()==true)
			{
				L.setText("EPSOn");
			}
		}	
	}
	static class Text implements TextListener
	{	@Override
		public void textValueChanged(TextEvent e)
		{
			T2.setText(T1.getText());
		}
	}
	static class Key implements KeyListener
	{ 	
		@Override
		public void keyPressed(KeyEvent e) {
			T2.setText("");
		T2.append("keyPressed() called\n");
		}
	  @Override
		public void	keyReleased(KeyEvent e) {T2.append("keyReleased() called\n");}
	  @Override
		public void keyTyped(KeyEvent e) {T2.append("keyType() called\n");}
	}
	static class KeyAda extends KeyAdapter
	{
		public void keypressed(KeyEvent l)
		{
			T2.setText("");
			if(l.isActionKey()) // 指示  
			{	
				T2.append("Action key is pressed\n");
			}else 
				{
				T2.append(l.getKeyChar()+" is pressed\n");
				}
		}
	}
	static	Frame fr = new Frame("HI");
	static Button Bu = new Button("blue");
	static Button Bu1= new Button("Green");
	static Button Bu2= new Button("Exit");
	static CheckboxGroup grp = new CheckboxGroup();
	static Checkbox C = new Checkbox("EPS",false,grp);
	static Checkbox C1 = new Checkbox("@#",false,grp);
	static Checkbox C2 = new Checkbox("EPSOn",false,grp);
	static Label L = new Label("Select a printer");
	static TextArea T1 = new TextArea("",30,30,TextArea.SCROLLBARS_NONE);
	static TextArea T2 = new TextArea("",30,30,TextArea.SCROLLBARS_NONE);
	
		public static void main(String args[])
	{		
			L.setBounds(10,200,100,100);
			L.setBackground(Color.white);
			L.setForeground(Color.red);
 			Bu.addActionListener(new internal());//
 			Bu1.addActionListener(new internal());//
			Bu2.addActionListener(new internal());//
			Bu.setBounds(100,100,150,100);
			Bu.setBackground(Color.black);
			Bu.setFont(new Font("Arial",Font.ITALIC+Font.CENTER_BASELINE,15));
			Bu.setForeground(Color.white);
			C.addItemListener(new ItemEvent());//
			C1.addItemListener(new ItemEvent());//
			C2.addItemListener(new ItemEvent());//
			////////////////////////////////////////////////////////////////////////////
			T1.addTextListener(new Text());//
			T2.setEditable(false);
			//
			//T1.addKeyListener(new Key());
			//
			T1.addKeyListener(new KeyAda());

			fr.add(Bu); fr.add(Bu1);  	fr.add(Bu2);  fr.add(L);  fr.add(C);  fr.add(C1);  fr.add(C2); 
			fr.add(T1); fr.add(T2);		
			fr.setBounds(0,0,700,700);
			fr.setLayout(new FlowLayout());
			fr.setBackground(Color.pink);
			fr.setForeground(Color.BLACK);
			fr.setFont(new Font("Arial",Font.ITALIC+Font.CENTER_BASELINE,15));
			fr.setVisible(true);
			fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		}
		
}