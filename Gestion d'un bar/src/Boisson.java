public class Boisson
{
	
	public String nom;
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
	
	public void setQuantité(int quantité)
	{
		this.quantité = quantité;
	}
	
	public double getPrixTotalTVAC() 
	{
		int a = (int) Math.round(100 * quantité * prix);
		return (double) a/100;
	}
	
	public String toString() 
	{
		return "Nom : " + nom + "\n" +  "Prix unitaire : " + getPrix() + "€" + "\n" + "TVA : " + 100*tva + "%" + "\n" + "Quantité : " + quantité + "\n" + "Prix Total TVAC " + getPrixTotalTVAC() + "€" + "\n" + "\n";
	}
}