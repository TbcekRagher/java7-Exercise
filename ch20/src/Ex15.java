import java.awt.event.*;
import java.awt.*;
public class Ex15 extends Frame implements ActionListener,MouseListener
{	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	static Ex15 fr = new Ex15();
	static Button B=  new Button("");
	public static void main(String args[])
	{
		fr.setLayout(null);
		fr.setBackground(Color.pink);
		fr.setSize(500,500);
		fr.addMouseListener(fr);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
	}
	private int x[] = {60,80,100,120,80,40};
	private int y[] = {40,80,120,100,80,60};
	 void paint()
	{	
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		g.drawPolygon(x,y,6);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		paint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
	}
}