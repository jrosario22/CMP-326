import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SumGUI extends Applet implements ActionListener 
{
	TextField aTF = new TextField();
	TextField bTF = new TextField();
	TextField cTF = new TextField();
	Label sumLB   = new Label("Sum");
	
	public void actionPerformed(ActionEvent e)
	{
		float a 	= Float.parseFloat( aTF.getText() );
		float b 	= Float.parseFloat( bTF.getText() );
		float c 	= Float.parseFloat( cTF.getText() );
		
		double sum  = a + b + c;
		
		sumLB.setText("Sum: " + sum);
	}

	public void init()
	{
		setLayout(null);
		
		Label aLB = new Label("A");
		add(aLB);
		aLB.setLocation(10, 10);
		aLB.setSize(80, 20);
		
		add(aTF);
		aTF.setLocation(10, 30);
		aTF.setSize(80,  20);
		
		Label bLB = new Label("B");
		add(bLB);
		bLB.setLocation(10, 60);
		bLB.setSize(80, 20);
		
		add(bTF);
		bTF.setLocation(10, 80);
		bTF.setSize(80,  20);
		
		Label cLB = new Label("C");
		add(cLB);
		cLB.setLocation(10, 110);
		cLB.setSize(80, 20);
		
		add(cTF);
		cTF.setLocation(10, 130);
		cTF.setSize(80,  20);
		
		add(sumLB);
		sumLB.setLocation(10, 160);
		sumLB.setSize(80, 20);
		
		Button sumBN = new Button("Find Sum");
		add(sumBN);
		sumBN.setLocation(10, 180);
		sumBN.setSize(80, 20);
		
		sumBN.addActionListener(this);
	}
	
}
