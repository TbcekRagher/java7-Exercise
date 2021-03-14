import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class Ex13  extends Frame implements ActionListener 
{	
	private static final int SCROLLBARS_VERTICAL = 0;
	private int Topen=0;
	static Ex13 fr = new Ex13();
	static FileDialog FD = new FileDialog(fr,"STK",FileDialog.LOAD);
	//static TextArea T1 = new TextArea("",20,20,SCROLLBARS_VERTICAL);
	//static TextArea T2 = new TextArea("",20,20,SCROLLBARS_VERTICAL);
	static TextField T1 = new TextField(10); 
	static TextField T2 = new TextField(10);
	static Button B = new Button("Open File");
	static Dialog dia = new Dialog(fr);
	static Label diaL = new Label("");
	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		Button BTN = (Button) e.getSource();
		String data = FD.getDirectory()+FD.getFile();// 如果取消也算跑一次　這問題有點南 而且還是奇怪的檔案
		if(B ==BTN)
		{		FD.setVisible(true);
				 data = FD.getDirectory()+FD.getFile();//C:\Users\YQQ\Desktop\\aaa.txt;
				System.out.println(data);
			if(Topen ==0)
			{
			try
			{
					FileReader FREAD = new FileReader(data);
					char CC[]=new char[100];
					FREAD.read(CC);
					T1.setText(new String (CC));
					//String CCstr =new String (CC);
					//T1.setText(CCstr);
					FREAD.close();
					Topen=1;
			}catch (IOException ioe)
			{
					System.out.println("ERROR");
					
			};
			}else if(Topen==1)
			{
			try
			{
						FileReader FREAD = new FileReader(data);
						char CC[]=new char[100];
						FREAD.read(CC);
						T2.setText(new String (CC));
						//String CCstr =new String (CC);
						//T1.setText(CCstr);
						FREAD.close();
						B.setLabel("Merge");
						Topen=2;
			}catch (IOException ioe)
			{
						System.out.println("ERROR");			
			};
					
			}else if (Topen==2)
			{
				//String merge = T1.getText()+T2.getText();
				try {System.out.println("WRITER　Enter");
				FileWriter FW = new FileWriter(data);
				BufferedWriter Buf = new BufferedWriter(FW);
				Buf.write(T1.getText());
				Buf.newLine();
				Buf.write(T2.getText());
				Buf.flush();
				FW.close();
				B.setLabel("Show");
				Topen=3;
				}catch (IOException ioe2) {System.out.println("WRITER　ERROR");};
				
			}else if (Topen==3)
			{	
				try
				{
					FileReader FW = new FileReader(data);
					char RRRR[] = new char[200];
					FW.read(RRRR);
					diaL.setText(new String(RRRR));
					FW.close();
					
					dia.setVisible(true);
					Topen=0;
					B.setLabel("Open File");
					T1.setText("");
					T2.setText("");
				}catch(IOException ioe2) {};
			}
		}
	}
	public static void main(String args[]) throws IOException 
	{
		//fr.setBackground(Color.white);
		fr.setBounds(300,300,400,400);
		fr.setLayout(null); fr.setBackground(Color.pink);
		T1.setBounds(40,30,320,150); fr.add(T1); T1.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));T1.setBackground(Color.YELLOW);
		T2.setBounds(40,190,320,150);fr.add(T2); T2.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));T2.setBackground(Color.ORANGE);
		B.setBounds(150,350,100,40);fr.add(B); B.addActionListener(fr);
	/////////////////////////////
		dia.setBounds(500,500,300,300); diaL.setBounds(40,40,220,220);
		dia.setBackground(Color.pink); diaL.setBackground(Color.magenta);
		diaL.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));diaL.setBackground(Color.pink);dia.add(diaL);
		dia.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {dia.dispose();}});
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}