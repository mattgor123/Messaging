/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messaging;

public class Messaging
{   
        
    
    public static void main(String[] args) throws Exception {
        
        String username = "testuser1";
        String password = "testuser1pass";
        
        XmppManager xmppManager = new XmppManager("myserver", 5222);
        
        xmppManager.init();
        xmppManager.performLogin(username, password);
        xmppManager.setStatus(true, "Hello everyone");
        
        String buddyJID = "testuser2";
        String buddyName = "testuser2";
        xmppManager.createEntry(buddyJID, buddyName);
        
        xmppManager.sendMessage("Hello mate", "testuser2@myserver");
        
        boolean isRunning = true;
        
        while (isRunning) {
            Thread.sleep(50);
        }
        
        xmppManager.destroy();
        
    }

}

   
/**       
        }
    }
        
     * @param args the command line arguments
     * fabio
     
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sup Nick? Time to build a badass app.");
        System.out.println("Yup, let's do it.");
    }
    
}
*/
