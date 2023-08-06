package singleresponsibility.bad;

import singleresponsibility.User;
import singleresponsibility.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(User user) {
        // save the user into database.
        sendEmail();
    }

    /**
     * This method should not be part of this class,
     * this will violate the Single Responsibility Principle,
     * as the UserServiceImpl is responsible only for doing user operations.
     */
    private void sendEmail() {
        // sending and email to the user.
    }

}
