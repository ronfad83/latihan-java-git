public class Latihan01_Operator
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = x++;
		
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		int a = 50;
		int b = ++a;
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		int z = 10;
		
		while(z<=20)
		{
			System.out.print(z + " ");
			z++;
		}
		System.out.println();
		
		int i = 10;
		
		while(i<=20)
		{
			System.out.print(i + " ");
			++i;
		}
		System.out.println();
	}
}
