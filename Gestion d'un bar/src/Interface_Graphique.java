

import com.victor.*;
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

public class Interface_Graphique{

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTapezLeNom = new JLabel("Tapez le nom du Client");
		lblTapezLeNom.setBounds(10, 11, 130, 14);
		panel.add(lblTapezLeNom);
		
		textField = new JTextField("");
		textField.setBounds(160, 8, 120, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblChoisissezSaTable = new JLabel("Choisissez sa table");
		lblChoisissezSaTable.setBounds(10, 61, 120, 14);
		panel.add(lblChoisissezSaTable);
		
		ButtonGroup bg1 = new ButtonGroup( );
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Table 1");
		rdbtnNewRadioButton.setBounds(10, 83, 109, 23);
		panel.add(rdbtnNewRadioButton);
		bg1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Table 2");
		rdbtnNewRadioButton_1.setBounds(10, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		bg1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Table 3");
		rdbtnNewRadioButton_2.setBounds(10, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_2);
		bg1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Table 4");
		rdbtnNewRadioButton_3.setBounds(121, 83, 109, 23);
		panel.add(rdbtnNewRadioButton_3);
		bg1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Table 5");
		rdbtnNewRadioButton_4.setBounds(121, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_4);
		bg1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Table 6");
		rdbtnNewRadioButton_5.setBounds(121, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_5);
		bg1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Table 7");
		rdbtnNewRadioButton_6.setBounds(232, 83, 109, 23);
		panel.add(rdbtnNewRadioButton_6);
		bg1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Table 8");
		rdbtnNewRadioButton_7.setBounds(232, 109, 109, 23);
		panel.add(rdbtnNewRadioButton_7);
		bg1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Table 9");
		rdbtnNewRadioButton_8.setBounds(232, 135, 109, 23);
		panel.add(rdbtnNewRadioButton_8);
		bg1.add(rdbtnNewRadioButton_8);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 36, 260, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 165, 264, 14);
		panel.add(label_1);
		
		JButton btnNewButton = new JButton("Ajouter le Client");
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
				}
				if (!nom.isEmpty())
				{
					label.setText("");
					
					if (rdbtnNewRadioButton.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t1 = new TicketCaisse(nom);
					}
				
					if (rdbtnNewRadioButton_1.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t2 = new TicketCaisse(nom);
					}
				
					if (rdbtnNewRadioButton_2.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t3 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_3.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t4 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_4.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t5 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_5.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t6 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_6.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t7 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_7.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t8 = new TicketCaisse(nom);
					}
					
					if (rdbtnNewRadioButton_8.isSelected() == true)
					{
						label_1.setText("");
						TicketCaisse t9 = new TicketCaisse(nom);
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
		btnNewButton.setBounds(10, 190, 130, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Liste des Clients :");
		lblNewLabel.setBounds(10, 224, 130, 14);
		panel.add(lblNewLabel);
	}
}
