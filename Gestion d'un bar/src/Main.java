import com.victor.exceptions.*;

public class Main {
	public static void main(String[] args) 
	{
		try 
		{
			Interface_Graphique window = new Interface_Graphique();
			window.frame.setVisible(true);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}