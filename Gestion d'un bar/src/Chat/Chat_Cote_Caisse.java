package Chat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Cote_Caisse {

	public static void main(String[] args) {
		
		final ServerSocket Chat_Cote_Caisse_Socket  ;
	     final Socket Chat_Cote_Employe_Socket ;
	     final BufferedReader in;
	     final PrintWriter out;
	     final Scanner scanner=new Scanner(System.in);
	     
	     try {
	         Chat_Cote_Caisse_Socket = new ServerSocket(1000);
	         Chat_Cote_Employe_Socket = Chat_Cote_Caisse_Socket.accept();
	         out = new PrintWriter(Chat_Cote_Employe_Socket.getOutputStream());
	         in = new BufferedReader (new InputStreamReader (Chat_Cote_Employe_Socket.getInputStream()));
	         Thread envoi= new Thread(new Runnable() {
	            String message;
	            @Override
	            public void run() {
	               while(true){
	                  message = scanner.nextLine();
	                  out.println(message);
	                  out.flush();
	               }
	            }
	         });
	         envoi.start();
	         
	         Thread recevoir= new Thread (new Runnable() {
	             String message ;
	             @Override
	             public void run() {
	                try {
	                   message = in.readLine();
	                   while(message!=null){
	                      System.out.println("Employé a écrit : " + message);
	                      message = in.readLine();
	                   }
	                   System.out.println("Employé a été déconecté");
	                   out.close();
	                   Chat_Cote_Employe_Socket.close();
	                   Chat_Cote_Caisse_Socket.close();
	                } catch (IOException e) {
	                     e.printStackTrace();
	                }
	            }
	         });
	         recevoir.start();
	         }catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }