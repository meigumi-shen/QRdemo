package com.demo.QRdemo;

import lombok.SneakyThrows;
import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.com.fisco.QR;
import org.com.fisco.sol;
import org.fisco.bcos.sdk.transaction.model.exception.ContractException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


@WebServlet(name = "deployNewContract", value = "/deployNewContract")
public class deployNewContract extends HttpServlet {
    @SneakyThrows
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        QR qrsol = null;

        String contractHash = "";
        try {
            qrsol = sol.initSol();
            contractHash = qrsol.getContractAddress();
        }catch (ContractException e){
            contractHash = e.getMessage();
        }

        int length = contractHash.length();
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + contractHash + "</h1>");
        out.println("<h1>" + "test" + "</h1>");
        out.println("<h1>" + "hash length is " + length + "</h1>");
        out.println("</body></html>");
//        Writer writer = resp.getWriter();
//        writer.write(contractHash);

    }
}
