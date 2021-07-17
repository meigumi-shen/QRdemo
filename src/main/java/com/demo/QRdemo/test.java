package com.demo.QRdemo;

import org.com.fisco.QR;
import org.com.fisco.sol;
import org.fisco.bcos.sdk.transaction.model.exception.ContractException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "test", value = "/test")
public class test extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String contractHash = "megumi test";

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + contractHash + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}