/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */


public class server2 implements Runnable{
private Thread mainThread;
private int port;
private ServerSocket socketServer;
private Socket socket;
//private InputStream input;
//private OutputStream output;



    @Override
    public void run() {
    try {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        socketServer =new ServerSocket(port);
       socketServer.setSoTimeout(10000);
        
       while(true){
           System.out.println("Waiting for the client on port "+socketServer.getLocalPort()+ " ...");
           socketServer.accept();
           DataInputStream in = new DataInputStream(socket.getInputStream());
           DataOutputStream out = new DataOutputStream(socket.getOutputStream());
           socket.close();
       }
        
    } catch (IOException ex) {
        Logger.getLogger(server2.class.getName()).log(Level.SEVERE, null, ex);
    }
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(server2.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
        
    }
    public void setPort(int p){
    port = p;
    }
    
    
    
    public void start(){
    mainThread = new Thread(this);
    mainThread.start();  
}
    
}
