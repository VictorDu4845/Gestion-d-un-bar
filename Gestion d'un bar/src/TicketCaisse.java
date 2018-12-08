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
		boolean premi�reCommande = true;
		int quantit�;
		if (head == null)
		{
			head = n;
			taille = taille +1;
		}
		for (Node test = head; test != null; test = test.next)
		{
			if (b.getNom() == test.boisson.getNom())
			{
				quantit� = test.boisson.getQuantit�() + 1;
				test.boisson.setQuantit�(quantit�);
				premi�reCommande = false;
				break;
			}
			if (premi�reCommande == true)
			{
				head.previous = n;
				n.next = head;
				head = n;
			}
		}
	}
	public void enleverDernierEncodage() throws EmptyStackException
	{
		if (this.head == null)
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
		String ticket = "Impression du ticket" + "\n";
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
		ticket = ticket + "\n" + "Pour un montant total de : " + montantTotal + " �" + "\n" + "Impression termin�e" + "\n";
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