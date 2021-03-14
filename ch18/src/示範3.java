import java.util.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class 示範3
{	//CheckboxGroup  歸類下的所有核取 限制只存在一個被打勾
	public static void main(String args [])
	{	Scanner scanner = new Scanner(System.in);
		Frame fr = new Frame("What up");
		fr.setBackground(Color.pink);
		fr.setLocation(0, 0);
		fr.setSize(500,600);
		fr.setLayout(null);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		CheckboxGroup grp = new CheckboxGroup();
		Checkbox abox = new Checkbox("Andrea is very strict.");
		Checkbox bbox = new Checkbox("Andrea likes watching dramas.");
		Checkbox cbox = new Checkbox("I am infatuated with Andrea.");//Checkbox("str",true);
		Checkbox dbox = new Checkbox("Andrea is fairy.",true,grp);
		Checkbox ebox = new Checkbox("Andrea is pigii!!!!.",true,grp);
		//cbox.setCheckboxGroup(grp);//設定核取方塊的群組
		//System.out.println(	grp.getCheckboxGroup());
		abox.setBounds(60,40,200,20);
		bbox.setBounds(60,70,200,20);
		cbox.setBounds(60,100,200,20);
		dbox.setBounds(60,130,200,20);
		ebox.setBounds(60,160,200,20);
		
		fr.add(abox);fr.add(bbox);fr.add(cbox);fr.add(ebox);fr.add(dbox);
		TextField TF = new TextField("TF");
		System.out.println("可用顯示成其他字元"+TF.echoCharIsSet());
		System.out.println("取得方塊的預設寬度"+TF.getColumns());
		System.out.println("取得文字方塊的回應字元"+TF.getEchoChar());
		//TF.setColumns(5);//"設定寬度為n個字元 n=5"
		//TF.setEchoChar('g');//"設定回應字元為 "
		TF.setText("Andrea is so freezing.");
		TextField TF1= new TextField(); TF1.setText("Andrea is very ");
		TextField TF2= new TextField();	TF2.setText("Andrea is very ");
		TextField TF3= new TextField();	TF3.setText("Andrea is very ");
		TF.setEditable(false); TF1.setEditable(true);TF2.setEditable(true);TF3.setEditable(true);
		TF.setBounds(60,200,200,30);TF1.setBounds(60,230,200,30);TF1.setBounds(60,260,200,30);TF1.setBounds(60,290,200,30);
		TF.setBackground(Color.red);
		fr.add(TF);fr.add(TF1);fr.add(TF2);fr.add(TF3);
		TextArea  TA = new //TextArea("TA");//看成是2維的文字方塊 ;
					     	//TextArea(100,100); //建立一個文字區域的物件 (rows個字元, cols個字元);	//旋轉			
							TextArea("Andrea ",20,100,TextArea.SCROLLBARS_VERTICAL_ONLY);//(String asd,int rows,int clos,int scrollbars);
		TA.setBounds(60,400,200,200); fr.add(TA);					//只有垂直軸稈
		////////////////////////////////////////////////
		BorderLayout BL = new BorderLayout(12,1);//設定元件間的水平間距hgap是 30 像素，垂直間距vgap是 400 像素。 
		//**
		fr.setLayout(BL);
		//**
		fr.add(new Button("East"),BL.EAST);
		fr.add(new Button("West"),BL.WEST);
		fr.add(new Button("Center"),BL.CENTER);
		fr.add(new Button("SOUTH"),BL.SOUTH);
		//fr.add(new Button("North"),BL.NORTH);
		fr.setVisible(true);
		
	}
}