public class Boisson
{
	
	public String nom;
	private double prixTVAC;
	private double tva;
	private int quantit�;
	
	public Boisson(String nom, double prixTVAC, double tva, int quantit�) 
	{
		this.nom = nom;
		this.prixTVAC = prixTVAC;
		this.tva = tva;
		this.quantit� = quantit�;
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
	
	public int getQuantit�()
	{
		return quantit�;
	}
	
	public void setQuantit�(int quantit�)
	{
		this.quantit� = quantit�;
	}
	
	public double getPrixTotalTVAC() 
	{
		int a = (int) Math.round(100 * quantit� * prixTVAC);
		return (double) a/100;
	}
	
	public String toString() 
	{
		return "Nom : " + nom + "\n" +  "Prix unitaire : " + getPrix() + "�" + "\n" + "TVA : " + 100*tva + "%" + "\n" + "Quantit� : " + quantit� + "\n" + "Prix Total TVAC " + getPrixTotalTVAC() + "�" + "\n" + "\n";
	}
}