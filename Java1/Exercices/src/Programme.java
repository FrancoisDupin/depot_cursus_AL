import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		
		//Exercice1();
		//Exercice2();
		Exercice2Losange();
		
	}
	
	private static void Exercice1()
	{
		Scanner reader = new Scanner(System.in);
		double valeur;
		double max = 0;
		double som = 0;
		double n = 0;
		double min = 10000010;
		do
		{
			
			System.out.println("Entrez une valeur");
			String saisie = reader.nextLine();
			
			valeur = Double.parseDouble(saisie);
			
			if( valeur != 0 )
			{
				if(valeur <= min )
				{
					min = valeur;
				}
				if(valeur >= max )
				{
					max = valeur;
				}
				som += valeur;
				n++;
			}
			
		} while ( valeur != 0  );
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("moy = " + (som/n));
		reader.close();
	}
	
	private static void Exercice2()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez une longueur");
		String saisie = reader.nextLine();
		int l = Integer.parseInt(saisie);
		
		// Histoire de s'échauffer.
		String ligne = "";
		
		for( int i = 0; i < l-1; i++)
		{
			ligne +="*";
		}
		System.out.println(ligne);
		
		for(int i = l-2; i > 0; i-- )
		{
			ligne = "*";
			for (int j = 0;j < (i-2); j++)
			{
				ligne += '-';
			}
			if( i > 1 )
			{
				ligne += '*';
			}
			System.out.println(ligne);
		}
		reader.close();
	}
	
	private static void Exercice2Losange()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez une longueur");
		String saisie = reader.nextLine();	
		int l = Integer.parseInt(saisie);
		String ligne = "";
		int m = l/2;
		
		for( int i = 0; i <= l; i++ )
		{
			int ii;
			if(i>m)
			{
				ii = l - i;
			}
			else
			{
				ii = i;
			}
			ligne= "";
			for( int j = 0; j <= l; j++ )
			{
				int k = m - ii;
				int n = m + ii ;
				if( k > j  || n < j )
				{
					ligne += " "; 
				}
				else if(  k == j  || n == j  )
				{
					ligne += "*";
				}
				else
				{
					ligne += "-"; 
				}
			}
			System.out.println(ligne);
		}
		reader.close();
		
		//
		//System.out.print();
	}
		
		
		
}


