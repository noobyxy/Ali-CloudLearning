package dao;

import Bean.User;

public interface UserDao {
    public void addUser(User user) throws Exception;
    public User findUserByNameAndPassword(User user) throws Exception;
    public User findUserByEmailAndPassword(User user) throws Exception;
    public User findUserByName(User user) throws Exception;
}