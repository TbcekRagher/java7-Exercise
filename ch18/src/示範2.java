import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class �ܽd2
{
	public static void main(String args[])
	{	Label  lab =  new Label("Wht do you mean");
		Frame f1 = new Frame("Hellow");
		
		f1.setLocation(600,400);//�H���W������ǦVx��600&�V -y��400 ���I�@�����������W��  set(0.0) ==screen(600,400);
		f1.setBackground(Color.pink);
		f1.setSize(600,600);
		f1.add(lab);
		f1.setVisible(true);
		//f1.setTitle("aswqdwq");
		f1.addWindowListener(new WindowAdapter() {public void windowClosing(WindowEvent e) {System.exit(0);}});
		System.out.println("���]�t�I(300,400)?"+f1.contains(300,400));
		//////0
		PopupMenu prop = new PopupMenu("abc");
		lab.add(prop);
		//////
		//lab.setBounds(280,280,100,200);
		lab.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		lab.setAlignment(Label.CENTER); //lab.Location(300,300) �Hset(0,0)�V+x��300�V-y��300
		//lab.setBackground(Color.black);
		lab.setForeground(Color.red);
		
		Font fnt = new Font ("Serief",Font.ITALIC+Font.BOLD,18);lab.setFont(fnt);
		////�]�w�̤p�ϥ���
	/*	URL url = getClass().getResource("a.gif"); 
		ImageIcon icon = new ImageIcon(url); 
		ImageIcon icon=new ImageIcon(getClass().getResource("/res/img.jpg"));
		Image beauty = new Image("C:\\Users\\YQQ\\Desktop\\��Ӥ���\\_20190529_121006.jpg");
		   */
	}
}