
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andrvtl
 */
public class Client {

    String nome;
    String colore;
    Socket socket;


    public Client(String nome){


    }

    public Client(String nome, String colore){
        this.nome = nome;
        this.colore = colore;
    }

    public Client(String nome, String colore){
        this.nome = nome;
        this.colore = colore;
    }

    public void connetti(String nomeServer, int portaServer){

        try {
            socket = new Socket(nomeServer, portaServer);
            System.out.println("1) Connessione con il server avvenuta");
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nello stabilimento della connessione con il server");
            ex.printStackTrace();
        }

    }


    public void scrivi(){
        
    }
    
    public void leggi(){

    }
    public void chiudi(){
        if(socket !=NULL)
            try {
                socket.close();
                System.out.println("4) Chiusura della connessione con il server");
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName
    }

}
