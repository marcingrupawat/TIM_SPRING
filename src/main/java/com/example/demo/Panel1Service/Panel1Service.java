package com.example.demo.Panel1Service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.String.*;

@Service("Random")
public class Panel1Service {

    public List<Integer> listList = new ArrayList<Integer>();
    JSONObject jasonObject = new JSONObject();
    List<JSONObject> jasonList = new ArrayList<JSONObject>();

    public String StringList(){
        listList.clear();
        String listString="";
        int number;

        Random generator = new Random();

        for (int i=0;i<10;i++) {
            number = generator.nextInt(100);
            listList.add(number);
            listString = listString +" "+ String.valueOf(number);
            jasonObject.put("ID",i);
            jasonObject.put("NUMBER",number);
            jasonList.add(jasonObject);
        }
        return listString;
    }
}
