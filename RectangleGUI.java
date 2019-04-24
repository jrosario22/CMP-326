import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RectangleGUI extends Applet implements ActionListener
{
	
	TextField lengthTF = new TextField();
	TextField widthTF  = new TextField();
	Label areaLB       = new Label("Area");
	
	public void actionPerformed(ActionEvent e)
	{
		
		float length = Float.parseFloat( lengthTF.getText() );
		float width  = Float.parseFloat(  widthTF.getText() );
		
		double area   = length * width;
		
		areaLB.setText("Area: " + area);
	}
	
	public void init()
	{
	
		setLayout(null);
		
		Label lengthLB = new Label("Length");
		add(lengthLB);
		lengthLB.setLocation(10, 10);
		lengthLB.setSize(80, 20);
		
		add(lengthTF);
		lengthTF.setLocation(10, 30);
		lengthTF.setSize(80,  20);
		
		Label widthLB = new Label("Width");
		add(widthLB);
		widthLB.setLocation(10, 60);
		widthLB.setSize(80, 20);
		
		add(widthTF);
		widthTF.setLocation(10, 80);
		widthTF.setSize(80,  20);
		
		add(areaLB);
		areaLB.setLocation(10, 110);
		areaLB.setSize(80, 20);
		
		Button areaBN = new Button("Find Area");
		add(areaBN);
		areaBN.setLocation(10, 140);
		areaBN.setSize(80, 20);
		
		areaBN.addActionListener(this);
		
		
	}
	
}
