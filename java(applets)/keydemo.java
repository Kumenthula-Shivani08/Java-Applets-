import java.awt.*;
import java.awt.event.*;
class KEYDEMO extends Frame implements KeyListener
{
	 public KEYDEMO()
	{
		 setVisible(true);
		 setSize(500,500);
		 setTitle("Key event demo");
		 addKeyListener(this);
	}
	public void keyReleased(KeyEvent e)
	{
		char ch=e.getKeyChar();
		if(ch=='q'||ch=='Q')
		{
			setBackground(Color.black);
		}
	}
	public void keyPressed(KeyEvent e)
	{
		char ch=e.getKeyChar();
		if(ch=='w'||ch=='W')
		{
			setBackground(Color.orange);
		}
			
	}
	public void KeyTyped(KeyEvent e)
	{
		char ch=e.getKeyChar();
		if(ch=='r'||ch=='R')
		{
			setBackground(Color.red);
		}
	
	else if(ch=='g'||ch=='G')
	{
		setBackground(Color.green);
	}
	else if(ch=='b'||ch=='B')
	{
		setBackground(Color.blue);
	}
}
public static void main(String [] args)
{
	new KEYDEMO();
}
}
	 
	 