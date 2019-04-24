import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MultiButton extends Applet //implements ActionListener 
{
	Label 		lengthLB = new Label("Length");
	TextField 	lengthTF = new TextField();
	
	Label		 widthLB = new Label("Width");
	TextField	 widthTF = new TextField();
	
	Label 		resultLB = new Label();
	
	Button		 areaBN	 = new Button("Find Area");
	Button		 perimBN = new Button("Find Perimeter");
	
	public void init()
	{
		setLayout(null);
		
		add(lengthLB);
		lengthLB.setLocation(10, 10);
		lengthLB.setSize(80, 20);
		
		add(lengthTF);
		lengthTF.setLocation(10, 30);
		lengthTF.setSize(80, 20);
		
		add(widthLB);
		widthLB.setLocation(10, 60);
		widthLB.setSize(80, 20);
		
		add(widthTF);
		widthTF.setLocation(10, 80);
		widthTF.setSize(80, 20);
		
		add(resultLB);
		resultLB.setLocation(10, 110);
		resultLB.setSize(100, 20);
		
		add(areaBN);
		areaBN.setLocation(10, 130);
		areaBN.setSize(100, 20);
		areaBN.addActionListener(new AreaListener());
		
		add(perimBN);
		perimBN.setLocation(10, 152);
		perimBN.setSize(100, 20);
		perimBN.addActionListener(new PerimListener());
		
		
	}
	
	/*public void actionPerformed(ActionEvent e)
	{
		int length	= Integer.parseInt(lengthTF.getText());
		int width	= Integer.parseInt(widthTF.getText());
		
		if(e.getActionCommand().equals("Find Area"))
		{
			int area	= length * width;
		
			resultLB.setText("Area = " + area);
		
		}
		
		else
		{
			int perim	= (length * 2) + (width * 2);
			
			resultLB.setText("Perimeter = " + perim);
			
		}
	}
	*/
	
	public class AreaListener implements ActionListener
	{
	
		public void actionPerformed(ActionEvent e)
		{
			int length	= Integer.parseInt(lengthTF.getText());
			int width	= Integer.parseInt(widthTF.getText());
		
			int area	= length * width;
		
			resultLB.setText("Area = " + area);
		
		}
		
	}	
		
	public class PerimListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int length	= Integer.parseInt(lengthTF.getText());
			int width	= Integer.parseInt(widthTF.getText());
			
			int perim	= (length * 2) + (width * 2);
				
			resultLB.setText("Perimeter = " + perim);
				
			}
	}
}
