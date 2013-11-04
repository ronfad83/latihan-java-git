public class Latihan01_CallByValue
{	
	public static void main(String[] args)
	{
		int x = 10;
		
		System.out.println(callByValue(x));
		System.out.println("Nilai x dalam Method Main : " + x);
		System.out.println(callByValue(x));
		changeX(x);
		System.out.println(callByValue(x));
		changeX(x);
		System.out.println("Nilai x dalam Method Main : " + x);
		changeX(x);
		System.out.println(callByValue(x));
	}
	
	public static int callByValue(int x)
	{
		x += 5;
		return x;
	}

	public static void changeX(int x)
	{
		x = 100;
		System.out.println("Nilai x dalam Method changeX : " + x);
	}
}