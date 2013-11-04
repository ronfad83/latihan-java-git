import java.util.Scanner;

public class Latihan01_StaticVariabel02
{
	private static int count = 0;
	private String nama;
	private int umur;
	
	public Latihan01_StaticVariabel02(String nama, int umur)
	{
		this.nama = nama;
		this.umur = umur;
	}
	
	public void setNama(String nama)
	{
		this.nama = nama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void setUmur(int umur)
	{
		this.umur = umur;
	}
	
	public int getUmur()
	{
		return umur;
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
		System.out.print("Masukkan Nama : ");
		nama = input.nextLine();
		System.out.print("Masukkan Umur : ");
		umur = input.nextInt();
		
		Latihan01_StaticVariabel02 person = new Latihan01_StaticVariabel02(nama, umur);
		
		System.out.println(person);
		
		count++;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int jumPerson;
		
		System.out.print("Masukkan Jumlah Person yang ingin di Input : ");
		jumPerson = input.nextInt();
		
		for(int i=1;i<=jumPerson;i++)
		{
			System.out.println("\nPerson Ke " + i + " :");
			addPerson();
		}
		
		System.out.println("\nTotal Person : " + count);
		System.out.println();
	}
}
