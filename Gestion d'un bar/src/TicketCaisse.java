import java.util.EmptyStackException;

public class TicketCaisse
{
	public Node head;
	public Node tail;
	public Node next;
	public Node previous;
	public int taille;
	
	public TicketCaisse()
	{
		this.previous = null;
		this.next = null;
		this.taille = 0;
	}
	
	public class Node
	{
		public BoissonEtendue boisson;
		public Node next;
		public Node previous;
		public Node (BoissonEtendue boisson, Node next, Node previous)
		{
			this.boisson = boisson;
			this.next = next;
			this.previous = previous;
		}
	}
	
	public void ajouter(BoissonEtendue b)
	{
		Node n = new Node (b, next, previous);
		boolean premièreCommande = true;
		if (head == null)
		{
			head = tail = n;
			taille = taille +1;
			return;
		}
		for (Node test = head; test != null; test = test.next)
		{
			if ((String)b.getNom() == (String)test.boisson.getNom())
			{
				premièreCommande = false;
				test.boisson.setQuantité(test.boisson.getQuantité()+1);
			}
		}
		if (premièreCommande == true)
		{
	        tail.next = n;
	        tail = n;
			taille = taille +1;
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
			this.head = this.head.next;
			taille = taille -1;
		}
	}
	
	public void afficherTicket() throws EmptyStackException
	{
		Node courant = this.head;
		double montantTotal = 0;
		String ticket = "Impression du ticket" + "\n" + "\n";
		if (this.estVide())
		{
			throw new EmptyStackException();
		}
		else
		{
			while (courant != null)
				{
	             ticket = ticket + courant.boisson;
	             montantTotal = montantTotal + courant.boisson.prixTotalTVAC();
	             courant = courant.next;
				}
		}
		ticket = ticket + "Pour un montant total de : " + montantTotal + " €" + "\n" + "Impression terminée" + "\n";
		System.out.println(ticket);
	}
	
	public int taille()
	{
		return this.taille;
	}
	
	public boolean estVide()
	{
		return this.head==null;
	}
	
}