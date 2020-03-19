package Service;

import Bean.User;

public interface UserService {
    /**
     * 添加用户信息
     *
     */
    public User findUserByEmailAndPassword(User user) throws Exception;
    public User findUserByNameAndPassword(User user) throws Exception;
    public User findUserByName(User user) throws Exception;
    public void addUser(User user) throws Exception;
}
