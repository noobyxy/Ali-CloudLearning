package dao.UserDaoImpl;

import Bean.User;
import Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements dao.UserDao{
    @Override
    public void addUser(User user) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement("INSERT INTO t_user(name,email,password) VALUES (?,?,?)");
            ps.setString(1,user.getName());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());
            ps.execute();
//            System.out.println(user.getPassword());
//            System.out.println(user.getEmail());
//            System.out.println(user.getName());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加失败");
        }
    }

    @Override
    public User findUserByNameAndPassword(User user) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement("select * from t_user where name=? and password=?");
            ps.setString(1, user.getName());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(1);
                u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setEmail(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public User findUserByEmailAndPassword(User user) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            //System.out.println(user.getEmail());
            con = DBUtil.getConnection();
            ps = con.prepareStatement("select * from t_user where email=? and password=?");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            //System.out.println(user.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

    @Override
    public User findUserByName(User user) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        try {
            //System.out.println(user.getEmail());
            con = DBUtil.getConnection();
            ps = con.prepareStatement("select * from t_user where name=?");
            ps.setString(1, user.getName());
            //System.out.println(user.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setPassword(rs.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }
}
