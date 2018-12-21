import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import com.victor.exceptions.BoissonInvalideException;
import com.victor.exceptions.ListeVideException;
import com.victor.exceptions.QuantiteNegativeException;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Table_4
{

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run()
			{
				try 
				{
					Table_4 window = new Table_4();
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
	public Table_4() 
	{
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() 
	{
		ButtonGroup ajouterEnlever = new ButtonGroup( );
		
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 620);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		try 
		{
			textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
		}
		catch (ListeVideException e)
		{
			textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
		}
		textPane.setBounds(20, 269, 604, 301);
		panel.add(textPane);
		
		JScrollPane sp = new JScrollPane(textPane, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(20, 269, 604, 301);
		panel.add(sp);
		
		JLabel lblNewLabel = new JLabel("Table 1 :");
		lblNewLabel.setBounds(10, 11, 100, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Client : " + Interface_Graphique.nom1);
		lblNewLabel_1.setBounds(10, 36, 120, 14);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbtnAjouter = new JRadioButton("Ajouter");
		rdbtnAjouter.setSelected(true);
		rdbtnAjouter.setBackground(Color.PINK);
		rdbtnAjouter.setForeground(Color.BLACK);
		rdbtnAjouter.setBounds(10, 116, 100, 23);
		panel.add(rdbtnAjouter);
		ajouterEnlever.add(rdbtnAjouter);
		
		JRadioButton rdbtnEnlever = new JRadioButton("Enlever");
		rdbtnEnlever.setBackground(Color.PINK);
		rdbtnEnlever.setForeground(Color.BLACK);
		rdbtnEnlever.setBounds(108, 116, 80, 23);
		panel.add(rdbtnEnlever);
		ajouterEnlever.add(rdbtnEnlever);
		
		textField = new JTextField();
		textField.setBounds(256, 117, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMessageDerreur = new JLabel("");
		lblMessageDerreur.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMessageDerreur.setForeground(Color.RED);
		lblMessageDerreur.setBounds(10, 244, 614, 14);
		panel.add(lblMessageDerreur);
		
		JButton btnBoisson = new JButton("Boisson 1");
		btnBoisson.setEnabled(false);
		btnBoisson.setBounds(10, 146, 100, 23);
		panel.add(btnBoisson);
		btnBoisson.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson1, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson1, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_1 = new JButton("Boisson 2");
		btnBoisson_1.setEnabled(false);
		btnBoisson_1.setBounds(10, 180, 100, 23);
		panel.add(btnBoisson_1);
		btnBoisson_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson2, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson2, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_2 = new JButton("Boisson 3");
		btnBoisson_2.setEnabled(false);
		btnBoisson_2.setBounds(10, 210, 100, 23);
		panel.add(btnBoisson_2);
		btnBoisson_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson3, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson3, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_3 = new JButton("Boisson 4");
		btnBoisson_3.setEnabled(false);
		btnBoisson_3.setBounds(121, 146, 100, 23);
		panel.add(btnBoisson_3);
		btnBoisson_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson4, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson4, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		JButton btnBoisson_4 = new JButton("Boisson 5");
		btnBoisson_4.setEnabled(false);
		btnBoisson_4.setBounds(121, 176, 100, 23);
		panel.add(btnBoisson_4);
		btnBoisson_4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson5, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson5, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_5 = new JButton("Boisson 6");
		btnBoisson_5.setEnabled(false);
		btnBoisson_5.setBounds(121, 210, 100, 23);
		panel.add(btnBoisson_5);
		btnBoisson_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson6, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson6, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_6 = new JButton("Boisson 7");
		btnBoisson_6.setEnabled(false);
		btnBoisson_6.setBounds(242, 146, 100, 23);
		panel.add(btnBoisson_6);
		btnBoisson_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson7, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson7, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_7 = new JButton("Boisson 8");
		btnBoisson_7.setEnabled(false);
		btnBoisson_7.setBounds(242, 176, 100, 23);
		panel.add(btnBoisson_7);
		btnBoisson_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson8, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson8, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_8 = new JButton("Boisson 9");
		btnBoisson_8.setEnabled(false);
		btnBoisson_8.setBounds(242, 210, 100, 23);
		panel.add(btnBoisson_8);
		btnBoisson_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson9, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson9, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		JButton btnBoisson_9 = new JButton("Boisson 10");
		btnBoisson_9.setEnabled(false);
		btnBoisson_9.setBounds(363, 146, 100, 23);
		panel.add(btnBoisson_9);
		btnBoisson_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				if (rdbtnAjouter.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.ajouter(Liste_De_Boissons.boisson10, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException | ListeVideException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
				}
				else if (rdbtnEnlever.isSelected() == true)
				{
					try
					{
						Interface_Graphique.t4.enlever(Liste_De_Boissons.boisson10, Integer.parseInt(textField.getText()));
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + Interface_Graphique.t4.afficherTicket());
					}
					catch (BoissonInvalideException | QuantiteNegativeException erreur)
					{
						lblMessageDerreur.setText(erreur.getMessage());
					}
					catch (ListeVideException erreur)
					{
						textPane.setText("Client :  "+ Interface_Graphique.getNom4() + "\n" + "\n" + "Il n'y a pas encore de consommations pour ce Client.");
					}
				}
			}
		});
		
		if (Liste_De_Boissons.boisson1.nom != null)
		{
			btnBoisson.setText(Liste_De_Boissons.boisson1.getNom());
			btnBoisson.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson1.nom == null)
		{
			btnBoisson.setText("Boisson 1");
			btnBoisson.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson2.nom != null)
		{
			btnBoisson_1.setText(Liste_De_Boissons.boisson2.getNom());
			btnBoisson_1.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson2.nom == null)
		{
			btnBoisson_1.setText("Boisson 2");
			btnBoisson_1.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson3.nom != null)
		{
			btnBoisson_2.setText(Liste_De_Boissons.boisson3.getNom());
			btnBoisson_2.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson3.nom == null)
		{
			btnBoisson_2.setText("Boisson 3");
			btnBoisson_2.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson4.nom != null)
		{
			btnBoisson_3.setText(Liste_De_Boissons.boisson4.getNom());
			btnBoisson_3.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson4.nom == null)
		{
			btnBoisson_3.setText("Boisson 4");
			btnBoisson_3.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson5.nom != null)
		{
			btnBoisson_4.setText(Liste_De_Boissons.boisson5.getNom());
			btnBoisson_4.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson5.nom == null)
		{
			btnBoisson_4.setText("Boisson 5");
			btnBoisson_4.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson6.nom != null)
		{
			btnBoisson_5.setText(Liste_De_Boissons.boisson6.getNom());
			btnBoisson_5.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson6.nom == null)
		{
			btnBoisson_5.setText("Boisson 6");
			btnBoisson_5.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson7.nom != null)
		{
			btnBoisson_6.setText(Liste_De_Boissons.boisson7.getNom());
			btnBoisson_6.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson7.nom == null)
		{
			btnBoisson_6.setText("Boisson 7");
			btnBoisson_6.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson8.nom != null)
		{
			btnBoisson_7.setText(Liste_De_Boissons.boisson8.getNom());
			btnBoisson_7.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson8.nom == null)
		{
			btnBoisson_7.setText("Boisson 8");
			btnBoisson_7.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson9.nom != null)
		{
			btnBoisson_8.setText(Liste_De_Boissons.boisson9.getNom());
			btnBoisson_8.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson9.nom == null)
		{
			btnBoisson_8.setText("Boisson 9");
			btnBoisson_8.setEnabled(false);
		}
		if (Liste_De_Boissons.boisson10.nom != null)
		{
			btnBoisson_9.setText(Liste_De_Boissons.boisson10.getNom());
			btnBoisson_9.setEnabled(true);
		}
		else if (Liste_De_Boissons.boisson10.nom == null)
		{
			btnBoisson_9.setText("Boisson 10");
			btnBoisson_9.setEnabled(false);
		}
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9 : ");
		lblQuantit.setBounds(194, 120, 89, 14);
		panel.add(lblQuantit);
		
		JButton btnNewButton = new JButton("Rafra\u00EEchir la Liste");
		btnNewButton.setBounds(454, 58, 170, 23);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				if (Liste_De_Boissons.boisson1.nom != null)
				{
					btnBoisson.setText(Liste_De_Boissons.boisson1.getNom());
					btnBoisson.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson1.nom == null)
				{
					btnBoisson.setText("Boisson 1");
					btnBoisson.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson2.nom != null)
				{
					btnBoisson_1.setText(Liste_De_Boissons.boisson2.getNom());
					btnBoisson_1.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson2.nom == null)
				{
					btnBoisson_1.setText("Boisson 2");
					btnBoisson_1.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson3.nom != null)
				{
					btnBoisson_2.setText(Liste_De_Boissons.boisson3.getNom());
					btnBoisson_2.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson3.nom == null)
				{
					btnBoisson_2.setText("Boisson 3");
					btnBoisson_2.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson4.nom != null)
				{
					btnBoisson_3.setText(Liste_De_Boissons.boisson4.getNom());
					btnBoisson_3.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson4.nom == null)
				{
					btnBoisson_3.setText("Boisson 4");
					btnBoisson_3.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson5.nom != null)
				{
					btnBoisson_4.setText(Liste_De_Boissons.boisson5.getNom());
					btnBoisson_4.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson5.nom == null)
				{
					btnBoisson_4.setText("Boisson 5");
					btnBoisson_4.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson6.nom != null)
				{
					btnBoisson_5.setText(Liste_De_Boissons.boisson6.getNom());
					btnBoisson_5.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson6.nom == null)
				{
					btnBoisson_5.setText("Boisson 6");
					btnBoisson_5.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson7.nom != null)
				{
					btnBoisson_6.setText(Liste_De_Boissons.boisson7.getNom());
					btnBoisson_6.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson7.nom == null)
				{
					btnBoisson_6.setText("Boisson 7");
					btnBoisson_6.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson8.nom != null)
				{
					btnBoisson_7.setText(Liste_De_Boissons.boisson8.getNom());
					btnBoisson_7.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson8.nom == null)
				{
					btnBoisson_7.setText("Boisson 8");
					btnBoisson_7.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson9.nom != null)
				{
					btnBoisson_8.setText(Liste_De_Boissons.boisson9.getNom());
					btnBoisson_8.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson9.nom == null)
				{
					btnBoisson_8.setText("Boisson 9");
					btnBoisson_8.setEnabled(false);
				}
				if (Liste_De_Boissons.boisson10.nom != null)
				{
					btnBoisson_9.setText(Liste_De_Boissons.boisson10.getNom());
					btnBoisson_9.setEnabled(true);
				}
				else if (Liste_De_Boissons.boisson10.nom == null)
				{
					btnBoisson_9.setText("Boisson 10");
					btnBoisson_9.setEnabled(false);
				}
			}
		});
		
		JLabel lblSlectionnezAjouterOu = new JLabel("Cliquez sur \"Rafra\u00EEchir la liste\" puis s\u00E9lectionnez \"Ajouter\"/\"Enlever\" ");
		lblSlectionnezAjouterOu.setBounds(10, 62, 614, 14);
		panel.add(lblSlectionnezAjouterOu);
		
		JLabel lblEtLaQuantit = new JLabel("et la Quantit\u00E9 et cliquez sur la Boisson que vous voulez Ajouter/Enlever");
		lblEtLaQuantit.setBounds(10, 87, 614, 14);
		panel.add(lblEtLaQuantit);
	}
}