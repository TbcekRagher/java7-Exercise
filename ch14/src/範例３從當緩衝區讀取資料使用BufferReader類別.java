import java.io.*;

public class �d�Ң��q��w�İ�Ū����ƨϥ�BufferReader���O
{
	public static void main(String args[])throws IOException
	{
		String over ;
		int count =0;
		FileReader HIBB = new FileReader("C:\\Users\\YQQ\\Desktop\\java__jdk\\ch14\\�ܽd3���ɮ�.txt");
		BufferedReader fr = new BufferedReader(HIBB);
		//BufferedReader fr = new BufferedReader(HIBB,int size); int size���������]�߽w�İϡ]BUFFER)���j�p
		//*�bbufferedReader�����禡�@readLine()��Ѫ�fgets()�������O�@��Ū���@��
		//readLine()�|�bŪ���Ҧ��ɮת���ƫ�^�Ǣ�������
		while((over = fr.readLine())!=null) //java �����������O���p�g
		{
			//System.out.println(fr.readLine());//�o�˼g�|�b�@��while�̭�Ū�����
			System.out.println(over);
			count++; 
		}
		System.out.println(count+" line");
		fr.close();
	}
}