public class Main {
	public static void main(String[] args) 
	{
		BoissonEtendue coca = new BoissonEtendue ("Coca", 1.80, 0.21, 1);
		BoissonEtendue sprite = new BoissonEtendue ("Sprite", 1.80, 0.21, 1);
		BoissonEtendue binouze = new BoissonEtendue ("Bière", 2.00, 0.21, 1);
		TicketCaisse v = new TicketCaisse("Victor");
		v.ajouter(coca, 3);
		v.ajouter(coca, 7);
		v.ajouter(sprite, 1);
		v.ajouter(binouze, 4);
		v.ajouter(binouze, 7);
		v.afficherTicket();
		//System.out.println(v.head.next.boisson.getNom() + " " + +v.head.next.boisson.getQuantité() + "\n" + v.head.next.next.boisson.getNom() + " " + v.head.next.next.boisson.getQuantité() + "\n" + v.head.next.next.next.boisson.getNom() + " " + v.head.next.next.next.boisson.getQuantité() + "\n" + "Taille du ticket : " + v.taille);
	}
}