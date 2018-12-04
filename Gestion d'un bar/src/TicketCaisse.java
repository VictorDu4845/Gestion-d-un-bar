import org.w3c.dom.Node;

public class TicketCaisse  
{
	private Node front;
	private Node back;
	
	public TicketCaisse()
	{
		front = null;
		back = null;
	}
	
	private void ajouter(BoissonEtendue boisson)
	{
		Node b = new Node (boisson);
		if (front == null)
		{
			back = b;
		}
		else
		{
			front.previous = b;
			b.next = front;
		}
		front = b;
	}
	
	private void enlever(Node boisson) 
	{
		if (boisson.previous == null) 
			{
				back = boisson.previous;
			} 
		else 
			{
				boisson.previous.next = boisson.next;
			}
		if (boisson.next == null) 
			{
				front = boisson.next;
			} 
		else 
			{
			boisson.next.previous = boisson.previous;
			}

	}
	
	public double somme(Node boisson)
	{
		double somme = 0;
		Node courant = front;
		while (courant != null)
		{
			somme = somme + courant.getPrix();
		}
	}
	
	private class Node 
	{

		public Node next;
		public Node previous;
		public BoissonEtendue boisson;
		
		public Node (BoissonEtendue b) 
		{
			next = null;
			previous = null;
			boisson = b;
		}
	}
}