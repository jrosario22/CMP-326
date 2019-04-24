import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class CircleGUI extends Applet implements ActionListener 
{
	TextField radiusTF = new TextField();
	
	Label areaLB       = new Label("Area: ");
	
	public void actionPerformed(ActionEvent e)
	{
		float radius = Float.parseFloat( radiusTF.getText() );
		
		double area  = (Math.PI) * radius * radius;
		
		areaLB.setText("Area: " + area);	
	}
	
	public void init()
	{
		
		setLayout(null);
		
		Label radiusLB = new Label("Radius");
		add(radiusLB);
		radiusLB.setLocation(10, 10);
		radiusLB.setSize(80, 20);
		
		add(radiusTF);
		radiusTF.setLocation(10, 30);
		radiusTF.setSize(80, 20);
		
		add(areaLB);
		areaLB.setLocation(10, 60);
		areaLB.setSize(80, 20);
		
		Button areaBN = new Button("Find Area");
		add(areaBN);
		areaBN.setLocation(10, 90);
		areaBN.setSize(80, 20);
		
		areaBN.addActionListener(this);
			
	}
}
