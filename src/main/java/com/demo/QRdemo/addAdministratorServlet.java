package com.demo.QRdemo;
import lombok.SneakyThrows;
import org.com.fisco.QR;
import org.com.fisco.sol;
import org.fisco.bcos.sdk.transaction.model.exception.ContractException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class addAdministratorServlet extends HttpServlet{
    @SneakyThrows
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String QRHash = req.getParameter("QRHash");
        QR qrsol = null;
        try {
            qrsol = sol.initSol(QRHash);
        }catch (ContractException e){}
        String res = sol.addAdministrator(qrsol);

//        设置回传
        Writer writer = resp.getWriter();
        writer.write(res);
    }
}
