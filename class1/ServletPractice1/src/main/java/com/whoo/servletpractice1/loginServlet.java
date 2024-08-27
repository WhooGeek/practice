package com.whoo.servletpractice1;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.getWriter().println(" <form action=\"login\" method=\"post\">\n" +
                "        <label>아이디 : </label><input type=\"text\" name=\"name\">\n" +
                "        <br>\n" +
                "        <label>비밀번호 : </label><input type=\"text\" name=\"password\">\n" +
                "        <br>\n" +
                "        <input type=\"submit\" value=\"로그인\">\n" +
                "    </form>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = (String) req.getParameter("name");
        String password = (String) req.getParameter("password");

        if ("name".equals(name) && "pass".equals(password)) {
            resp.setContentType("text/html; charset=UTF-8");
            resp.getWriter().println("로그인 성공");
        } else {
            resp.setContentType("text/html; charset=UTF-8");
            resp.getWriter().println("로그인 실패");
            System.out.println(name);
            System.out.println(password);
        }
    }
}
