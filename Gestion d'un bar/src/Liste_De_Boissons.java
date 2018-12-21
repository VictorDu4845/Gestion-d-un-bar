import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Integer;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class Liste_De_Boissons {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	static String nom;
	static double prixTVAC;
	static double tva;
	
	static BoissonEtendue boisson1 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson2 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson3 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson4 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson5 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson6 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson7 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson8 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson9 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	static BoissonEtendue boisson10 = new BoissonEtendue (nom, prixTVAC, tva, 1);
	
	boolean emplacement1 = false;
	boolean emplacement2 = false;
	boolean emplacement3 = false;
	boolean emplacement4 = false;
	boolean emplacement5 = false;
	boolean emplacement6 = false;
	boolean emplacement7 = false;
	boolean emplacement8 = false;
	boolean emplacement9 = false;
	boolean emplacement10 = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try 
				{
					Liste_De_Boissons window = new Liste_De_Boissons();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Liste_De_Boissons() 
	{
		initialize();
		this.frame.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 420);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 534, 381);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Remplissez les cases pour ajouter une nouvelle boisson \u00E0 la carte");
		label.setBounds(10, 11, 414, 14);
		panel.add(label);
		
		JLabel label_error = new JLabel("");
		label_error.setForeground(Color.RED);
		label_error.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_error.setBounds(10, 86, 244, 14);
		panel.add(label_error);
		
		JLabel label_1 = new JLabel("Nom :");
		label_1.setBounds(10, 36, 46, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 33, 86, 20);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("Prix TVAC :");
		label_2.setBounds(10, 61, 65, 14);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 58, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("0.21");
		textField_2.setColumns(10);
		textField_2.setBounds(288, 36, 86, 20);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("% TVA :");
		label_3.setBounds(162, 36, 46, 14);
		panel.add(label_3);		
		
		JLabel lblListeDesBoissons = new JLabel("Liste des Boissons (Maximum 10) : ");
		lblListeDesBoissons.setBounds(10, 106, 514, 14);
		panel.add(lblListeDesBoissons);
		
		JLabel label_4 = new JLabel("1. ");
		label_4.setBounds(10, 131, 46, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("2.");
		label_5.setBounds(10, 156, 46, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("3.");
		label_6.setBounds(10, 181, 46, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("4.");
		label_7.setBounds(10, 206, 46, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("5.");
		label_8.setBounds(10, 231, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("6.");
		label_9.setBounds(10, 256, 46, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("7.");
		label_10.setBounds(10, 281, 46, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("8.");
		label_11.setBounds(10, 306, 46, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("9.");
		label_12.setBounds(10, 331, 46, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("10.");
		label_13.setBounds(10, 356, 46, 14);
		panel.add(label_13);
		
		JLabel lblBoisson_a = new JLabel("");
		lblBoisson_a.setBounds(66, 131, 135, 14);
		panel.add(lblBoisson_a);
		
		JLabel lblBoisson_1 = new JLabel("");
		lblBoisson_1.setBounds(66, 156, 135, 14);
		panel.add(lblBoisson_1);
		
		JLabel lblBoisson_2 = new JLabel("");
		lblBoisson_2.setBounds(66, 181, 135, 14);
		panel.add(lblBoisson_2);
		
		JLabel lblBoisson_3 = new JLabel("");
		lblBoisson_3.setBounds(66, 206, 135, 14);
		panel.add(lblBoisson_3);
		
		JLabel lblBoisson_4 = new JLabel("");
		lblBoisson_4.setBounds(66, 231, 135, 14);
		panel.add(lblBoisson_4);
		
		JLabel lblBoisson_5 = new JLabel("");
		lblBoisson_5.setBounds(66, 256, 135, 14);
		panel.add(lblBoisson_5);
		
		JLabel lblBoisson_6 = new JLabel("");
		lblBoisson_6.setBounds(66, 281, 135, 14);
		panel.add(lblBoisson_6);
		
		JLabel lblBoisson_7 = new JLabel("");
		lblBoisson_7.setBounds(66, 306, 135, 14);
		panel.add(lblBoisson_7);
		
		JLabel lblBoisson_8 = new JLabel("");
		lblBoisson_8.setBounds(66, 331, 135, 14);
		panel.add(lblBoisson_8);
		
		JLabel lblBoisson_9 = new JLabel("");
		lblBoisson_9.setBounds(66, 356, 135, 14);
		panel.add(lblBoisson_9);
		
		JLabel lblPrix_a = new JLabel("");
		lblPrix_a.setBounds(211, 131, 46, 14);
		panel.add(lblPrix_a);
		
		JLabel lblPrix_1 = new JLabel("");
		lblPrix_1.setBounds(211, 156, 46, 14);
		panel.add(lblPrix_1);
		
		JLabel lblPrix_2 = new JLabel("");
		lblPrix_2.setBounds(211, 181, 46, 14);
		panel.add(lblPrix_2);
		
		JLabel lblPrix_3 = new JLabel("");
		lblPrix_3.setBounds(211, 206, 46, 14);
		panel.add(lblPrix_3);
		
		JLabel lblPrix_4 = new JLabel("");
		lblPrix_4.setBounds(211, 231, 46, 14);
		panel.add(lblPrix_4);
		
		JLabel lblPrix_5 = new JLabel("");
		lblPrix_5.setBounds(211, 256, 46, 14);
		panel.add(lblPrix_5);
		
		JLabel lblPrix_6 = new JLabel("");
		lblPrix_6.setBounds(211, 281, 46, 14);
		panel.add(lblPrix_6);
		
		JLabel lblNumroDansLa = new JLabel("Num\u00E9ro dans la liste :");
		lblNumroDansLa.setBounds(162, 61, 191, 14);
		panel.add(lblNumroDansLa);
		
		textField_3 = new JTextField();
		textField_3.setBounds(288, 61, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrix_7 = new JLabel("");
		lblPrix_7.setBounds(211, 306, 46, 14);
		panel.add(lblPrix_7);
		
		JLabel lblPrix_8 = new JLabel("");
		lblPrix_8.setBounds(211, 331, 46, 14);
		panel.add(lblPrix_8);
		
		JLabel lblPrix_9 = new JLabel("");
		lblPrix_9.setBounds(211, 356, 46, 14);
		panel.add(lblPrix_9);
		
		if (boisson1 != null)
		{
			lblBoisson_a.setText(boisson1.getNom());
			lblPrix_a.setText(boisson1.getPrix() + " €");
		}
		
		if (boisson2 != null)
		{
			lblBoisson_1.setText(boisson2.getNom());
			lblPrix_1.setText(boisson2.getPrix() + " €");
		}
		
		if (boisson3 != null)
		{
			lblBoisson_2.setText(boisson3.getNom());
			lblPrix_2.setText(boisson3.getPrix() + " €");
		}
		
		if (boisson4 != null)
		{
			lblBoisson_3.setText(boisson4.getNom());
			lblPrix_3.setText(boisson4.getPrix() + " €");
		}
		
		if (boisson5 != null)
		{
			lblBoisson_4.setText(boisson5.getNom());
			lblPrix_4.setText(boisson5.getPrix() + " €");
		}
		
		if (boisson6 != null)
		{
			lblBoisson_5.setText(boisson6.getNom());
			lblPrix_5.setText(boisson6.getPrix() + " €");
		}
		
		if (boisson7 != null)
		{
			lblBoisson_6.setText(boisson7.getNom());
			lblPrix_6.setText(boisson7.getPrix() + " €");
		}
		
		if (boisson8 != null)
		{
			lblBoisson_7.setText(boisson8.getNom());
			lblPrix_7.setText(boisson8.getPrix() + " €");
		}
		
		if (boisson9 != null)
		{
			lblBoisson_8.setText(boisson9.getNom());
			lblPrix_8.setText(boisson9.getPrix() + " €");
		}
		
		if (boisson10 != null)
		{
			lblBoisson_9.setText(boisson10.getNom());
			lblPrix_9.setText(boisson10.getPrix() + " €");
		}
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(264, 127, 110, 23);
		panel.add(btnSupprimer);
		btnSupprimer.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson1 = null;
				emplacement1 = false;
				label_error.setText("");
				lblBoisson_a.setText("");
				lblPrix_a.setText("");
			}
		});
		
		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setBounds(264, 152, 110, 23);
		panel.add(btnSupprimer_1);
		btnSupprimer_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson2 = null;
				emplacement2 = false;
				label_error.setText("");
				lblBoisson_1.setText("");
				lblPrix_1.setText("");
			}
		});
		
		JButton btnSupprimer_2 = new JButton("Supprimer");
		btnSupprimer_2.setBounds(264, 177, 110, 23);
		panel.add(btnSupprimer_2);
		btnSupprimer_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson3 = null;
				emplacement3 = false;
				label_error.setText("");
				lblBoisson_2.setText("");
				lblPrix_2.setText("");
			}
		});
		
		JButton btnSupprimer_3 = new JButton("Supprimer");
		btnSupprimer_3.setBounds(264, 202, 110, 23);
		panel.add(btnSupprimer_3);
		btnSupprimer_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson4 = null;
				emplacement4 = false;
				label_error.setText("");
				lblBoisson_3.setText("");
				lblPrix_3.setText("");
			}
		});
		
		JButton btnSupprimer_4 = new JButton("Supprimer");
		btnSupprimer_4.setBounds(264, 227, 110, 23);
		panel.add(btnSupprimer_4);
		btnSupprimer_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson5 = null;
				emplacement5 = false;
				label_error.setText("");
				lblBoisson_4.setText("");
				lblPrix_4.setText("");
			}
		});
		
		JButton btnSupprimer_5 = new JButton("Supprimer");
		btnSupprimer_5.setBounds(264, 252, 110, 23);
		panel.add(btnSupprimer_5);
		btnSupprimer_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson6 = null;
				emplacement6 = false;
				label_error.setText("");
				lblBoisson_5.setText("");
				lblPrix_5.setText("");
			}
		});
		
		JButton btnSupprimer_6 = new JButton("Supprimer");
		btnSupprimer_6.setBounds(264, 277, 110, 23);
		panel.add(btnSupprimer_6);
		btnSupprimer_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson7 = null;
				emplacement7 = false;
				label_error.setText("");
				lblBoisson_6.setText("");
				lblPrix_6.setText("");
			}
		});
		
		JButton btnSupprimer_7 = new JButton("Supprimer");
		btnSupprimer_7.setBounds(264, 302, 110, 23);
		panel.add(btnSupprimer_7);
		btnSupprimer_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson8 = null;
				emplacement8 = false;
				label_error.setText("");
				lblBoisson_7.setText("");
				lblPrix_7.setText("");
			}
		});
		
		JButton btnSupprimer_8 = new JButton("Supprimer");
		btnSupprimer_8.setBounds(264, 327, 110, 23);
		panel.add(btnSupprimer_8);
		btnSupprimer_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson9 = null;
				emplacement9 = false;
				label_error.setText("");
				lblBoisson_8.setText("");
				lblPrix_8.setText("");
			}
		});
		
		JButton btnSupprimer_9 = new JButton("Supprimer");
		btnSupprimer_9.setBounds(264, 352, 110, 23);
		panel.add(btnSupprimer_9);
		btnSupprimer_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				boisson10 = null;
				emplacement10 = false;
				label_error.setText("");
				lblBoisson_9.setText("");
				lblPrix_9.setText("");
			}
		});
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(264, 86, 110, 23);
		panel.add(btnAjouter);
		btnAjouter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				String nom = textField.getText();
				double prixTVAC = Double.parseDouble(textField_1.getText());
				String prixString = String.valueOf(prixTVAC);
				double tva = Double.parseDouble(textField_2.getText());
				int valeur = Integer.parseInt(textField_3.getText());
				
				if (!Double.isNaN(prixTVAC))
				{
					if (valeur == 1)
					{
						if (emplacement1 == false)
						{
							label_error.setText("");
							boisson1 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_a.setText(nom);
							lblPrix_a.setText(prixString + " €");
							emplacement1 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 2)
					{
						if (emplacement2 == false)
						{
							label_error.setText("");
							boisson2 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_1.setText(nom);
							lblPrix_1.setText(prixString + " €");
							emplacement2 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					else if (valeur == 3)
					{
						if (emplacement3 == false)
						{
							label_error.setText("");
							boisson3 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_2.setText(nom);
							lblPrix_2.setText(prixString + " €");
							emplacement3 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 4)
					{
						if (emplacement4 == false)
						{
							label_error.setText("");
							boisson4 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_3.setText(nom);
							lblPrix_3.setText(prixString + " €");
							emplacement4 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 5)
					{
						if (emplacement5 == false)
						{
							label_error.setText("");
							boisson5 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_4.setText(nom);
							lblPrix_4.setText(prixString + " €");
							emplacement5 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 6)
					{
						if (emplacement6 == false)
						{
							label_error.setText("");
							boisson6 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_5.setText(nom);
							lblPrix_5.setText(prixString + " €");
							emplacement6 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 7)
					{
						if (emplacement7 == false)
						{
							label_error.setText("");
							boisson7 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_6.setText(nom);
							lblPrix_6.setText(prixString + " €");
							emplacement7 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 8)
					{
						if (emplacement8 == false)
						{
							label_error.setText("");
							boisson8 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_7.setText(nom);
							lblPrix_7.setText(prixString + " €");
							emplacement8 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					
					else if (valeur == 9)
					{
						if (emplacement9 == false)
						{
							label_error.setText("");
							boisson9 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_8.setText(nom);
							lblPrix_8.setText(prixString + " €");
							emplacement9 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					else if (valeur == 10)
					{
						if (emplacement10 == false)
						{
							label_error.setText("");
							boisson10 = new BoissonEtendue (nom, prixTVAC, tva, 1);
							lblBoisson_9.setText(nom);
							lblPrix_9.setText(prixString + " €");
							emplacement10 = true;
						}
						else
						{
							label_error.setText("Cet emplacement est déjà pris");
						}
					}
					else
					{
						label_error.setText("Il y a une erreur dans votre encodage");
					}
				}
				else 
				{
					label_error.setText("Votre prix n'est pas un nombre");
				}
				
		}
		});


	}

}