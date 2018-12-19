import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JSpinner;

public class Interface_Chat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_Chat window = new Interface_Chat();
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
	public Interface_Chat() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChat = new JLabel("Chat");
		lblChat.setBounds(10, 11, 46, 14);
		panel.add(lblChat);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		btnEnvoyer.setBounds(335, 227, 89, 23);
		panel.add(btnEnvoyer);
	}
}
