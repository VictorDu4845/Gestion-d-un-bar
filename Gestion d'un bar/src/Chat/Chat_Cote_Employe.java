package Chat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Chat_Cote_Employe {

   public static void main(String[] args) {
      
      final Socket Chat_Cote_Employe_Socket;
      final BufferedReader in;
      final PrintWriter out;
      final Scanner scanner = new Scanner(System.in);
  
      try {
    	  
         Chat_Cote_Employe_Socket = new Socket("127.0.0.254",1000);
   
         out = new PrintWriter(Chat_Cote_Employe_Socket.getOutputStream());
         in = new BufferedReader(new InputStreamReader(Chat_Cote_Employe_Socket.getInputStream()));
   
         Thread envoyer = new Thread(new Runnable() {
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
         envoyer.start();
   
        Thread recevoir = new Thread(new Runnable() {
            String message;
            @Override
            public void run() {
               try {
                 message = in.readLine();
                 while(message!=null){
                    System.out.println("Caisse a écrit : " + message);
                    message = in.readLine();
                 }
                 System.out.println("Caisse déconectée");
                 out.close();
                 Chat_Cote_Employe_Socket.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
            }
        });
        recevoir.start();
   
      } catch (IOException e) {
           e.printStackTrace();
      }
  }
}