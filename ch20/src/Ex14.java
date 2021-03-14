import java.awt.*;
import java.awt.event.*;

public class Ex14 extends Frame implements MouseListener,MouseMotionListener,ItemListener,ActionListener
{	//Graphics GO = getGraphics();¨S¥Î
	private int x1,x2,y1,y2;
	@Override
	public void mouseDragged(MouseEvent e) {
		
		x2 = e.getX();
		y2 = e.getY();
		paint();
		x1 = x2;
		y1 = y2;
	}
	@Override
	public void mouseMoved(MouseEvent e) {	
	}
	@Override
	public void mouseClicked(MouseEvent e) {		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
			
			
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
		
	static Ex14 fr = new Ex14();
	static Choice C = new Choice();
	static Button BC = new Button("Clear");
	public static void main(String args[])
	{
		fr.setSize(500,500);
		fr.setLayout(null);
		fr.addMouseListener(fr);
		fr.addMouseMotionListener(fr);
		C.add("Red"); C.add("Blue"); C.add("Green"); C.add("Black");  C.add("Pink");
		C.setBounds(50,50,70,30); 	fr.add(C);C.addItemListener(fr);
		BC.setBounds(190,50,70,30); fr.add(BC);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	Color	 CO;
	@Override
	public void itemStateChanged(ItemEvent e) {
		String color = C.getSelectedItem();
		
		if(color == "Red")
		{	CO =Color.red;
			
		}else if(color == "Blue")
		{
			CO =Color.BLUE;
		}else if(color == "Green")
		{
			CO =Color.GREEN;
		}else if(color == "Black")
		{
			CO =Color.BLACK;
		}else if(color == "Pink")
		{
			CO =Color.pink;
		}
		paint();
	}
	public  void paint()
	{	Graphics g = getGraphics();
		 g.setColor(CO);
		 g.drawLine(x1, y1, x2, y2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (BC == (Button)e.getSource())
		{	Graphics g = getGraphics();
		
			
		}
		
	}
}