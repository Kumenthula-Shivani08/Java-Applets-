import java.awt.*;
import java.awt.event.*;
class Button5 extends Frame implements ActionListener
{ 
	Button b1,b2,b3,b4;
	public Button5()
	{ 
		FlowLayout f=new  FlowLayout();
		setLayout(f);
		b1=new Button("AIML");
        b2=new Button("JAVA");
        b3=new Button("DBMS");
		b4=new Button("CLOSE");
		add(b1);
		add(b2);
		add(b3);
	    add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setVisible(true);
		setSize(500,500);
		setTitle("BUTTON DEMO");

		
	} 
  public void actionPerformed(ActionEvent e) 
	{
	  String s=e.getActionCommand();
	  if(s.equals("AIML"))
	{
		  setBackground(Color.red);

	}
	else if(s.equals("JAVA"))
	{
		
     setBackground(Color.green);

	} 
  else if(s.equals("DBMS"))
	{
     setBackground(Color.yellow);
    
	}
	else if(s.equals("CLOSE"))
	{
		System.exit(0);
	}
}
  
  public static void main(String [] args)
  {
	  Button5 b=new Button5();
  }
  
}