import java.awt.*;
import java.awt.event.*;
class MOUSE extends Frame implements MouseListener
{
	  public MOUSE()
	{

		  setVisible(true);
		  setSize(500,500);
		  setTitle("MOUSE DEMO");
		  addMouseListener(this);
	}
  public void mouseEntered(MouseEvent e)
	{
	  setBackground(Color.red);
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.yellow);
	}
	public void mousePressed(MouseEvent e)
	{
		setBackground(Color.magenta);
	}
	public void mouseClicked(MouseEvent e)
	{
	   setBackground(Color.cyan);
	}
	public void mouseReleased(MouseEvent e)
	{
		setBackground(Color.black);
	}
	public static void main(String [] args)
	{
		new MOUSE();
	}

}