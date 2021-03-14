import java.awt.*;
import java.awt.event.*;
//按按鈕使方塊變色
public class C20_2 extends Frame implements ActionListener
{	private Color color;
	private boolean C;
	//static Graphics g=getGraphics();  這樣不對
	//Graphics g=getGraphics();  這樣也不對
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動產生的方法 Stub
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
			g.drawRect(100,100,100,100);//沒這行就很詭異  清完剩兩個邊常
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
	{	g.setColor(Color.BLUE);//給邊框黑色 
		g.drawRect(100,100,100,100);//大小要
		if(C==true)
		{
			
			g.setColor(color);
			g.fillRect(100,100,100,100);//一致才可以
			C = false;
		}
			
		
	}
}