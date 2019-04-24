import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialGUI extends Applet implements ActionListener
{
	Label 		nLB 	= new Label("n");
	TextField 	nTF 	= new TextField();
	
	Label 		nfactLB = new Label("n! = ");
	
	Button 		factBN 	= new Button("Find Factorial");
	
	public void init()
	{
		setLayout(null);
		
		add(nLB);
		nLB.setLocation(10, 10);
		nLB.setSize(80, 20);
		
		add(nTF);
		nTF.setLocation(10,30);
		nTF.setSize(80, 20);
		
		add(nfactLB);
		nfactLB.setLocation(10, 60);
		nfactLB.setSize(80, 20);
		
		add(factBN);
		factBN.setLocation(10, 90);
		factBN.setSize(80, 20);
		
		factBN.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		int n 		  = Integer.parseInt(nTF.getText());
		
		int factorial = factorial(n);
		
		nfactLB.setText("n! = " + factorial);
		
	}
	
	public static int factorial(int n)
	{
		if(n == 0)	return 1;
		else		return factorial(n-1) * n;
	}
}
