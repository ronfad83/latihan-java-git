public class Latihan01_CallByReference02
{
	public static void main(String[] args)
	{
		int[] array = {2, 4, 6, 8, 9};

		System.out.println("Nilai Array awal adalah : ");
		System.out.println();

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");

		modifyArray(array);
		System.out.println("Nilai Array setelah method modifyArray dipanggil : ");
		System.out.println();

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");

		System.out.println("Nilai Array awal adalah : ");
		System.out.println();

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	public static void modifyArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i] *= 2;
		}
	}
}