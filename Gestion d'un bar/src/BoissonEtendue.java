public class BoissonEtendue extends Boisson
{
	private boolean enregistrable;
	private static final double PRIX_MINIMUM = 0.01;
	
	public BoissonEtendue(String nom, double prix, double tva) 
	{
		super(nom, prix, tva);
		enregistrable = PRIX_MINIMUM < super.prixTVAC();
	}

	public boolean estEnregistrable() 
	{
		return enregistrable;
	}
}