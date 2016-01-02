package net.meraComputer.spring.service;

import net.meraComputer.spring.model.UserAccount;

/**
 * Created by Nagendra on 01-01-2016.
 */
public interface UserService {

    void saveUser(UserAccount user);

    UserAccount findUser(String userName, String password);

    UserAccount findByUserName(String username);
}
