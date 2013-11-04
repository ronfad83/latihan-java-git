public class Latihan01_NonStaticVariabel
{
	private int count = 10;

	public void increaseCount()
	{
		count += 2; 
	}

	public static void main(String[] args)
	{
		Latihan01_NonStaticVariabel test = new Latihan01_NonStaticVariabel();

		System.out.println(test.count);
		test.increaseCount();
		System.out.println(test.count);
		System.out.println(test.count);
		test.increaseCount();
		System.out.println(test.count);
		test.increaseCount();
		System.out.println(test.count);
	}
}