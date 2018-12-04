public class Boisson
{
	
	private String nom;
	private double prix;
	private double tva;
	
	public Boisson(String nom, double prix, double tva) 
	{
		this.nom = nom;
		this.prix = prix;
		this.tva = tva;
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
	
	public double prixTVAC() 
	{
		return prix * (1 + tva);
	}
	
	public String toString() 
	{
		return "Nom : " + nom + " Prix : " + prix + "€ TVA : " + tva + "% Prix TVAC " + prixTVAC() + "€";
	}
}