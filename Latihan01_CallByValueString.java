public class Latihan01_CallByValueString
{
	public static void ubahNama(String nama)
	{
		nama = "Ferdy";
		System.out.println("Nama dalam Method ubahNama : " + nama);
	}
	
	public static void main(String[] args)
	{
		String nama = "Ronald";
		System.out.println("Nama dalam Method main awal : " + nama);
		ubahNama(nama);
		System.out.println("Nama dalam Method main menjadi : " + nama);
		ubahNama(nama);
		System.out.println("Nama dalam Method main menjadi : " + nama);
	}
}
