import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Table_1 extends Interface_Graphique{

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table_1 window = new Table_1();
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
	public Table_1() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 420);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Table 1 :");
		lblNewLabel.setBounds(10, 11, 100, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Client : " + getNom1());
		lblNewLabel_1.setBounds(10, 36, 120, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 181, 514, 189);
		panel.add(lblNewLabel_2);
		
		JRadioButton rdbtnAjouter = new JRadioButton("Ajouter");
		rdbtnAjouter.setBackground(Color.PINK);
		rdbtnAjouter.setForeground(Color.BLACK);
		rdbtnAjouter.setBounds(10, 57, 109, 23);
		panel.add(rdbtnAjouter);
		
		JRadioButton rdbtnEnlever = new JRadioButton("Enlever");
		rdbtnEnlever.setBackground(Color.PINK);
		rdbtnEnlever.setForeground(Color.BLACK);
		rdbtnEnlever.setBounds(121, 57, 80, 23);
		panel.add(rdbtnEnlever);
		
		JButton btnBoisson = new JButton("Boisson 1");
		btnBoisson.setBounds(10, 87, 89, 23);
		panel.add(btnBoisson);
		
		JButton btnBoisson_1 = new JButton("Boisson 2");
		btnBoisson_1.setBounds(10, 121, 89, 23);
		panel.add(btnBoisson_1);
		
		JButton btnBoisson_2 = new JButton("Boisson 3");
		btnBoisson_2.setBounds(10, 155, 89, 23);
		panel.add(btnBoisson_2);
		
		JButton btnBoisson_3 = new JButton("Boisson 4");
		btnBoisson_3.setBounds(109, 87, 89, 23);
		panel.add(btnBoisson_3);
		
		JButton btnBoisson_4 = new JButton("Boisson 5");
		btnBoisson_4.setBounds(109, 121, 89, 23);
		panel.add(btnBoisson_4);
		
		JButton btnBoisson_5 = new JButton("Boisson 6");
		btnBoisson_5.setBounds(109, 155, 89, 23);
		panel.add(btnBoisson_5);
		
		JButton btnBoisson_6 = new JButton("Boisson 7");
		btnBoisson_6.setBounds(208, 87, 89, 23);
		panel.add(btnBoisson_6);
		
		JButton btnBoisson_7 = new JButton("Boisson 8");
		btnBoisson_7.setBounds(208, 121, 89, 23);
		panel.add(btnBoisson_7);
		
		JButton btnBoisson_8 = new JButton("Boisson 9");
		btnBoisson_8.setBounds(208, 155, 89, 23);
		panel.add(btnBoisson_8);
		
		JButton btnBoisson_9 = new JButton("Boisson 10");
		btnBoisson_9.setBounds(307, 87, 89, 23);
		panel.add(btnBoisson_9);
		
		JButton btnImprimerTicket = new JButton("Imprimer le Ticket");
		btnImprimerTicket.setBounds(307, 155, 217, 23);
		panel.add(btnImprimerTicket);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(0), null, new Integer(1)));
		spinner.setBounds(269, 58, 48, 20);
		panel.add(spinner);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9 : ");
		lblQuantit.setBounds(208, 61, 89, 14);
		panel.add(lblQuantit);
	}
}
