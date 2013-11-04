import java.util.Scanner;

public class Latihan01_StaticVariabel01
{
	private static int count = 0;
	private String nama;
	private int umur;

	public Latihan01_StaticVariabel01(String nama, int umur)
	{
		this.nama = nama;
		this.umur = umur;
	}

	public String getNama()
	{
		return nama;
	}

	public void setNama(String nama)
	{
		this.nama = nama;
	}

	public int getUmur()
	{
		return umur;
	}

	public void setUmur(int umur)
	{
		this.umur = umur;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("Nama : %s", getNama()));
		sb.append(String.format("\nUmur : %d", getUmur()));

		return sb.toString();
	}

	public static void addPerson()
	{
		Scanner input = new Scanner(System.in);
		String nama;
		int umur;

		System.out.println();
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan Umur Anda : ");
		umur = input.nextInt();

		Latihan01_StaticVariabel01 newPerson = new Latihan01_StaticVariabel01(nama, umur);

		System.out.println(newPerson);
		
		count++;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int jumPerson;

		System.out.println();
		System.out.print("Enter the Number of Person : ");
		jumPerson = input.nextInt();

		for(int i=1;i<=jumPerson;i++)
		{
			System.out.println("\nData Person Ke " + i + " :");
			addPerson();	
		}

		System.out.println("\nTotal of Person : " + count);
		System.out.println();
	}
}
