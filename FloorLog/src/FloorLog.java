import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FloorLog extends Applet implements ActionListener
{
	
	Label 		nLB 	= new Label("n");
	TextField 	nTF 	= new TextField ();
	
	Label 		flgLB 	= new Label("Floor lg = ");
	
	Button 		flgBN 	= new Button("Find Floor lg");
	
	public void init()
	{
		setLayout(null);
		
		add(nLB);
		nLB.setLocation(10, 10);
		nLB.setSize(80, 20);
		
		add(nTF);
		nTF.setLocation(10,30);
		nTF.setSize(80, 20);
		
		add(flgLB);
		flgLB.setLocation(10, 60);
		flgLB.setSize(80, 20);
		
		add(flgBN);
		flgBN.setLocation(10,90);
		flgBN.setSize(80, 20);
		
		flgBN.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n 	= Integer.parseInt( nTF.getText() );
		
		int flg = flg(n);
		
		flgLB.setText("Floor lg = " + flg);
	}
	
	public int flg(int n)
	{
		if(n == 1)	return 0;
		else		return flg(n/2) + 1; 
	}
	
}
