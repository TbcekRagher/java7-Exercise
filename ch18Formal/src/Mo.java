import java.awt.*;
import java.awt.event.*;
//顯示圖形按鍵按壓與否的顯示說明練習
public class Mo extends Frame implements MouseListener 
{	
	  
			public void mouseEntered(MouseEvent e)
	  		{
	  			T.setText("Enter");
	  		}
	  		public void mouseClicked(MouseEvent e)
	  		{
	  			T.setText("Click");
	  		}
	  		public void mouseExited(MouseEvent e)
	  		{
	  			T.setText("Exit");
	  		}
	  		public void mousePressed(MouseEvent e)
	  		{
	  			T.setText("Press");
	  		}
	  		public void mouseReleased(MouseEvent e)
	  		{
	  			T.setText("Release");
	  		}
	/*  static class ACt implements ActionListener
	  {
		  public void actionPerformed(ActionEvent e)
		{
		fr.setBackground(Color.red);
		}
	  }*/
	static Mo fr = new Mo();
	static Button B = new Button("Push me");
	static TextArea T = new TextArea("",2,5,TextArea.SCROLLBARS_NONE);
  public static void main(String args[])
  {	 //B.addActionListener(fr);
     //fr.setLayout(new FlowLayout(FlowLayout.LEFT));
	  BorderLayout Br = new BorderLayout(2,5);
  	 fr.setLayout(new BorderLayout(2,5));
	 fr.setBackground(Color.BLACK);
	 fr.setBounds(0,0,700,700);
	 fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}});
	 //Core
	 //B.addActionListener(fr);
	 B.addMouseListener(fr);
	 B.setBounds(100,100,100,100);
	 B.setBackground(Color.white);
	 B.setForeground(Color.BLACK);
	 T.setBackground(Color.white);
	 fr.add(T,Br.CENTER);
	 fr.add(B,Br.WEST);
	 fr.setVisible(true);
	 
  }
}