/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com_unicast;

/**
 *
 * @author studente
 */
public class Server {
    ServerSocket serverSocket;
    Socket clientSocket;
    int invia;
    
    public Server(int porta){
        this.porta = porta;
        try {
            serverSocket = new serverSocket(porta);
            System.out.println("Il server è in ascolto");
        } catch(){
            
        }
        
        public Socket attend(){
            try{
                clientSocket = serverSocket.accept();
                System.out.println("2) connessione ");
            } catch(IOException)
        }
        
        public void invia(){
            
        }
        
        public void
    }
}
