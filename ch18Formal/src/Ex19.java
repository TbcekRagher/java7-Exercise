import java.awt.*;
import java.awt.event.*;
public class Ex19 extends Frame implements MouseListener
{	static Ex19 fr = new Ex19(); 
	static Label L = new Label("     ");

	public static void main(String args[])
	{
		fr.setBounds(100,100,300,300);
		fr.setBackground(Color.BLACK);
		fr.setLayout(null);
		L.addMouseListener(fr);
		L.setBounds(100,100,150,150);
		L.setFont(new Font("Arial",Font.BOLD+Font.PLAIN,15));
		L.setBackground(Color.pink); fr.add(L);
		fr.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		fr.setVisible(true);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		
		
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
		L.setText("Mouse Enter");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動產生的方法 Stub
		L.setText("Mouse Exited");
	}
}