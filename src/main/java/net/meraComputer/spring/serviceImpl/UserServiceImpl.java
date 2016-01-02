package net.meraComputer.spring.serviceImpl;

import net.meraComputer.spring.dao.UserDao;
import net.meraComputer.spring.model.UserAccount;
import net.meraComputer.spring.service.UserService;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Nagendra on 01-01-2016.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Required
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void saveUser(UserAccount user) {
        userDao.saveUser(user);
    }

    @Override
    public UserAccount findUser(String userName, String password) {
        return userDao.findUser(userName, password);
    }

    @Override
    public UserAccount findByUserName(String username) {
        return userDao.findByUserName(username);
    }
}
