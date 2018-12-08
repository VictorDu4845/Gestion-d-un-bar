public class Main {
	public static void main(String[] args) 
	{
		BoissonEtendue coca = new BoissonEtendue ("Coca", 1, 0.00, 1);
		BoissonEtendue sprite = new BoissonEtendue ("Sprite", 1, 0.00, 1);
		BoissonEtendue binouze = new BoissonEtendue ("Bière", 2, 0.00, 1);
		System.out.println("On passe maintenant aux tickets de caisse" + "\n");
		TicketCaisse victor = new TicketCaisse();
		victor.ajouter(coca);
		victor.ajouter(coca);
		victor.ajouter(coca);
		victor.ajouter(sprite);
		victor.afficherTicket();
		System.out.println(victor.head.boisson.getNom()+victor.head.boisson.getQuantité());
		System.out.println(victor.head.next.boisson.getNom()+victor.head.next.boisson.getQuantité());
	}
}
