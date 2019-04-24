import java.io.*;
public class AreaRect {
	
	public static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in),1);
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		int length = getInt("length");
		int width  = getInt("width");
		
		int area   = findArea(length, width);
		
		displayArea(area);
		
		
	}

	public static int getInt(String prompt) throws IOException
	{
		//Prompt user for input
		System.out.print("Enter " + prompt + " -> ");
		
		//Get input from user and convert string to int
		int input = Integer.parseInt(keyboard.readLine());
		
		//Return user's input
		return input;
	}
	
	public static int findArea(int length, int width)
	{
		//Carry out calculation 
		int area = length * width;
		
		//Return result of calculation
		return area;
	}

	public static void displayArea(int area)
	{
		//Display the result
		System.out.println("The area is " + area);
	}
}

