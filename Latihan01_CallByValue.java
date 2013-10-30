public class Latihan01_CallByValue
{	
	public static void main(String[] args)
	{
		int x = 10;
		
		callByValue(x);
		System.out.println("Nilai x dalam Method Main : " + x);
		callByValue(x);
		callByValue(x);
		System.out.println("Nilai x dalam Method Main : " + x);
	}
	
	public static void callByValue(int x)
	{
		x = x + 1;
		System.out.println("Nilai x dalam Method callByValue : " + x);
	}
}
