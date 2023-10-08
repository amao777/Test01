package com.demo.apitest.util;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.HashMap;

public class TestUtil {

    public static HashMap<String,String> doGet(String url){
        HashMap<String,String> result=new HashMap<String,String>();

        CloseableHttpClient client= HttpClients.createDefault();

        HttpGet get=new HttpGet(url);

        return result;
    }


}
