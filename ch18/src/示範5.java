import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class 示範5
{
	public static void main(String args[])
	{
		Frame fr = new Frame("Java");
		GridLayout grid = new GridLayout(3,5);
		fr.setBackground(Color.pink);
		fr.setLocation(400, 400);
		fr.setSize(600,600);
		fr.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e) {System.exit(0);}} );
		FlowLayout flow = new FlowLayout(FlowLayout.CENTER,5,10);
		fr.setLayout(flow);//設定版面為流動式
		fr.add(new TextField("ASDS",7));
		fr.add(new TextField("CDDA",8));
		fr.add(new TextField("CASD",16));
		fr.setLayout(grid);
		for(int i = 0;i<15;i++)fr.add(new Button(Integer.toString(i)));
		fr.setVisible(true);
	}
}