import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;

public class Interface_Chat_Employe extends JFrame implements ActionListener {
    /**
	 * 
	 */
	static Socket employeSocket;
    JPanel panel;
    JTextField textField;
    JTextArea textArea;
    JButton button;
    private JLabel lblChatctEmploy;
    
    public static void main(String[] args) throws UnknownHostException, IOException {
    	Interface_Chat_Employe window = new Interface_Chat_Employe();
    }

    public Interface_Chat_Employe() throws UnknownHostException, IOException {

        setDefaultCloseOperation(HIDE_ON_CLOSE);
    	
    	panel = new JPanel();
    	panel.setBackground(Color.PINK);
        panel.setLayout(null);
    	
    	lblChatctEmploy = new JLabel("Chat (c\u00F4t\u00E9 Employ\u00E9) :");
    	lblChatctEmploy.setBounds(10, 11, 460, 14);
    	panel.add(lblChatctEmploy);
    	
    	textField = new JTextField();
    	textField.setBounds(10, 400, 350, 30);
        panel.add(textField);
    	
        textArea = new JTextArea();
        textArea.setBounds(10, 36, 460, 344);
        panel.add(textArea);
        
        button = new JButton("Envoyer");
        button.setBounds(375, 400, 95, 30);
        panel.add(button);
        
        this.setSize(500, 500);
        this.setVisible(true);
        getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      

        button.addActionListener(new ActionListener ()
        	{
        		    public void actionPerformed(ActionEvent e) {
        		        if ((e.getSource() == button) && (textField.getText() != "")) {

        		            textArea.setText(textArea.getText() + '\n' + "Employé :"
        		                    + textField.getText());
        		            try {
        		                DataOutputStream donnéesOut = new DataOutputStream(
        		                        employeSocket.getOutputStream());
        		                donnéesOut.writeUTF(textField.getText());
        		            } catch (Exception e1) {
        		                textArea.setText(textArea.getText() + '\n'
        		                        + "Message sending fail:Network Error");
        		                try {
        		                    Thread.sleep(3000);
        		                    System.exit(0);
        		                } catch (InterruptedException e2) {
        		                    e2.printStackTrace();
        		                }
        		            }
        		            textField.setText("");
        		        }
        		    }
        		});
        
        employeSocket = new Socket(InetAddress.getLocalHost(), 2000);

        textArea.setText("Connecté à la Caisse");
        while (true) {
            try {
                DataInputStream donnéesIn = new DataInputStream(employeSocket.getInputStream());
                String string = donnéesIn.readUTF();
                textArea.setText(textArea.getText() + '\n' + "Caisse :"
                        + string);
            } catch (Exception e1) {
                textArea.setText(textArea.getText() + '\n'
                        + "Message non envoyé: Erreur de réseau");
                try {
                    Thread.sleep(3000);
                    System.exit(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}