package com.example.demo.Panel1Service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@Service("RandomJason")
public class Panel1ServiceJason {

    protected Map<String, String> map = new HashMap();
    private JSONObject jasonObject = new JSONObject();

       public JSONObject StringListJason1 (){

        int number;

        Random generator = new Random();

        for (int i=0;i<10;i++) {
            number = generator.nextInt(100);
            //jasonObject.put("ID",String.valueOf(i));
           // jasonObject.put("NUMBER",String.valueOf(number));

            map.put("ID",String.valueOf(i));
            map.put("NUMBER",String.valueOf(number));
        }
            jasonObject=new JSONObject(map);


        return jasonObject;
    }

}
