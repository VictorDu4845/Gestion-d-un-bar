import com.victor.exceptions.*;

public class Main {
	public static void main(String[] args) 
	{
		BoissonEtendue coca = new BoissonEtendue ("Coca", 1.80, 0.21, 1);
		BoissonEtendue sprite = new BoissonEtendue ("Sprite", 1.80, 0.21, 1);
		BoissonEtendue biere = new BoissonEtendue ("Bière", 2.00, 0.21, 1);
		TicketCaisse v = new TicketCaisse("Victor");
		TicketCaisse y = new TicketCaisse("Victor");
		try
		{
			v.ajouter(coca, 1);
			v.ajouter(sprite, 2);
			v.ajouter(biere, 2);
			v.enlever(coca, 1);
			v.ajouter(coca, 2);
			v.ajouter(sprite, 2);
			v.ajouter(biere, 4);
			v.ajouter(biere, 7);
			v.enlever(coca, 1);
			v.enlever(coca, 1);
			v.enlever(biere, 4);
			v.enlever(biere, 9);
			v.enlever(sprite, 4);
		}
		catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println(v.head.nom);
	}
}