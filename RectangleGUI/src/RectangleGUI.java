import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class RectangleGUI extends Applet implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
		
	}
	
	public void init()
	{
		setLayout(null);
		
		Label lengthLB = new Label("Length"); 		//Create Label Object		//
		add(lengthLB);								//Add it into the window	//
		lengthLB.setLocation(10, 10);				//Set its location			//
		lengthLB.setSize(80, 20);					//Set its size				//
		
		TextField lengthTF = new TextField();		//Create TextField			//
		add(lengthTF);								//Add it into the window	//
		lengthTF.setLocation(10, 30);				//Set its location			//
		lengthTF.setSize(80, 20);					//Set its size				//
	
		Label widthLB = new Label("Width"); 		//Create Label Object		//
		add(widthLB);								//Add it into the window	//
		widthLB.setLocation(10, 60);				//Set its location			//
		widthLB.setSize(80, 20);					//Set its size				//
	
		TextField widthTF = new TextField();		//Create TextField			//
		add(widthTF);								//Add it into the window	//
		widthTF.setLocation(10, 80);				//Set its location			//
		widthTF.setSize(80, 20);					//Set its size				//
	
		Label areaLB = new Label("Area: "); 		//Create Label Object		//
		add(areaLB);								//Add it into the window	//
		areaLB.setLocation(10, 110);				//Set its location			//
		areaLB.setSize(80, 20);						//Set its size				//
	
		Button areaBN = new Button("Find Area");	//Create Button				//
		add(areaBN);								//Add it into the window	//
		areaBN.setLocation(10, 140);				//Set its location			//
		areaBN.setSize(80, 20);						//Set its size				//
		
		areaBN.addActionListener(this);				//Connect ActionListener to button//
	
	
	}
}
