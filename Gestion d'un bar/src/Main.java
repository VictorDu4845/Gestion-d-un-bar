public class Main {
	public static void main(String[] args) 
	{
		BoissonEtendue coca = new BoissonEtendue ("Coca", 1, 0.00, 1);
		BoissonEtendue sprite = new BoissonEtendue ("Sprite", 1, 0.00, 1);
		BoissonEtendue binouze = new BoissonEtendue ("Bière", 2, 0.00, 10);
		System.out.println("On passe maintenant aux tickets de caisse" + "\n");
		TicketCaisse victor = new TicketCaisse();
		victor.ajouter(coca);
		victor.ajouter(binouze);
		victor.ajouter(sprite);
		victor.afficherTicket();
		victor.enleverDernierEncodage();
		victor.afficherTicket();
	}
}
