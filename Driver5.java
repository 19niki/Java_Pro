interface I1
{
}
interface I2
{
}
interface I extends I1,I2
{
}
class A implements I
{
}
class B extends A implements I
{
}
class  Driver5
{
	public static void main(String[] args) 
	{
		A obj = new A();
        B obj2 = new B();
		I obj3 = obj2;
		obj =(A)obj3;
		System.out.println(obj);
		System.out.println(obj2);
	}
}
