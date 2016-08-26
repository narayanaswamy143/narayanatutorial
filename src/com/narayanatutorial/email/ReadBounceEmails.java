/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.narayanatutorial.email;

import java.util.Properties;
import javax.mail.Address;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author rbns
 */
public class ReadBounceEmails {

    public static void main(String args[]) {
        String Bounce_Server_Username = "";
        String Bounce_Server_Password = "";
        String Bounce_Server_Server_Ip = "";
        int Bounce_Server_Port = 110;
        String Server_Type = "pop3";
        String inbox = "INBOX";
        Store store = null;
        try {
            Session session = Session.getDefaultInstance(new Properties());
            store = session.getStore(Server_Type);
            store.connect(Bounce_Server_Server_Ip, Bounce_Server_Username, Bounce_Server_Password);
        } catch (Exception e) {
            System.out.println("Bounce Server not connected...." + e);
        }
        try {
            Folder folder = store.getFolder(inbox);
            folder.open(Folder.READ_WRITE);
            int inboxCount = folder.getMessageCount(); /*check inbox emails count*/
            System.out.println("Total Number of bounced emails:" + inboxCount);

            Message[] totalEmailMsg = folder.getMessages();
            System.out.println("Total Number of bounced emails:" + totalEmailMsg);
            for (Message emailBody : totalEmailMsg) {
                Address FromEmailIdList[] = emailBody.getFrom();
                String FromEmail = FromEmailIdList[0].toString();
                    System.out.println("FromEmail:"+FromEmail);
                String EmailSubject = emailBody.getSubject();
                    System.out.println("EmailSubject:"+EmailSubject);
                MimeMessage mimeMsg = (MimeMessage) emailBody;
                
            }

        } catch (Exception e) {
            System.out.println("Inbox connection error." + e);
        }

    }
}
