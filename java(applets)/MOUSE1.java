import java.awt.*;
import java.awt.event.*;
class MOUSE extends Frame implements MouseListener,MouseMotionListener

{
	public MOUSE()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("MOUSE DEMO");
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.red);
	}
  public void mouseDragged(MouseEvent e)
	{
		setBackground(Color.blue);
	}
  public void mousePressed(MouseEvent e)
	{
       setBackground(Color.magenta);
	}
 public void mouseMoved(MouseEvent e)
	{
		setBackground(Color.orange);
	}
public static void main(String [] args)
	{
		new MOUSE();
	}


}