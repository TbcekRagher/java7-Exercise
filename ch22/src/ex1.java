import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

import java.net.URL;
import java.net.URLConnection;

public class ex1 extends Frame implements ActionListener,KeyListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button)e.getSource();
		try
		{
			InetAddress IA = InetAddress.getLocalHost();
			if(b==B1)
			{
				L.setText(IA.getHostName());	
			}else if (b ==B2)
			{
				L.setText(IA.getHostAddress());
			}
		}catch(UnknownHostException k){}		
	}
	@Override
	public void keyReleased(KeyEvent e) {
			
	}@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動產生的方法 Stub
		
		try
		{
			URL U = new URL(TF.getText());
			URLConnection UC = U.openConnection();
			TFU.setText("");
			TFU.setText("主網頁大小:  "+UC.getContentLength()+"    類型為 :  "+UC.getContentType());
		}
		catch(MalformedURLException k) {} 
		catch (IOException e1) {}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動產生的方法 Stub
		
	}

	
	static ex1 fr = new ex1();
	static Button B1 = new Button("Host name");
	static Button B2 = new Button("Host address");
	static Label L = new Label("                                           ");
	static TextField TF = new TextField("                                                                ");
	static TextField TFU = new TextField("                                        ");
	public static void main(String args [])
	{	
	
	
		fr.setLayout(new FlowLayout());
		fr.add(B1);
		fr.add(B2);
		B1.setSize(100,30);B1.addActionListener(fr);
		B2.setSize(100,30);B2.addActionListener(fr);
		fr.add(L);L.setBackground(Color.pink);L.setSize(200,30);
		fr.add(TF); TF.setBackground(Color.pink); TF.addKeyListener(fr);TF.setSize(300,30);
		fr.add(TFU); TFU.setEditable(false); TFU.setSize(300,30);
		fr.setBounds(300,300,600,150);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	
	
	
}