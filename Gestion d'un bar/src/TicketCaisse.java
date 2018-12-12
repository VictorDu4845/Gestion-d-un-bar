import com.victor.exceptions.*;

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
	
	public void ajouter(BoissonEtendue b, int x) throws QuantiteNegativeException, ListeVideException, BoissonInvalideException
	{
		if (x < 0)
		{
			throw new QuantiteNegativeException ("La quantité de boissons que vous voulez ajouter est négative");
		}
		Node n = new Node (b, next, previous);
		boolean premièreCommande = true;
		for (Node test = head.next; test != null; test = test.next)
		{
			if ((String)b.getNom() == (String)test.boisson.getNom())
			{
				if (test.boisson.getQuantité() == 0)
				{
					taille = taille + 1;
				}
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
		this.afficherTicket();
	}
	
	public void enlever(BoissonEtendue b, int x) throws BoissonInvalideException, QuantiteNegativeException, ListeVideException
	{
		boolean dejaEncode = false;
		Node test = this.head.next;
		if (test.next != null)
		{
			while (test != null)
			{
				if (test.boisson.getNom().toString().equals(b.getNom()))
				{
					dejaEncode = true;
					test.boisson.setQuantité(test.boisson.getQuantité() - x);
					if (test.boisson.getQuantité() == 0)
					{
						taille = taille -1;
						if (test.next == null)
						{
							test = null;
						}
						else
						{
							previous = test;
							previous.next = test.next;
						}
						break;
					}
					else if (test.boisson.getQuantité() < 0)
					{
						throw new QuantiteNegativeException ("Vous essayez d'enlever plus de boissons qu'il n'y en a sur le ticket");
					}
				}
				test = test.next;
			}
		}
		else if (test.next == null)
		{
			if (b.getNom().toString().equals((String)test.boisson.getNom()))
			{
				dejaEncode = true;
				test.boisson.setQuantité(test.boisson.getQuantité() - x);
				if (test.boisson.getQuantité() == 0)
				{
					taille = taille -1;
					if (test.next == null)
					{
						head.next = null;
					}
					else
					{
						test = test.next;
					}
				}
				else if (test.boisson.getQuantité() < 0)
				{
					throw new QuantiteNegativeException ("Vous essayez d'enlever plus de boissons qu'il n'y en a sur le ticket");
				}
			}
		}
		if (dejaEncode == false) 
		{
			throw new BoissonInvalideException ("La boisson que vous essayez d'enlever n'existe pas sur le ticket");
		}
		this.afficherTicket();
	}
	
	public void afficherTicket() throws ListeVideException
	{
		Node courant = this.head.next;
		double montantTotal = 0;
		String ticket = "Impression du ticket" + "\n" + "\n" + "Client : " + this.head.nom.getNom() + "\n" + "\n";
		if (this.estVide())
		{
			System.out.println(ticket + "\n" + "Nom : ... \nPrix unitaire : 0€ \nTVA : 0% \nQuantité : 0 \nPrix Total TVAC : 0€ \n\n" + "Vous avez " + taille + " consommations" + "\n" + "Pour un montant total de : 0.00 €" + "\n" + "\n" + "Impression terminée" + "\n" + "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_" + "\n");
			throw new ListeVideException ("Le ticket est vide, veuillez en recréer un si vous désirez ajouter des consommations à un client");
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
		ticket = ticket + "Vous avez " + taille + " consommation(s) différente(s)" + "\n" + "Pour un montant total de : " + (double)Math.round(montantTotal*100)/100 + " €" + "\n" + "\n" + "Impression terminée" + "\n" + "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_" + "\n";
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