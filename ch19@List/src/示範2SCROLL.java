import java.awt.*;
import java.awt.event.*;
public class �ܽd2SCROLL extends Frame implements ActionListener,ItemListener
//�z�L change color������ �����C���ܨýT�w�A�ӧ��D�{���I���C��
{	static Color ColorX;
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		if(C1.getState()==true)   //�Q����ɴN�N�����C��u��  Color�ܼ� 
		{
			//fr.setBackground(Color.pink);
			ColorX = Color.pink;
		}else if(C2.getState()==true)
		{
			//fr.setBackground(Color.red);
			ColorX = Color.red;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Button B = (Button) e.getSource();
		if(ChangeColor == B)
		{	
			dia.setVisible(true);//OK 
		}
		else if(BOK == B)
		{	fr.setBackground(ColorX); //�u�����U�������~�|���� fr.setBackground();�åB���å�����dia
		
			dia.setVisible(false);
			//dia.dispose();
		}else if (BCANCEL == B)
		{
			dia.dispose();
		}
		
	}
	static �ܽd2SCROLL fr = new �ܽd2SCROLL();
	static Button ChangeColor = new Button("Change Color");
	static Dialog dia = new Dialog(fr);
	static CheckboxGroup grp = new CheckboxGroup();
	static Checkbox C1 = new Checkbox("Pink",false,grp);
	static Checkbox C2 = new Checkbox("Red",false,grp);
	static Button BOK = new Button("OK");
	static Button BCANCEL = new Button("Cancel");
	public static void main(String args[])
	{
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,5,20));
		fr.setBounds(300,300,300,300);
		fr.setBackground(Color.white);
		ChangeColor.setSize(70,30);  ChangeColor.addActionListener(fr);		fr.add(ChangeColor); 
		///////////////////////////////////////////////////////////////////////////////////////////////
		dia.setBackground(Color.BLACK);
		dia.setLayout(null);
		dia.setBounds(200,200,300,300);
		C1.setBounds(40,50,70,30); C1.setForeground(Color.pink);C1.addItemListener(fr);
		C2.setBounds(40,80,70,30); C2.setForeground(Color.red);	C2.addItemListener(fr);
		BOK.setBounds(140,50,100,20); BOK.addActionListener(fr);
		BCANCEL.setBounds(140,80,100,20); BCANCEL.addActionListener(fr);
		dia.add(C1); dia.add(C2);	dia.add(BOK); dia.add(BCANCEL);
		dia.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {dia.dispose();}});
		//fr.add(dia); �o�榳�� ���ӬO�n�ήץ�Ĳ�o���� dia �O�����ҥH�n�� dia.setVisible  ��Ĳ�o�ƥ�
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}