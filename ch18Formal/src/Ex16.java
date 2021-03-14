import java.awt.*;
import java.awt.event.*;
public class Ex16 extends Frame implements KeyListener,ItemListener//,ActionListener
{ 	static Ex16 fr = new Ex16();
static CheckboxGroup grp = new CheckboxGroup();
	static Checkbox Postive = new Checkbox("+",false,grp);
	static Checkbox Negative = new Checkbox("-",false,grp);
	static FlowLayout Flow = new FlowLayout();
	static Label L1 = new Label("              ");
	static Label l = new Label("Seclect operator");//small l
	static Button B = new Button("Next");
	static TextField T = new TextField(""); //for answer
	static private int a = (int)(Math.random()*100+1);
	static private int b = (int)(Math.random()*100+1);
	static Label L = new Label("    ");
	public static void main(String args[])
	{	
		fr.setLayout(new FlowLayout());
		fr.setBounds(200,200,200,200);
		fr.setBackground(Color.pink);
		l.setBackground(Color.BLACK); l.setForeground(Color.white);
		Postive.addItemListener(fr);
		Negative.addItemListener(fr);
		fr.add(Negative,Flow.LEFT);fr.add(Postive,Flow.LEFT); fr.add(l,Flow.LEFT); //先add進去且用Flow.LEFT會一職網最左邊做
		fr.add(L1);
		//減法有問題
		B.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,13)); fr.add(T); T.addKeyListener(fr);
		fr.add(B); 
		
		L.setBackground(Color.BLACK);
		L.setSize(200,200);
		L.setText("                                ");
		L.setForeground(Color.white);
		//
		T.addKeyListener(fr);
		fr.add(L);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
			if(Postive.getState()==true)
			{
				L1.setBackground(Color.pink); 
				L1.setText(Integer.toString(a)+" + "+Integer.toString(b)+"= "); 
				L1.setForeground(Color.BLACK);
			}else if(Negative.getState()==true)
			{	
				L1.setBackground(Color.pink); 
				L1.setText(Integer.toString(a)+"  -"+Integer.toString(b)+"= "); 
				L1.setForeground(Color.BLACK);
			}
			
	}
	@Override
	public void keyPressed(KeyEvent e ) {
		
		
	}
	@Override
	public void keyTyped(KeyEvent k) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void keyReleased(KeyEvent k) {
		if(Postive.getState()==true)
		{
			if(Integer.parseInt(T.getText()) == a+b)
			{	//T.getText();
				//System.out.println(T.getText());
				L.setText("You are right");
				L.setForeground(Color.white);
			}	else
			{
				L.setText("Try it again");
				L.setForeground(Color.white);
			}
		}else if(Negative.getState()==true)
		{
			if(Integer.parseInt(T.getText())==a-b)
			{
				L.setText("Try it again");
				L.setForeground(Color.white);
			}else 
			{
				L.setText("Try it again");
				L.setForeground(Color.white);
			}
		}
		
	}


	
}