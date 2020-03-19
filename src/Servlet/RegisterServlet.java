package Servlet;

import Bean.User;
import Service.UserService;
import Service.impl.UserServiceImpl;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        User user = new User();
        user.setName(req.getParameter("name"));
        user.setPassword(req.getParameter("password"));
        user.setEmail(req.getParameter("email"));

        UserService userService = new UserServiceImpl();

        try {
            User u = userService.findUserByName(user);
            if (u != null) {
                resp.getWriter().write("用户名已被占用，请重新注册");
                resp.setHeader("refresh","1;url=" + req.getContextPath() + "/register.jsp");
            } else {
                userService.addUser(user);
                resp.getWriter().write("注册成功，请重新登陆");
                resp.setHeader("refresh","1;url=" + req.getContextPath() + "/login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
