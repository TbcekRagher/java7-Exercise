import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Client1 extends Frame implements ActionListener,KeyListener
{	static String str ;
	static Client1 fr = new Client1();
	static Button B = new Button("連線+傳送");
	
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
		// TODO 自動產生的方法 Stub
		str  = TF.getText();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(B==(Button)e.getSource())
		{	  //L.append("輸入的資料:" +str+'\n');
			try { 
				System.out.println("正與伺服器連線中......"+'\n');
				 L.append("正與伺服器連線中"+'\n');
				Socket S  = new Socket("192.168.100.8",22333);
			 System.out.println("已經取得伺服器連線..... "+'\n'); 

			 L.append("正與伺服器連線中"+'\n'+'\n');
			 L.append("輸入的資料:" +str+'\n');
			 L.append("資料寫入中...."+'\n');
				OutputStream O = S.getOutputStream();
				O.write(str.getBytes());
			L.append("資料寫入完成...."+'\n');
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