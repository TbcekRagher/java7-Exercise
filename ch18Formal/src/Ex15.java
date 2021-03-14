import java.awt.*;
import java.awt.event.*;
public class Ex15 extends Frame implements KeyListener//,ActionListener
{ 	static Ex15 fr = new Ex15();
	static Label L = new Label("");
	static Label L1 = new Label("");
	static Label l = new Label("Seclect operator");
	static Button B = new Button("Next");
	static TextField T = new TextField(""); //for answer
	static private int a = (int)(Math.random()*100+1);
	static private int b = (int)(Math.random()*100+1);
	static CheckboxGroup grp = new CheckboxGroup();
	static Checkbox Postive = new Checkbox("+",false,grp);
	static Checkbox Negative = new Checkbox("-",false,grp);
	public static void main(String args[])
	{	fr.setLayout(new FlowLayout(FlowLayout.CENTER));
		fr.setBounds(200,200,220,250);
		fr.setBackground(Color.pink);
		//B.setBounds(500,250,50,30);
		B.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,13));
		//B.addActionListener(fr);
		//L.setBounds(300,300,150,50);
		L.setBackground(Color.BLACK);
		L.setSize(200,200);
		L.setText("                                ");
		L.setForeground(Color.white);
		L1.setBackground(Color.pink); L1.setText(Integer.toString(a)+"+"+Integer.toString(b)+"= "); L1.setForeground(Color.BLACK);
		fr.add(l);  fr.add(Postive); fr.add(Negative);  fr.add(L1);	  fr.add(T);	fr.add(B);  fr.add(L);		
		T.addKeyListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	/*@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if(B == btn)
		{
			L.setText("You are right");
		}
	}*/
	@Override
	public void keyPressed(KeyEvent e ) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent k) {
		// TODO 自動產生的方法 Stub
		
		
	}

	

	@Override
	public void keyReleased(KeyEvent k) {
		
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
		
	}

	
}