package chucnang;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class xulyEmail {
    public static void sendMail() {
        String host = "smtp.gmail.com";
        final String user = "thuvienhanoi97@gmail.com";// change accordingly
        final String password = "lxnx syzz smac vjvv";// change accordingly

        String to = "quannghiem100@gmail.com";// change accordingly

        // Get the session object
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(user, password);
                    }
                });
        session.setDebug(true);
        // Compose the message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Thư viện hà nội");
            message.setText("Thư viện hà nội");

            // send the message

            Transport.send(message);

            System.out.println("thư viện hà nội");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
