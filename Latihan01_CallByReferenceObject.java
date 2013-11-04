public class Latihan01_CallByReferenceObject
{
	int a, b;

	public Latihan01_CallByReferenceObject(int x, int y)	
	{
		a = x;
		b = y;
	}

	public void callByReferenceObject(Latihan01_CallByReferenceObject obj)
	{
		int x = obj.a;
		obj.a = obj.b;
		obj.b = x;
	}
}