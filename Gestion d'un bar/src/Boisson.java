public class Boisson
{
	
	public String nom;
	private double prixTVAC;
	private double tva;
	private int quantité;
	
	public Boisson(String nom, double prixTVAC, double tva, int quantité) 
	{
		this.nom = nom;
		this.prixTVAC = prixTVAC;
		this.tva = tva;
		this.quantité = quantité;
	}

	public String getNom() 
	{
		return nom;
	}
	
	public double getPrix() 
	{
		return prixTVAC;
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
		int a = (int) Math.round(100 * quantité * prixTVAC);
		return (double) a/100;
	}
	
	public String toString() 
	{
		return "Nom : " + nom + "\n" +  "Prix unitaire : " + getPrix() + "€" + "\n" + "TVA : " + 100*tva + "%" + "\n" + "Quantité : " + quantité + "\n" + "Prix Total TVAC " + getPrixTotalTVAC() + "€" + "\n" + "\n";
	}
}