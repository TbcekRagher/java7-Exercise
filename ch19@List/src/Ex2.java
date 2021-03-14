import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ex2  extends Frame implements ItemListener,ActionListener
{	 private Double calorie ;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
			Button btn = (Button) e.getSource();
			double BasicHOT = Integer.parseInt(TKG.getText())*22;
			double DailyGet = Double.parseDouble(THOT.getText());
			//int Hot = Integer.parseInt(TKG.getText());
			if(C.getSelectedItem()=="大")
			{
				calorie = BasicHOT/0.6;
			}else if(C.getSelectedItem()=="普通")
			{
				calorie = BasicHOT/0.65;
			}else if(C.getSelectedItem()=="低")
			{
				calorie = BasicHOT/0.75;
			}
			
			if(B ==btn) //B.addListenAction(fr);
			{
				LC1.setText("今天所需的熱量"+Double.toString(calorie));
				LC1.setFont(new Font("DIALOG",Font.PLAIN+Font.BOLD,16));
				if(calorie<=DailyGet)
				{
					LC2.setText("Andrea !!You eat too much today.");
				}else 
				{
					LC2.setText("Andrea !!You don't eat enough  today.");
				}
			}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
	static Ex2 fr = new Ex2();
	static List L = new List(5,false);
	static Label LKG = new Label("體重(kg)");
	static Label LHOT = new Label("攝取的熱量");
	static TextField TKG = new TextField();
	static TextField THOT = new TextField();
	static Label ENG = new Label("活動量");
	static Choice C = new  Choice();
	static Button B = new Button("計算"); 
	static Label LC1 = new Label("        ");
	static Label LC2 = new Label("        ");
	public static void main(String args[])
	{
		fr.setLayout(null);
		fr.setBounds(100,100,400,300);
		LKG.setBounds(20,50,100,30); LKG.setFont(new Font("DIALOG",Font.PLAIN+Font.BOLD,16)); fr.add(LKG);
		LHOT.setBounds(20,80,100,30);LHOT.setFont(new Font("DIALOG",Font.PLAIN+Font.BOLD,16)); fr.add(LHOT);
		TKG.setBounds(150,55,80,20);	fr.add(TKG);
		THOT.setBounds(150,85,80,20);	fr.add(THOT);
		ENG.setBounds(270,70,80,30); ENG.setFont(new Font("DIALOG",Font.PLAIN+Font.BOLD,16)); fr.add(ENG);
		C.add("大");  	C.add("普通");  	C.add("低"); C.addItemListener(fr); C.setBounds(270,105,80,60); fr.add(C);
		B.setBounds(20,200,70,30); B.addActionListener(fr); fr.add(B); 
		LC1.setBounds(100,185,250,30); LC1.setBackground(Color.pink);fr.add(LC1);
		LC2.setBounds(100,215,250,30); LC2.setBackground(Color.ORANGE);fr.add(LC2);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	
}