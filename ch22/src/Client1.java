import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Client1 extends Frame implements ActionListener,KeyListener
{	static String str ;
	static Client1 fr = new Client1();
	static Button B = new Button("�s�u+�ǰe");
	
	static TextArea L = new TextArea("",20,20,TextArea.SCROLLBARS_NONE);
	static TextField TF = new TextField("");
	public static void main(String args[])
	{	BorderLayout br = new BorderLayout(10,10);
		fr.setBounds(300,300,500,500);
		fr.setLayout(br);
		fr.add(L,br.CENTER); fr.add(TF,br.NORTH);
		fr.add(B,br.SOUTH); B.setSize(200,30); B.addActionListener(fr);
		L.addKeyListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		str  = TF.getText();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(B==(Button)e.getSource())
		{	  //L.append("��J�����:" +str+'\n');
			try { 
				System.out.println("���P���A���s�u��......"+'\n');
				 L.append("���P���A���s�u��"+'\n');
				Socket S  = new Socket("192.168.100.8",22333);
			 System.out.println("�w�g���o���A���s�u..... "+'\n'); 

			 L.append("���P���A���s�u��"+'\n'+'\n');
			 L.append("��J�����:" +str+'\n');
			 L.append("��Ƽg�J��...."+'\n');
				OutputStream O = S.getOutputStream();
				O.write(str.getBytes());
			L.append("��Ƽg�J����...."+'\n');
				O.close();
				S.close();
			}	
			catch(Exception k)
			{
				 System.out.println("Error");
			}
		}
	}	
}