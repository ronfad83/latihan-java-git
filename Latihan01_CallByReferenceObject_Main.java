public class Latihan01_CallByReferenceObject_Main
{
	public static void main(String[] args)
	{
		Latihan01_CallByReferenceObject newObject = new Latihan01_CallByReferenceObject(10, 20);

		System.out.println("Sebelum dirubah : " + newObject.a + "  " + newObject.b);

		newObject.callByReferenceObject(newObject);

		System.out.println("Setelah dirubah : " + newObject.a + "  " + newObject.b);
	}
}