public class BoissonEtendue extends Boisson
{
	private boolean enregistrable;
	private static final double PRIX_MINIMUM = 0.01;
	
	public BoissonEtendue(String nom, double prix, double tva, int quantité) 
	{
		super(nom, prix, tva, quantité);
		enregistrable = PRIX_MINIMUM < super.getPrixTotalTVAC();
	}

	public boolean estEnregistrable() 
	{
		return enregistrable;
	}
}