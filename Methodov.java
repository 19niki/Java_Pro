class Methodov 
{
	public void add(int a , int b)
	{
		System.out.println(a + b);
	}
	public void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}
	public static void main(String[] args) 
	{
	    Methodov a = new Methodov();
		a.add(45,55);
		a.add(56,64,78);
	}
}
