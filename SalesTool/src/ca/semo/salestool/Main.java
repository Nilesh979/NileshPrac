package ca.semo.salestool;

public class Main {

	public static void main(String[] args) 
	{
		SalesData data = new SalesData();
		DisplayGreetings();
		data.Display();

	}

	private static void DisplayGreetings()
	{
		System.out.println("Hello people");
		System.out.println("New change");
	}
}
