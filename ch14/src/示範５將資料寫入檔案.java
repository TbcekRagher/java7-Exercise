import java.io.*;
public class �ܽd���N��Ƽg�J�ɮ�
{//�z�L�{���X�N�Ϥ��ഫ��binary �����A�Ӷi��Ϥ��ƻs
	public static void main(String args[])throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\���F�ܽd5��.jpg");
		//FileOutputStream fi = new FileOutputStream("c:\\java\xxx.txt",true);//�q�ɮ׫᭱�[�r
		FileOutputStream ki = new FileOutputStream("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\my_p.bmp");
	System.out.println("GIF Byte: "+fi.available());
	byte app[] = new byte[fi.available()];
	fi.read(app);
	ki.write(app);
	fi.close();
	ki.close();
	}
}