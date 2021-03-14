package ch21;

import java.applet.*;
import java.applet.Applet;
import java.awt.*;

class test1 extends Applet 
{
	public void paint(Graphics g) 
	{	
		g.setColor(Color.BLACK);
		g.drawString("Andrea is very beautiful.", 40, 60);
		g.drawString(getParameter("str1"),30,30);
		
	}
	public  void  init()
	{
		System.out.println("init");
	}
	public void  start()
	{
	System.out.println("start");	
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
}
