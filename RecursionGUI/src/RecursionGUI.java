import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RecursionGUI extends Applet implements ActionListener
{
	Label xLB 		= new Label("X");
	Label yLB 		= new Label("Y");
	
	TextField xTF 	= new TextField();
	TextField yTF 	= new TextField();
	
	Label sumLB   	= new Label("X + Y = ");
	
	Button sumBN 	= new Button("Add");
	
	public void init()
	{
		setLayout(null);
		
		add(xLB);
		xLB.setLocation(10, 10);
		xLB.setSize(80, 20);
		
		add(xTF);
		xTF.setLocation(10, 30);
		xTF.setSize(80,  20);
		
		add(yLB);
		yLB.setLocation(10, 60);
		yLB.setSize(80, 20);
		
		add(yTF);
		yTF.setLocation(10, 80);
		yTF.setSize(80,  20);
		
		add(sumLB);
		sumLB.setLocation(10, 110);
		sumLB.setSize(80, 20);
		
		add(sumBN);
		sumBN.setLocation(10, 140);
		sumBN.setSize(80, 20);
		
		sumBN.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int x	 = Integer.parseInt( xTF.getText() );
		int y 	 = Integer.parseInt( yTF.getText() );
		
		int sum  = add(x, y);
		
		int mult = mult(x, y); 
		
		sumLB.setText("X + Y =  " + sum);
	}
	
	public int mult(int x, int y)
	{
		if(x == 0)	return 0;
		else		return mult(x-1, y) + y;
	}
	
	public int add(int x, int y)
	{
		if(x == 0)	return y;
		else		return add(x-1, y) + 1;
	}
	
}
