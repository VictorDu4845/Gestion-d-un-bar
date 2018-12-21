import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;

public class Interface_Chat_Caisse extends JFrame implements ActionListener {
	 /**
		 * 
		 */
    static ServerSocket caisseServer;
    static Socket employeSocket;
    JPanel panel;
    JTextField textField;
    JTextArea textArea;
    JButton button;
    DataOutputStream donnéesOut;
    DataInputStream donnéesIn;
    
    public static void main(String[] args) throws UnknownHostException, IOException {
    	Interface_Chat_Caisse window = new Interface_Chat_Caisse();
    }
    
    public Interface_Chat_Caisse() throws UnknownHostException, IOException
    {
    	
    	setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    	panel = new JPanel();
    	panel.setBackground(Color.PINK);
    	panel.setLayout(null);
    	
    	textField = new JTextField();
    	textField.setBounds(10, 400, 350, 30);
        panel.add(textField);
    	
    	textArea = new JTextArea();
    	textArea.setBounds(10, 36, 460, 344);
        panel.add(textArea);
    	
    	button = new JButton("Envoyer");
    	button.setBounds(375, 400, 95, 30);
        panel.add(button);
    	button.addActionListener(this);
    	
    	this.setSize(500, 500);
        this.setVisible(true);
        getContentPane().add(panel);
        
    	button.addActionListener(new ActionListener()
    		{
    			public void actionPerformed(ActionEvent e) 
    			{
    				if (textField.getText() != "") 
    				{
    					textArea.setText(textArea.getText() + '\n' + "Caisse :"  + textField.getText());
    					try 
    					{
    						DataOutputStream dos = new DataOutputStream(employeSocket.getOutputStream());
    						dos.writeUTF(textField.getText());
    	            	} 
    					catch (Exception e1) 
    					{
    						try 
    						{
    							Thread.sleep(3000);
    							System.exit(0);
    						} 
    						catch (InterruptedException e2) 
    						{
    							e2.printStackTrace();
    						}
    					}
    					textField.setText("");
    				}
    			}
    		});
    	
        caisseServer = new ServerSocket(2000, 1, InetAddress.getLocalHost());
        textArea.setText("En attente d'Employé");
        employeSocket = caisseServer.accept();
        textArea.setText(textArea.getText() + '\n' + "Trouvé !");
        
        JLabel lblChatctCaisse = new JLabel("Chat (c\u00F4t\u00E9 Caisse) :");
        lblChatctCaisse.setBounds(10, 11, 460, 14);
        panel.add(lblChatctCaisse);
        while (true) {
            try {
                DataInputStream donnéesIn = new DataInputStream(employeSocket.getInputStream());
                String string = donnéesIn.readUTF();
                textArea.setText(textArea.getText() + '\n' + "Client:"
                        + string);
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
        }
    }
}
         
        
        
        