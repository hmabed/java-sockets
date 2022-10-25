/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hmabed
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
    byte addr[]={72, 3, 2, 12}; 
    InetAddress host = InetAddress.getByAddress(addr);
    System.out.println(host);
    final Runnable task = () -> {
        System.out.println("exécuté toutes les secondes");
    };
         
    final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(task, 0, 10, TimeUnit.SECONDS);
 
    }
    
}
