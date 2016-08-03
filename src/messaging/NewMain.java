/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messaging;

import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;


/**
 *
 * @author nicoglass
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        String username = "testuser1";
        String password = "testuser1pass";
        
        FabioXmppManager fabioManager = new fabioManager("myserver", 5222);
        
        fabioManager.init() 
        fabioManager.performLogin(username, password);
        fabioManager.setStatus(true, "Hello everyone");
              
        String buddyJID = "testuser2";
        String buddyName = "testuser2";
        fabioManager.createEntry(buddyJID, buddyName);
        
        fabioManager.sendMessage("This is fabio", "testuser2@myserver");
        
        boolean isRunning = true;
        
        while (isRunning) {
            Thread.sleep(50);
        }
        
        fabioManager.destroy();
        
    }
    
}
        
        
//        //Create a connection to the jabber.org server.
//        AbstractXMPPConnection conn1 = **new** XMPPTCPConnectionConfiguration.builder()
//        conn1.connect();
//                
//                //Create a connection to the jabber.org server on a specified port.
//        XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
//            .setUsernameAndPassword("username", "password")
//            .setServiceName("jabber.org")
//            .setHost("ar.jabber.org")
//            .setPort(8222)
//            .build();
//        
//        AbstractXMPPConnection conn2 = **new** XMPPTConnection(config);
//        Conn2.connect();
//        
//        // Create a new presence. Pass in false to indicate we're unavailable._
//        Presence presence = new Presence(Presence.Type.unavailable);
//        presence.setStatus("Gone fishing");
//        // Send the packet (assume we have an XMPPConnection instance called "con").
//        con.sendStanza(presence);
