/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com_unicast;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author studente
 */
public class Client {
    String nome;
    String colore;
    Socket socket;
    
    public Socket(String nome){
        this.nome=nome;
    }
    
    public void connetti(String nomeServer, int porta){
        try {
            socket = new Socket(nomeServer, porta);
            System.out.println("La connessione è avvenuta con successo");
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
