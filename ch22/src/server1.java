import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class server1 extends Frame implements ActionListener
{		
	static server1 fr = new server1();
	static Button B = new Button("³s½u");
	static TextArea L = new TextArea("",20,20,TextArea.SCROLLBARS_NONE);
	public static void main(String args[])
	{	BorderLayout br = new BorderLayout(2,5);
		fr.setBounds(300,300,500,500);
		fr.setLayout(br);
		fr.add(L,br.NORTH); L.setEditable(false);
		fr.add(B,br.SOUTH); B.setSize(200,30);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		byte buff[] = new byte[10000];
		if(B ==(Button)e.getSource())
		{
		try {
			ServerSocket SS = new ServerSocket(22333);
			Socket S= SS.accept();
			InputStream I = S.getInputStream();
			int i  = I.read(buff);
			L.append(new String(buff,0,i));
			System.out.println(new String(buff,0,i));
			I.close();
			S.close();
		}catch(Exception e1)
		{
			
		}
		}
	}
}