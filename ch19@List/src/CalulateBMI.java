import java.awt.*;
import java.awt.event.*;
//ex12
public class CalulateBMI extends Frame implements ActionListener
{	private double height,weight;
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button) e.getSource();
		height = Double.parseDouble(TH.getText())/100;  
		weight = Double.parseDouble(TW.getText());  
		double BMI = weight/Math.pow(height, 2);
		if(B==btn)
		{
			if(BMI<18)
			{
				LTT.setText("BMI= "+BMI +"�ӽG�F�� ���@,�}�|�_���Զ��!!");
			}else if (BMI>=18&&BMI<20)
			{
				LTT.setText("BMI= "+BMI +"���I�G�� ���@!!");
			}else if (BMI>=20&&BMI<2)
			{
				LTT.setText("BMI= "+BMI +"�A�n�� !!");
			}else if (BMI>=22&&BMI<24)
			{
				LTT.setText("BMI= "+BMI +"���I�D��,�n�`�N�o ���@!!");
			}else if (BMI>=24&&BMI<27)
			{
				LTT.setText("BMI= "+BMI+"�ӭD�F�� �n��ΤF! ���@!! �Ķ�!! ");
			}else if (BMI>27)
			{
				LTT.setText("BMI = "+BMI+"�Φ�����! ");
			}
			LTT.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,16));
			dia.setVisible(true);
		}else if(BSure == btn)
		{
			dia.dispose();
		}
		
	}
	static CalulateBMI fr = new CalulateBMI();
	static Dialog dia = new Dialog(fr);
	static Label LH = new Label("����");
	static Label LW = new Label("�魫");
	static TextField TH = new TextField();
	static TextField TW = new TextField();
	static Label LCM = new Label("����");
	static Label LKG = new Label("����");
	static Button B = new Button("�p��");
	static Button BSure = new Button("�T�w");
	static Label LTT = new Label("");
	static Label LTT1 = new Label("");
	public static void main(String args[])
	{
		fr.setLayout(null);
		fr.setBounds(300,300,400,250);
		fr.setBackground(Color.pink);
		LH.setBounds(50,50,70,30); LH.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));fr.add(LH);
		LW.setBounds(50,80,70,30); LW.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));fr.add(LW);
		TH.setBounds(140,50,150,30); fr.add(TH); TH.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));
		TW.setBounds(140,80,150,30); fr.add(TW); TW.setFont(new Font("Arial",Font.PLAIN+Font.BOLD,20));	
		LCM.setBounds(300,50,70,30); LCM.setFont(new Font("Dialog",Font.PLAIN+Font.BOLD,16));fr.add(LCM);
		LKG.setBounds(300,80,70,30); LKG.setFont(new Font("Dialog",Font.PLAIN+Font.BOLD,16));fr.add(LKG);
		B.setBounds(70,150,70,30); B.addActionListener(fr); fr.add(B);
		//////Dia
		dia.setModal(true);  dia.setLayout(null); dia.setTitle("BMI");
		dia.setBounds(400,400,500,400);
		dia.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {dia.setVisible(false);}});
		LTT.setBackground(Color.pink); LTT.setBounds(40,25,400,250);  dia.add(LTT); LTT.setForeground(Color.BLACK);
		BSure.setBounds(235,300,50,40); dia.add(BSure); 	BSure.addActionListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}