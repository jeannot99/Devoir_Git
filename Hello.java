public class Hello
{
		public static void addition (long gauche, long droite)
		{
		gauche = gauche + droite;
		}
		
		public static void addition(long[] gauche, long [] droite)
		{
		gauche[0] = gauche[0] + droite[0];
		}
		
	public static void main (String [] args)
	{

		
		long kilo[1] = {12};
		long hecto[1] = {7};
		
		long metre = 1;
		long yard = 1;
		
		
		System.out.println("hello world");
		System.out.println("metre ="+metre+", yard ="+yard);
		
		addition (metre,yard);
		System.out.println("metre ="+metre+", yard ="+yard);
		
	System.out.println("Kilo ="+kilo[0]+", Hecto ="+hecto[0]);

	}

}
