/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.narayanatutorial.email;

import java.util.Properties;
import javax.mail.Session;
import javax.mail.Store;

/**
 *
 * @author rbns
 */
public class BounceServerConnection {

    public static void main(String args[]) {
        String Bounce_Server_Username = "";
        String Bounce_Server_Password = "";
        String Bounce_Server_Server_Ip = "";
        int Bounce_Server_Port = 110;
        String Server_Type="pop3";
        try {
            Session session = Session.getDefaultInstance(new Properties());
            Store store = session.getStore(Server_Type);
            store.connect(Bounce_Server_Server_Ip, Bounce_Server_Username, Bounce_Server_Password);
        } catch (Exception e) {
            System.out.println("Bounce Server not connected....");
            e.printStackTrace();
        }

    }
}
