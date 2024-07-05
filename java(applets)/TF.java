import java.awt.*;
import java.awt.event.*;
class TF extends Frame implements ActionListener
{
	TextField t1,t2,t3;
	GridLayout g;
	Label l1,l2,l3;
	public TF()
	{
		g=new GridLayout(3,3,5,5);
		setLayout(g);
		t1=new TextField(15);
		t2=new TextField(15);
		t3=new TextField(15);
		t1.setBackground(Color.cyan);
		t2.addActionListener(this);
		t2.setEchoChar('*');
		t3.setEditable(false);
       l1=new Label("Enter Username");
	   add(l1);
	   add(t1);
	   l2=new Label("Enter Password");
	   add(l2);
	   add(t2);
	   l3=new Label("Result");
	   add(l3);
	   add(t3);
	   setVisible(true);
	   setSize(500,500);
	   setTitle("username Validation");
	}
 public  void actionPerformed(ActionEvent e)
	{
	 String s1=t1.getText();
	 String s2=t2.getText();
	 if(s1.equals("AIML")&&(s2.equals("JAVA")))
		{
		 t3.setText("Valid");
		}
		else
		{
			t3.setText("Invalid");
		}
	}
	public static void main(String [] args)
	{
		new TF();
	}
}