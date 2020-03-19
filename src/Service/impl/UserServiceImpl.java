package Service.impl;

import Bean.User;
import Service.UserService;
import dao.UserDao;
import dao.UserDaoImpl.UserDaoImpl;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void addUser(User user) throws Exception {
        userDao.addUser(user);
    }

    @Override
    public User findUserByNameAndPassword(User user) throws Exception {
        return userDao.findUserByNameAndPassword(user);
    }

    @Override
    public User findUserByEmailAndPassword(User user) throws Exception {
        return userDao.findUserByEmailAndPassword(user);
    }

    @Override
    public User findUserByName(User user) throws Exception {
        return userDao.findUserByName(user);
    }
}
