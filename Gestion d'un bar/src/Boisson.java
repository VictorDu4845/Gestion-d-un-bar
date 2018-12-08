public class Boisson
{
	
	private String nom;
	private double prix;
	private double tva;
	private int quantit�;
	
	public Boisson(String nom, double prix, double tva, int quantit�) 
	{
		this.nom = nom;
		this.prix = prix;
		this.tva = tva;
		this.quantit� = quantit�;
	}

	public String getNom() 
	{
		return nom;
	}
	
	public double getPrix() 
	{
		return prix;
	}
	
	public double getTva() 
	{
		return tva;
	}
	
	public int getQuantit�()
	{
		return quantit�;
	}
	
	public double prixTotalTVAC() 
	{
		return quantit� * prix * (1 + tva);
	}
	
	public String toString() 
	{
		return "Nom : " + nom + "\n" +  "Prix : " + prix + "�" + "\n" + "TVA : " + 100*tva + "%" + "\n" + "Quantit� : " + quantit� + "\n" + "Prix Total TVAC " + prixTotalTVAC() + "�" + "\n";
	}
}