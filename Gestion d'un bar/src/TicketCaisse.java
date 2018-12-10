import java.util.EmptyStackException;

public class TicketCaisse
{
	public Node head;
	public Node tail;
	public Node next;
	public Node previous;
	public int taille;
	
	public TicketCaisse(String nomDuClient)
	{
		this.previous = null;
		NomDuClient x = new NomDuClient(nomDuClient);
		Node a =  new Node (x, next);
		x.setNom(nomDuClient);
		this.head = tail =  a;
		this.taille = 0;
	}
	
	public class Node
	{
		public NomDuClient nom;
		public BoissonEtendue boisson;
		public Node next;
		public Node previous;
		public Node (BoissonEtendue boisson, Node next, Node previous)
		{
			this.boisson = boisson;
			this.next = next;
			this.previous = previous;
		}
		public Node (NomDuClient nom, Node next)
		{
			this.nom = nom;
			this.next = next;
		}
	}
	
	public void ajouter(BoissonEtendue b, int x)
	{
		Node n = new Node (b, next, previous);
		boolean premièreCommande = true;
		for (Node test = head.next; test != null; test = test.next)
		{
			if ((String)b.getNom() == (String)test.boisson.getNom())
			{
				premièreCommande = false;
				test.boisson.setQuantité(test.boisson.getQuantité() + x);
			}
		}
		if (premièreCommande == true)
		{
	        tail.next = n;
	        tail = n;
			taille = taille +1;
			n.boisson.setQuantité(x);
		}
	}
	public void enleverDernierEncodage() throws EmptyStackException
	{
		if (this.estVide())
		{
			throw new EmptyStackException();
		}
		else
		{
			this.tail = this.tail.previous;
			taille = taille -1;
		}
	}
	
	public void afficherTicket() throws EmptyStackException
	{
		Node courant = this.head.next;
		double montantTotal = 0;
		String ticket = "Impression du ticket" + "\n" + "\n" + "Client : " + this.head.nom.getNom() + "\n" + "\n";
		if (this.estVide())
		{
			throw new EmptyStackException();
		}
		else
		{
			while (courant != null)
				{
	             ticket = ticket + courant.boisson;
	             montantTotal = montantTotal + courant.boisson.getPrixTotalTVAC();
	             courant = courant.next;
				}
		}
		ticket = ticket + "Vous avez " + taille + " consommations" + "\n" + "Pour un montant total de : " + (double)Math.round(montantTotal*100)/100 + " €" + "\n" + "\n" + "Impression terminée" + "\n";
		System.out.println(ticket);
	}
	
	public int taille()
	{
		return this.taille;
	}
	
	public boolean estVide()
	{
		return this.head.next == null;
	}
	
}