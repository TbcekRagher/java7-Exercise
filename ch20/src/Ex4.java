import java.awt.*;
import java.awt.event.*;
//�� color.bright() and color.darker �@�����O��2�άOx2�ӼW�[   �ҥH�̦n��override;
public class Ex4 extends Frame implements ActionListener
{	
	private boolean C=false;
	static private Color color = new Color(203,105,150);
	private int r,g,b;
	//static Graphics g=getGraphics();  �o�ˤ���
	//Graphics g=getGraphics();  �o�ˤ]����
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		Graphics G=getGraphics();//////////////////////////////////////////////////////////////
		Button BTN = (Button)e.getSource();
		if(B==BTN)
		{
			color = color.brighter();
			r = color.getRed();
			b = color.getBlue();
			g = color.getGreen();
			fr.setBackground(color);
			L.setText("R="+Integer.toString(r)+"G="+Integer.toString(g)+"B="+Integer.toString(b));
		}else if(B1==BTN)
		{
			color = color.darker();
			r = color.getRed();
			b = color.getBlue();
			g = color.getGreen();
			fr.setBackground(color);
			L.setText("R="+Integer.toString(r)+"G="+Integer.toString(g)+"B="+Integer.toString(b));
		}
	}
	static Ex4 fr = new Ex4();
	static Button B = new Button("Brighter");
	static Button B1 = new Button ("Darker");
	static Label L = new Label("");
	public static void main(String args[])
	{
		BorderLayout Br = new BorderLayout();
		fr.setSize(400,400); fr.setLayout(null);
		fr.setBackground(Color.white);
		fr.add(B1);
		fr.add(B);
		fr.setBackground(color);
		B.addActionListener(fr); B.setBounds(50,40,70,30);B.addActionListener(fr);
		B1.addActionListener(fr);B1.setBounds(135,40,70,30); B1.addActionListener(fr);
		L.setBounds(100,100,200,40);  fr.add(L); L.setBackground(Color.cyan);
		
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
}
