/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server1;

/**
 *
 * @author HP
 */
public class Server1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0;i<8;i++){
        server2 s = new  server2();
        s.start();
        System.out.println("server1");}
    }
    
}
