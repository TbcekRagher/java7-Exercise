import java.awt.*;
import java.awt.event.*;


public class Ex9 extends Frame implements AdjustmentListener,ActionListener
{	private int S1,S2,S3 ;
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		// TODO 自動產生的方法 Stub
		Scrollbar SBL = (Scrollbar)e.getSource();
		int size = SBL.getValue();
		
		if(SBL ==SB1)
		{
			L1.setText("Red: "+size);
			S1= size;
			
		}else if(SB2 ==SBL)
		{
			L2.setText("Green: "+size);
			S2= size;
		}
		else if(SB3 ==SBL)
		{
			L3.setText("Blue: "+size);
			S3= size;
		}else if(SB4 ==SBL)
		{
			L4.setText("Size "+size);
			str.setFont(new Font("DIALOG",Font.ITALIC+Font.BOLD,size));
		}
		str.setForeground(new Color(S1,S2,S3));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
		
	} 
	static Ex9 fr = new Ex9();	
	static Scrollbar SB1 = new Scrollbar();
	static Scrollbar SB2 = new Scrollbar();
	static Scrollbar SB3 = new Scrollbar();
	static Scrollbar SB4 = new Scrollbar();
	static Label L1 = new Label("Red: ");
	static Label L2 = new Label("Green: ");
	static Label L3 = new Label("Blue: ");
	static Label L4 = new Label("Size: ");
	static Label str = new Label("Java");
	 public static void main(String args[])
	 { 	
		 fr.setBounds(300,300,800,500);
		 fr.setBackground(Color.white);
		 fr.setLayout(null);
		 SB1.setValues(Scrollbar.VERTICAL, 10, 30,265);fr.add(SB1);SB1.addAdjustmentListener(fr);SB1.setBounds(40,40,20,120); 
		 SB2.setValues(Scrollbar.HORIZONTAL, 10, 10, 265);fr.add(SB2);SB2.addAdjustmentListener(fr);SB2.setBounds(200,40,20,120);
		 SB3.setValues(Scrollbar.HORIZONTAL, 10, 10, 265);fr.add(SB3);SB3.addAdjustmentListener(fr);SB3.setBounds(360,40,20,120);
		 SB4.setValues(Scrollbar.HORIZONTAL, 10, 10, 265);fr.add(SB4);SB4.addAdjustmentListener(fr);SB4.setBounds(520,40,20,120);
		 L1.setBounds(70,92,120,40); L1.setBackground(Color.red);fr.add(L1);
		 L2.setBounds(230,92,120,40); L2.setBackground(Color.GREEN);fr.add(L2);
		 L3.setBounds(390,92,120,40); L3.setBackground(Color.cyan);fr.add(L3);
		 L4.setBounds(550,92,120,40); L4.setBackground(Color.pink);fr.add(L4);
		 str.setBounds(40,160,640,300); str.setBackground(Color.GRAY); str.setForeground(Color.white);fr.add(str);
		 fr.add(L1); 	 fr.add(L2);	 fr.add(L3);	 fr.add(L4); fr.add(str);
		 fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		 fr.setVisible(true);
	 }
	
	
}