package singleresponsibility.good;

import singleresponsibility.User;
import singleresponsibility.UserService;

public class UserServiceImp implements UserService {

    private EmailSender emailSender;

    @Override
    public void registerUser(User user) {
        // save the user into database.

        // sending email
        emailSender.sendEmail(user.getEmail(), "welcome...", "Congrats");
    }

}
