public class Main {
	public static void main(String[] args) 
	{
		BoissonEtendue coca = new BoissonEtendue ("Coca", 1, 0.00, 1);
		BoissonEtendue sprite = new BoissonEtendue ("Sprite", 1, 0.00, 1);
		BoissonEtendue binouze = new BoissonEtendue ("Bière", 2, 0.00, 10);
		System.out.println("On passe maintenant aux tickets de caisse");
		TicketCaisse x = new TicketCaisse();
		x.ajouter(coca);
		x.ajouter(binouze);
		x.ajouter(sprite);
		x.afficherTicket();
		x.enleverDernierEncodage();
		x.afficherTicket();
		
		;
	}
}
