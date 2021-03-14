import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ex1
{
	public static void main(String args[])
	{
		
		Frame fr = new Frame("My Frame");
		Label La = new Label("Have a nice day");
		Button Bt = new Button("Push me");
		Checkbox CB = new Checkbox("Sony");
		Checkbox CB1 = new Checkbox("Samsong"); 
		Checkbox CB2 = new Checkbox("Benq",true); 
		TextField TF = new TextField("Hellow !!!");
		fr.setLocation (100,100);
		fr.setBackground(Color.gray);
		fr.setSize(1000,800);
		fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		La.setSize(600,200);
		La.setLocation(20,60);
		La.setBackground(Color.BLACK); //底色
		La.setForeground(Color.white);	//字色
		La.setAlignment(Label.LEFT);
		La.setText("Knowledge is power");
		Font Ft = new Font("Arial",Font.ITALIC+Font.BOLD,60);
						 //("字形",斜體,粗體,大小):
		La.setFont(Ft);
		Font Ft1 = new Font("Courier New",Font.PLAIN+Font.BOLD,16);
		fr.setLayout(null);
		Bt.setBounds(260,300,100,100);
		Bt.setBackground(new Color(120,20,15));
		Bt.setFont(Ft1);
		Bt.setForeground(Color.BLACK);
		/////////////////////
		CB.setBounds(600,600,100,20);
		CB.setBackground(Color.BLACK);
		CB1.setBounds(600,620,100,20);
		CB1.setBackground(new Color(255,10,162));
		CB2.setBounds(600,640,100,20);
		CB2.setBackground(new Color(205,200,162));
		
		//CB1.setLabel(" "); //這是CB1的複合標籤  就是一個內框裝飾 兩層 一層是chechbox 另一層是checkbox的標籤
		//CB1.getLabel();
		//CB1.setBackground(Color.BLUE);
		CB.setForeground(Color.WHITE);
		CB1.setForeground(Color.WHITE);
		CB2.setForeground(Color.BLACK);
		System.out.println(CB1.getState());
		fr.add(La);
		fr.add(Bt);
		fr.add(CB);	fr.add(CB1);	fr.add(CB2);
		//////////////////////////////
		TF.setBounds(100,580,1000,100);
		TF.setForeground(new Color(125,125,125));
		Font Ft2 = new Font("Arial",Font.ITALIC+Font.BOLD,60);
		TF.setFont(Ft2);
		fr.add(TF);
		System.out.println(TF.getText());
		///////////////////////
		BorderLayout BLT = new BorderLayout();
		                               
	}
}	