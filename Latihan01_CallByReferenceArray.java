public class Latihan01_CallByReferenceArray
{
	public static void modifyArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			array[i] *= 2;
		}
	}

	public static void main(String[] args)
	{
		int[] array = {1, 2, 3, 4, 5, 6};

		System.out.println("Nilai awal dari array : ");
		System.out.println();

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("Nilai array setelah method modifyArray : ");
		System.out.println();
		modifyArray(array);

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println("Nilai awal dari array menjadi : ");
		System.out.println();

		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}