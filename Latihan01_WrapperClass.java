public class Latihan01_WrapperClass
{
	public static void main(String[] args)
	{
		Integer i = new Integer(100);
		System.out.println(i);
		float i1 = i.floatValue();
		System.out.println(i1);
		Integer i2 = Integer.valueOf(i);
		System.out.println(i2);

		String s = i.toString(); // convert i menjadi tipedata string
		System.out.println(s);

		Integer i3 = Integer.parseInt(s); // convert i menjadi tipedata integer
		System.out.println(i3);

		float d = i;
		System.out.println(d);

		int c = 200;
		System.out.println(c);
		float e = c;
		System.out.println(e);
	}
}