package singleresponsibility.good;

public interface EmailSender {

    void sendEmail(String to, String subject, String body);

}
