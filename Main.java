class Father
{
	public void car()
	{
		System.out.println("i have a ferrai");
	}
}
class Son extends Father
{
	public void car()
	{
		System.out.println("i have audi");
	}
	public void bike()
	{
		System.out.println("i have ola");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Son s = new Son();
		s.car();
		s.bike();
	}
}
