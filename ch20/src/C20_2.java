import java.awt.*;
import java.awt.event.*;
//�����s�Ϥ���ܦ�
public class C20_2 extends Frame implements ActionListener
{	private Color color;
	private boolean C;
	//static Graphics g=getGraphics();  �o�ˤ���
	//Graphics g=getGraphics();  �o�ˤ]����
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �۰ʲ��ͪ���k Stub
		Graphics g=getGraphics();
		Button BTN = (Button)e.getSource();
		if(B1==BTN)
		{	color = Color.red;
			C =true;
			paint(g);
		}else if (B==BTN)
		{	color = Color.GREEN;
			C =true;
			paint(g);
		}else if(Clear ==BTN)
		{	C=false;
			g.clearRect(100,100,100,100); 
			g.drawRect(100,100,100,100);//�S�o��N�ܸ޲�  �M���Ѩ����`
		}
	}
	static C20_2 fr = new C20_2();
	static Button B = new Button("GREEN");
	static Button B1 = new Button ("RED");
	static Button Clear = new Button ("Clear");
	
	public static void main(String args[])
	{
		BorderLayout Br = new BorderLayout();
		fr.setSize(400,400);
		fr.setBackground(Color.white);
		fr.add(B1,Br.NORTH);
		fr.add(B,Br.SOUTH);
		B.addActionListener(fr);
		B1.addActionListener(fr);
		Clear.addActionListener(fr);
		fr.add(Clear,Br.WEST);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		
	}
	
	public void paint(Graphics g)
	{	g.setColor(Color.BLUE);//����ض¦� 
		g.drawRect(100,100,100,100);//�j�p�n
		if(C==true)
		{
			
			g.setColor(color);
			g.fillRect(100,100,100,100);//�@�P�~�i�H
			C = false;
		}
			
		
	}
}