package com.abiyus.levelmoney.cc.txn;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONObject;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;
import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Created by afetene on 12/20/16.
 */
public class App {
  public static void main(String[] args) throws IOException{
    TransactionManager txnManager = TransactionManager.getInstance();
    txnManager.setArguments(args);
    JSONObject jsonObject = txnManager.getAllTransactions();
    System.out.println("Transaction Summary: " + jsonObject.toString(4));
  }
}
