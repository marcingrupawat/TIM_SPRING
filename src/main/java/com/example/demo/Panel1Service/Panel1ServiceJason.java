package com.example.demo.Panel1Service;
import com.google.gson.Gson;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("RandomJason")
public class Panel1ServiceJason {

    protected Map<String, String> map = new HashMap();
    private JSONObject jasonObject = new JSONObject();

       public JSONObject StringListJason1 (){

        int number;

        Random generator = new Random();

        for (int i=0;i<10;i++) {
            number = generator.nextInt(100);


            map.put("ID",String.valueOf(i));
            map.put("NUMBER",String.valueOf(number));
        }
            jasonObject=new JSONObject(map);


        return jasonObject;
    }

    public String List2() {

        int number;
        Random generator = new Random();

        Gson gson = new Gson();

        List<Numbers> list = new ArrayList<Numbers>();

        // Defining 2 Product Object


        for (int i = 1; i < 11; i++) {
            Numbers p1 = new Numbers();
            number = generator.nextInt(100);
            p1.setIdNumber(i);
            p1.setNumber(number);
            list.add(p1);


        }


        // Covert List to Json

        return gson.toJson(list);
        }
}


