package chucnang;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
import javax.activation.*;

public class xulyEmail {
    public static void sendMail(String recipient, String code) {
        String host = "smtp.gmail.com";
        final String user = "thuvienhanoi97@gmail.com";// change accordingly
        final String password = "lxnx syzz smac vjvv";// change accordingly

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
            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(recipient)); 
            message.setSubject("Thư viện hà nội", "UTF-8");
            message.setText("Thư viện hà nội gửi mã xác nhận đổi mật khẩu: " + code, "UTF-8");

            // send the message

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Ma đoi mat khau đa đuoc gui vao email xin vui lòng kiểm tra! ");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
