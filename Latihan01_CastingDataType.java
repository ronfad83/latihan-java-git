public class Latihan01_CastingDataType
{
	public static void main(String[] args)
	{
		short a,b,c;
		a = 10;
		b = 50;
		// c = a + b --> akan terjadi error, karena c berubah tipe data nya menjadi int, maka perlu di cast menjadi seperti di bawah
		c = (short)(a + b); //casting data type
		System.out.println(c);

		double pi = 3.14159;
		float f = 3.15F; // tipe date float harus menggunakan f/F dibelakang nya, klo tidak akan terjadi error
		System.out.println(pi);
		System.out.println(f);
		short n = 15;
		short m = 4;
		f = n / m;
		System.out.println(f);

		int y = 100;
		System.out.println(y);
		float x = y;
		System.out.println(x);
	}
}