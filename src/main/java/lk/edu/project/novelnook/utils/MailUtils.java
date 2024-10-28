package lk.edu.project.novelnook.utils;

import java.util.Properties;

public class MailUtils {
    public static void sendMail(String reciver) {

        Properties prop = new Properties();

        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");

    }
}
