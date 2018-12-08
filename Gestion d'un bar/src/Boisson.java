public class Boisson
{
	
	private String nom;
	private double prix;
	private double tva;
	private int quantité;
	
	public Boisson(String nom, double prix, double tva, int quantité) 
	{
		this.nom = nom;
		this.prix = prix;
		this.tva = tva;
		this.quantité = quantité;
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
	
	public int getQuantité()
	{
		return quantité;
	}
	
	public double prixTotalTVAC() 
	{
		return quantité * prix * (1 + tva);
	}
	
	public String toString() 
	{
		return "Nom : " + nom + "\n" +  "Prix : " + prix + "€" + "\n" + "TVA : " + 100*tva + "%" + "\n" + "Quantité : " + quantité + "\n" + "Prix Total TVAC " + prixTotalTVAC() + "€" + "\n";
	}
}