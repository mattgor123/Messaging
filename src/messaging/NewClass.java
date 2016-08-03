/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.ConnectionConfiguration.SecurityMode;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.AbstractXMPPConnection;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.jivesoftware.smack.tcp.TCPInitializer;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.AbstractXMPPConnection;




//public class XmppManager {
//    private static final int packetReplyTimeout = 500; //millis
//        
//    private String server;
//    private int port;
//    
//    private ConnectionConfiguraion config;
//    private ChatManager chatManager;
//    private MessageListener messageListener;
//    
//    public XmppManager (String server, int port) {
//        this.server = server;
//        this.port = port;
//    }
//
//    public void init() throws XMPPException {
//        
//        System.out.println(String.format("Initializing connection to "
//                + "server %1$s port %2$d", server, port));
//        
//        //Smack.ConnectionConfiguration.setPacketReplyTimeout(packetReplyTimeout);
//        
//                //Create a connection to the jabber.org server.
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
////        config = new ConnectionConfiguration(server, port);
////        config.setSASlAuthenticationEnabled(false);
////        config.setSecurityMode(SecurityMode.disabled);
//        
//        connection = new XMPPConnection(config);
//        connection.connect();
//        
//        System.out.println("Connected: " + connection.isConnected());
//        
//        chatManager = connection.getChatManager();
//        messageListener = new MyMessageListener();
//        
//    }
//    
//    public void performLogin(String Username, String password); 
//        throw XMPPException {
//        if (connection!=null && connection.isConnected()) {
//            connection.login(username, password);
//        }
//    }
//    
//    public void setStatus(boolean available, string status) {
//        
//        Presence presence = new Presence(Presence.Type.unavailable);
//        presence.setStatus("Gone fishing");
//        
//        
////        presence.setStatus(status);
////        connection.sendPacket(presence);
//        
//    }
//    
//    class MyMessageListener implements MessageListener {
//        
//        @Override
//        public void processMessage(Chat chat, Message message) {
//            String from  = message.getFrom();
//            String body = message.getBody();
//            System.out.println(String.format("Received message '%1$s' from %2$s", body, from));
//        
//        }
//    }
//    
//}


//RE-Build
public class FabioXmppManager {
    private static final int packetReplyTimeout = 500; //millis
        
    private String server;
    private int port;
    
//    private XMPPTCPConnectionConfiguraion config;
//    private ChatManager chatManager;
    private MessageListener messageListener;
    
    public FabioXmppManager (String server, int port) {
        this.server = server;
        this.port = port;
    }

    public void init() throws XMPPException {
        
        System.out.println(String.format("Initializing connection to "
                + "server %1$s port %2$d", server, port));
        
        //Smack.ConnectionConfiguration.setPacketReplyTimeout(packetReplyTimeout);
        
                //Create a connection to the jabber.org server.
        AbstractXMPPConnection conn1 = new XMPPTCPConnectionConfiguration.builder();
        conn1.connect();
                
                //Create a connection to the jabber.org server on a specified port.
        XMPPTCPConnectionConfiguration config = XMPPTCPConnectionConfiguration.builder()
            .setUsernameAndPassword("username", "password")
            .setServiceName("jabber.org")
            .setHost("ar.jabber.org")
            .setPort(8222)
            .build();
        
        AbstractXMPPConnection conn2 = **new** XMPPTConnection(config);
        Conn2.connect();
        
//        config = new ConnectionConfiguration(server, port);
//        config.setSASlAuthenticationEnabled(false);
//        config.setSecurityMode(SecurityMode.disabled);
        
        connection = new XMPPConnection(config);
        connection.connect();
        
        System.out.println("Connected: " + connection.isConnected());
        
        chatManager = connection.getChatManager();
        messageListener = new MyMessageListener();
        
    }
    
    public void performLogin(String Username, String password); 
        throw XMPPException {
        if (connection!=null && connection.isConnected()) {
            connection.login(username, password);
        }
    }
    
    public void setStatus(boolean available, string status) {
        
        Presence presence = new Presence(Presence.Type.unavailable);
        presence.setStatus(status);
        
    }
    
    class FabioMessageListener implements MessageListener {
        
        @Override
        public void processMessage(Chat chat, Message message) {
            String from  = message.getFrom();
            String body = message.getBody();
            System.out.println(String.format("Received message '%1$s' from %2$s", body, from));
        
        }
    }
    
}


