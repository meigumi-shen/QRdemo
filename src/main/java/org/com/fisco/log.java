package org.com.fisco;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.fisco.bcos.sdk.client.Client;
import org.fisco.bcos.sdk.model.TransactionReceipt;

public class log {

    public static void txReceiptLog(TransactionReceipt txRec){

        System.out.println(util.getDateString() + "-|-" + txRec.toString());

    }
    public static void blockLog(){
        Client client = sol.initClient();
        System.out.println(util.getDateString() + client.getBlockNumber());
    }

    public static void log4jTest(){
        Logger logger = Logger.getLogger(QR.class);
        BasicConfigurator.configure();
    };
}
