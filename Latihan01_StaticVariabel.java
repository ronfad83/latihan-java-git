public class Latihan01_StaticVariabel
{
	private static int count = 10;

	public static void increaseCount()
	{
		count += 2; 
	}

	public static void main(String[] args)
	{
		System.out.println(count);
		increaseCount();
		System.out.println(count);
		System.out.println(count);
		increaseCount();
		System.out.println(count);
		increaseCount();
		System.out.println(count);
	}
}