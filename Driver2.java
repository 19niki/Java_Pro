/*
We cannot make the static method as abstract
*/

abstract class Check2
{
	abstract static void run();

	
}

class Driver2 extends Check2
{ 
	static void run()
	{
		System.out.println("Running");
	}

	public static void main(String[] args)
	{
		Driver2.run();
	}
}
