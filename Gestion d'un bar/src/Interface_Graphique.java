import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Interface_Graphique{

	public JFrame frame;
	private JTextField textField;
	public boolean table1 = false;
	public void setTable1(boolean table1)
	{
		this.table1 = table1;
	}
	
	public boolean table2 = false;
	public boolean table3 = false;
	public boolean table4 = false;
	public boolean table5 = false;
	public boolean table6 = false;
	public boolean table7 = false;
	public boolean table8 = false;
	public boolean table9 = false;
	
	public static String nom1 ="";
	public String getNom1()
	{
		return nom1;
	}
	
	public String nom2 ="";
	public String getNom2()
	{
		return nom2;
	}
	
	public String nom3 ="";
	public String getNom3()
	{
		return nom3;
	}
	
	public String nom4 ="";
	public String getNom4()
	{
		return nom4;
	}
	
	public String nom5 ="";
	public String getNom5()
	{
		return nom5;
	}
	
	public String nom6 ="";
	public String getNom6()
	{
		return nom6;
	}
	
	public String nom7 ="";
	public String getNom7()
	{
		return nom7;
	}
	
	public String nom8 ="";
	public String getNom8()
	{
		return nom8;
	}
	
	public String nom9 ="";
	
	public String getNom9()
	{
		return nom9;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_Graphique window = new Interface_Graphique();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface_Graphique() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTapezLeNom = new JLabel("Inscrivez le nom du Client");
		lblTapezLeNom.setBounds(10, 11, 201, 14);
		panel.add(lblTapezLeNom);
		
		textField = new JTextField("");
		textField.setBounds(157, 8, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChoisissezSaTable = new JLabel("Choisissez sa table");
		lblChoisissezSaTable.setBounds(10, 61, 120, 14);
		panel.add(lblChoisissezSaTable);
		
		ButtonGroup bg1 = new ButtonGroup( );
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Table 1");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBackground(Color.PINK);
		rdbtnNewRadioButton.setBounds(10, 83, 109, 23);
		panel.add(rdbtnNewRadioButton);
		bg1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Table 2");
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setBackground(Color.PINK);
		rdbtnNewRadioButton_1.setBounds(10, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		bg1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Table 3");
		rdbtnNewRadioButton_2.setForeground(Color.BLACK);
		rdbtnNewRadioButton_2.setBackground(Color.PINK);
		rdbtnNewRadioButton_2.setBounds(10, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		bg1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Table 4");
		rdbtnNewRadioButton_3.setForeground(Color.BLACK);
		rdbtnNewRadioButton_3.setBackground(Color.PINK);
		rdbtnNewRadioButton_3.setBounds(121, 83, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
		bg1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Table 5");
		rdbtnNewRadioButton_4.setForeground(Color.BLACK);
		rdbtnNewRadioButton_4.setBackground(Color.PINK);
		rdbtnNewRadioButton_4.setBounds(121, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_4);
		bg1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Table 6");
		rdbtnNewRadioButton_5.setForeground(Color.BLACK);
		rdbtnNewRadioButton_5.setBackground(Color.PINK);
		rdbtnNewRadioButton_5.setBounds(121, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_5);
		bg1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Table 7");
		rdbtnNewRadioButton_6.setForeground(Color.BLACK);
		rdbtnNewRadioButton_6.setBackground(Color.PINK);
		rdbtnNewRadioButton_6.setBounds(232, 83, 109, 23);
		panel.add(rdbtnNewRadioButton_6);
		bg1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Table 8");
		rdbtnNewRadioButton_7.setForeground(Color.BLACK);
		rdbtnNewRadioButton_7.setBackground(Color.PINK);
		rdbtnNewRadioButton_7.setBounds(232, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_7);
		bg1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Table 9");
		rdbtnNewRadioButton_8.setForeground(Color.BLACK);
		rdbtnNewRadioButton_8.setBackground(Color.PINK);
		rdbtnNewRadioButton_8.setBounds(232, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_8);
		bg1.add(rdbtnNewRadioButton_8);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 36, 260, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 165, 264, 14);
		panel.add(label_1);
		
		JButton btnNewButton_1 = new JButton("Vide");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(58, 245, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_1 fenetre_1 = new Table_1();
		}
		});
		
		JButton btnNewButton_2 = new JButton("Vide");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(58, 270, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_2 fenetre_2 = new Table_2();
		}
		});
		
		JButton btnNewButton_3 = new JButton("Vide");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBounds(58, 295, 89, 23);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_3 fenetre_3 = new Table_3();
		}
		});
		
		JButton btnNewButton_4 = new JButton("Vide");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBounds(58, 320, 89, 23);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_4 fenetre_4 = new Table_4();
		}
		});
		
		JButton btnNewButton_5 = new JButton("Vide");
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setBounds(58, 345, 89, 23);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_5 fenetre_5 = new Table_5();
		}
		});
		
		JButton btnNewButton_6 = new JButton("Vide");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setBounds(272, 245, 89, 23);
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_6 fenetre_6 = new Table_6();
		}
		});
		
		JButton btnNewButton_7 = new JButton("Vide");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setBounds(272, 270, 89, 23);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_7 fenetre_7 = new Table_7();
		}
		});
		
		JButton btnNewButton_8 = new JButton("Vide");
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.setBounds(272, 295, 89, 23);
		panel.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_8 fenetre_8 = new Table_8();
		}
		});
		
		JButton btnNewButton_9 = new JButton("Vide");
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setBounds(272, 320, 89, 23);
		panel.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Table_9 fenetre_9 = new Table_9();
		}
		});
		
		JButton btnNewButton = new JButton("Ajouter le Client");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String nom = textField.getText();
				
				if (nom.isEmpty())
				{
					label.setText("Veuillez renseigner un nom");
					label.setForeground(Color.RED);
					label.setFont(new Font("Tahoma", Font.BOLD, 11));
					label_1.setText("");
				}
				if (!nom.isEmpty())
				{
					label.setText("");
					
					if (rdbtnNewRadioButton.isSelected() == true)
					{
						if (table1 == false)
						{
							label_1.setText("");
							TicketCaisse t1 = new TicketCaisse(nom);
							btnNewButton_1.setText(nom);
							btnNewButton_1.setEnabled(true);
							nom1 = nom;
							table1 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}
					}
				
					if (rdbtnNewRadioButton_1.isSelected() == true)
					{
						if (table2 == false)
						{
							label_1.setText("");
							TicketCaisse t2 = new TicketCaisse(nom);
							btnNewButton_2.setText(nom);
							btnNewButton_2.setEnabled(true);
							nom2 = nom;
							table2 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}
					}
				
					if (rdbtnNewRadioButton_2.isSelected() == true)
					{
						if (table3 == false)
						{
							label_1.setText("");
							TicketCaisse t3 = new TicketCaisse(nom);
							btnNewButton_3.setText(nom);
							btnNewButton_3.setEnabled(true);
							nom3 = nom;
							table3 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}
					}
					
					if (rdbtnNewRadioButton_3.isSelected() == true)
					{
						if (table4 == false)
						{
							label_1.setText("");
							TicketCaisse t4 = new TicketCaisse(nom);
							btnNewButton_4.setText(nom);
							btnNewButton_4.setEnabled(true);
							nom4 = nom;
							table4 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}
					}
					
					if (rdbtnNewRadioButton_4.isSelected() == true)
					{
						if (table5 == false)
						{
							label_1.setText("");
							TicketCaisse t5 = new TicketCaisse(nom);
							btnNewButton_5.setText(nom);
							btnNewButton_5.setEnabled(true);
							nom5 =nom;
							table5 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}

					}
					
					if (rdbtnNewRadioButton_5.isSelected() == true)
					{
						if (table6 == false)
						{
							label_1.setText("");
							TicketCaisse t6 = new TicketCaisse(nom);
							btnNewButton_6.setText(nom);
							btnNewButton_6.setEnabled(true);
							nom6 = nom;
							table6 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}

					}
					
					if (rdbtnNewRadioButton_6.isSelected() == true)
					{
						if (table7 == false)
						{
							label_1.setText("");
							TicketCaisse t7 = new TicketCaisse(nom);
							btnNewButton_7.setText(nom);
							btnNewButton_7.setEnabled(true);
							nom7 = nom;
							table7 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}

					}
					
					if (rdbtnNewRadioButton_7.isSelected() == true)
					{
						if (table8 == false)
						{
							label_1.setText("");
							TicketCaisse t8 = new TicketCaisse(nom);
							btnNewButton_8.setText(nom);
							btnNewButton_8.setEnabled(true);
							nom8 = nom;
							table5 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}

					}
					
					if (rdbtnNewRadioButton_8.isSelected() == true)
					{
						if (table9 == false)
						{
							label_1.setText("");
							TicketCaisse t9 = new TicketCaisse(nom);
							btnNewButton_9.setText(nom);
							btnNewButton_9.setEnabled(true);
							nom9 = nom;
							table9 = true;
						}
						else
						{
							label_1.setText("Il y a déjà un client à cette table");
							label_1.setForeground(Color.RED);
							label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
						}

					}
					
					if (rdbtnNewRadioButton.isSelected() == false  && rdbtnNewRadioButton_1.isSelected() == false && rdbtnNewRadioButton_2.isSelected() == false && rdbtnNewRadioButton_3.isSelected() == false && rdbtnNewRadioButton_4.isSelected() == false && rdbtnNewRadioButton_5.isSelected() == false && rdbtnNewRadioButton_6.isSelected() == false && rdbtnNewRadioButton_7.isSelected() == false && rdbtnNewRadioButton_8.isSelected() == false)
					{
						label_1.setText("Veuillez renseigner une table");
						label_1.setForeground(Color.RED);
						label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
					}
				}
			}
		});
		btnNewButton.setBounds(347, 83, 130, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cliquez sur un bouton pour acc\u00E9der au Client ou sur X pour supprimer son compte");
		lblNewLabel.setBounds(10, 224, 465, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Table 1 :");
		lblNewLabel_1.setBounds(10, 249, 85, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Table 2 :");
		lblNewLabel_2.setBounds(10, 274, 85, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Table 3 :");
		lblNewLabel_3.setBounds(10, 299, 85, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Table 4 :");
		lblNewLabel_4.setBounds(10, 324, 85, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Table 5 :");
		lblNewLabel_5.setBounds(10, 349, 85, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Table 6 :");
		lblNewLabel_6.setBounds(224, 249, 85, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Table 7:");
		lblNewLabel_7.setBounds(224, 274, 85, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Table 8 :");
		lblNewLabel_8.setBounds(224, 299, 85, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Table 9 :");
		lblNewLabel_9.setBounds(224, 324, 85, 14);
		panel.add(lblNewLabel_9);
		
		JButton btnSupprimer_1 = new JButton("X");
		btnSupprimer_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_1.setForeground(Color.BLACK);
		btnSupprimer_1.setBounds(157, 245, 54, 23);
		panel.add(btnSupprimer_1);
		btnSupprimer_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_1.setText("Vide");
				btnNewButton_1.setEnabled(false);
				table1 = false;
		}
		});
		
		JButton btnSupprimer_2 = new JButton("X");
		btnSupprimer_2.setForeground(Color.BLACK);
		btnSupprimer_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_2.setBounds(157, 270, 54, 23);
		panel.add(btnSupprimer_2);
		btnSupprimer_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_2.setText("Vide");
				btnNewButton_2.setEnabled(false);
				table2 = false;
		}
		});
		
		JButton btnSupprimer_3 = new JButton("X");
		btnSupprimer_3.setForeground(Color.BLACK);
		btnSupprimer_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_3.setBounds(157, 295, 54, 23);
		panel.add(btnSupprimer_3);
		btnSupprimer_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_3.setText("Vide");
				btnNewButton_3.setEnabled(false);
				table3 = false;
		}
		});
		
		JButton btnSupprimer_4 = new JButton("X");
		btnSupprimer_4.setForeground(Color.BLACK);
		btnSupprimer_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_4.setBounds(157, 320, 54, 23);
		panel.add(btnSupprimer_4);
		btnSupprimer_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_4.setText("Vide");
				btnNewButton_4.setEnabled(false);
				table4 = false;
		}
		});
		
		JButton btnSupprimer_5 = new JButton("X");
		btnSupprimer_5.setForeground(Color.BLACK);
		btnSupprimer_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_5.setBounds(157, 345, 54, 23);
		panel.add(btnSupprimer_5);
		btnSupprimer_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_5.setText("Vide");
				btnNewButton_5.setEnabled(false);
				table5 = false;
		}
		});
		
		JButton btnSupprimer_6 = new JButton("X");
		btnSupprimer_6.setForeground(Color.BLACK);
		btnSupprimer_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_6.setBounds(371, 245, 54, 23);
		panel.add(btnSupprimer_6);
		btnSupprimer_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_6.setText("Vide");
				btnNewButton_6.setEnabled(false);
				table6 = false;
		}
		});
		
		JButton btnSupprimer_7 = new JButton("X");
		btnSupprimer_7.setForeground(Color.BLACK);
		btnSupprimer_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_7.setBounds(371, 270, 54, 23);
		panel.add(btnSupprimer_7);
		btnSupprimer_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_7.setText("Vide");
				btnNewButton_7.setEnabled(false);
				table7 = false;
		}
		});
		
		JButton btnSupprimer_8 = new JButton("X");
		btnSupprimer_8.setForeground(Color.BLACK);
		btnSupprimer_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_8.setBounds(371, 295, 54, 23);
		panel.add(btnSupprimer_8);
		btnSupprimer_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_8.setText("Vide");
				btnNewButton_8.setEnabled(false);
				table8 = false;
		}
		});
		
		JButton btnSupprimer_9 = new JButton("X");
		btnSupprimer_9.setForeground(Color.BLACK);
		btnSupprimer_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSupprimer_9.setBounds(371, 320, 54, 23);
		panel.add(btnSupprimer_9);
		btnSupprimer_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				btnNewButton_9.setText("Vide");
				btnNewButton_9.setEnabled(false);
				table9 = false;
		}
		});
		
		JButton btnNewButton_10 = new JButton("Ouvrir le Chat");
		btnNewButton_10.setBounds(347, 190, 176, 23);
		panel.add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Interface_Chat chat = new Interface_Chat();
		}
		});
		
		JButton btnOuvrirLeMenu = new JButton("Ouvrir le menu Boissons");
		btnOuvrirLeMenu.setBounds(347, 164, 177, 23);
		panel.add(btnOuvrirLeMenu);
		btnOuvrirLeMenu.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Liste_De_Boissons liste = new Liste_De_Boissons();
				
		}
		});

		

	}
}



