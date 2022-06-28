/*
 Achiving the multiple inheritance with the help of Interface
*/
interface A
{
}
class B implements A
{
}
class C implements A
{
}
class  Driver4
{
	public static void main(String[] args) 
	{
		C obj = new C();
        B obj2= new B();
		A obj3 = obj2;
		obj = (C)obj3;			 

		
	}
}
