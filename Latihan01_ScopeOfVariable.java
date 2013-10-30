public class Latihan01_ScopeOfVariable
{
	private int x = 10;
	
	public void beginMethod()
	{
		int x = 20;
		
		System.out.println("Nilai x awal di beginMethod : " + x + "\n");
		
		localMethodVariabel();
		classVariabel();
		localMethodVariabel();
		classVariabel();
		
		System.out.println("Nilai x awal di beginMethod menjadi : " + x + "\n");
	}
	
	public void localMethodVariabel()
	{
		int x = 15;
		
		System.out.println("Nilai x awal di localMethodVariabel : " + x + "\n");
		++x;
		System.out.println("Nilai x di localMethodVariabel menjadi : " + x + "\n");
	}
	
	public void classVariabel()
	{
		System.out.println("Nilai x awal di classVariabel : " + x + "\n");
		x *= 10;
		System.out.println("Nilai x di classVariabel menjadi : " + x + "\n");
	}
	
	public static void main(String[] args)
	{
		Latihan01_ScopeOfVariable scopeVariabel = new Latihan01_ScopeOfVariable();
		scopeVariabel.beginMethod();
	}
}
