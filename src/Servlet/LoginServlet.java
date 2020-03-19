package Servlet;

import Bean.User;
import Service.UserService;
import Service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        User user = new User();
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));

        UserService us = new UserServiceImpl();

        try {
            User u = us.findUserByEmailAndPassword(user);
            if (u != null) {
                req.getSession().setAttribute("user",u);
                req.getRequestDispatcher("/submit.jsp").forward(req,resp);
            } else {
                req.setAttribute("msg","用户名或密码不正确");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
