/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andrvtl
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client c = new Client("localhost");
        c.connetti("localhost",2000);
    }

}
